package com.neuedu.boot.service;

import com.neuedu.boot.common.Result;
import com.neuedu.boot.entity.GoodsPic;
import com.neuedu.boot.mapper.GoodsMapper;
import com.neuedu.boot.mapper.GoodsPicMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.time.LocalDate;

@Service
public class GoodsPicServiceimpl implements GoodsPicService {
    @Autowired
    private GoodsPicMapper goodsPicMapper;

    @Override
    public Result add(GoodsPic goodsPic) {
        goodsPic.setPicType("1");
        goodsPic.setCreateTime(LocalDate.now());
        goodsPic.setUpdateTime(LocalDate.now());
        int i = goodsPicMapper.insertSelective(goodsPic);
        if (i>0){
            return Result.ok("添加成功");
        }
        return Result.fail("添加失败");
    }

    @Override
    public Result deletePic(String  picPath) {
        Example example = new Example(GoodsPic.class);
        example.and().andEqualTo("picPath",picPath);
        if(goodsPicMapper.deleteByExample(example)>0){
            return Result.ok("删除成功");
        }
        return Result.fail("删除失败");
    }
}
