package com.neuedu.boot.mapper;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.neuedu.boot.vo.GoodsCateVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class GoodsMapperTest {
    @Autowired
    private GoodsMapper goodsMapper;

    @Test
    public void getList() {
        PageHelper.startPage(2,3);
        List<GoodsCateVO> list = goodsMapper.getList();
        log.info(JSONArray.toJSONString(list));
    }
}