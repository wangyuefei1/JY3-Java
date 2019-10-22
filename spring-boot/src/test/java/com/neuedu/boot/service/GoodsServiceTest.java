package com.neuedu.boot.service;

import com.alibaba.fastjson.JSONArray;
import com.neuedu.boot.common.Page;
import com.neuedu.boot.entity.Goods;
import com.neuedu.boot.request.Pagerequest;
import com.neuedu.boot.vo.GoodsCateVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class GoodsServiceTest {

    @Autowired
    private GoodsService goodsService;

    @Test
    public void add() {
        for (int i = 0; i < 20; i++) {
            Goods goods = new Goods();
            goods.setName("华为"+i);
            goods.setPrice(new BigDecimal("100").multiply(new BigDecimal(i+1)));
            Random random = new Random();
            goods.setStock(10*(random.nextInt(10)+1));
            goods.setStatus((byte)0);
            goodsService.add(goods);
        }
    }

    @Test
    public void getList() {
        Pagerequest pagerequest = new Pagerequest();
        pagerequest.setCurrentPage(2);
        pagerequest.setPageSize(10);
        Page<GoodsCateVO> list = goodsService.getList(pagerequest);
        log.info(JSONArray.toJSONString(list));
    }
}