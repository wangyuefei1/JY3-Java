package com.neuedu.boot.service;

import com.alibaba.fastjson.JSONArray;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neuedu.boot.common.Page;
import com.neuedu.boot.common.Result;
import com.neuedu.boot.entity.Goods;
import com.neuedu.boot.mapper.GoodsMapper;
import com.neuedu.boot.request.Pagerequest;
import com.neuedu.boot.vo.GoodsCateVO;
import com.neuedu.boot.vo.GoodsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.entity.Example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Service
public class GoodsServiveimpl implements  GoodsService{
    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public Result add(Goods goods) {
        goods.setCreateTime(LocalDate.now());
        goods.setUpdateTime(LocalDate.now());
        goods.setStatus((byte)0);
        int i = goodsMapper.insertSelective(goods);
        if (i>0){
            return Result.ok(goods);
        }
        return Result.fail("添加失败");
    }

    @Override
    public Page<GoodsCateVO> getList(Pagerequest pagerequest) {
        PageHelper.startPage(pagerequest.getCurrentPage(),pagerequest.getPageSize());
        List<GoodsCateVO> goods = goodsMapper.getList();
        PageInfo<GoodsCateVO> pageInfo = new PageInfo<>(goods);
        Page<GoodsCateVO> objectPage = new Page<>(pageInfo,goods);
        return objectPage;
    }

    @Override
    public Result delete(Goods goods) {
        int delete = goodsMapper.delete(goods);
        if (delete>0){
            return  Result.ok("删除成功");
        }
        return Result.fail("删除失败");
    }

    @Override
    public List<GoodsVO> getGoods() {
        Example example = new Example(Goods.class);
        example.and().andEqualTo("first",1);
        List<Goods> goods = goodsMapper.selectByExample(example);
        List<GoodsVO> list = new ArrayList<>();
        for (Goods goods1:goods) {
            GoodsVO goodsVO = new GoodsVO();
            goodsVO.setId(goods1.getId());
            if (!StringUtils.isEmpty(goods1.getPics())){
                List<String> pics = JSONArray.parseArray(goods1.getPics(),String.class);
                goodsVO.setPicPath(pics.get(0));
            }
            list.add(goodsVO);
        }
        return list;
    }
}
