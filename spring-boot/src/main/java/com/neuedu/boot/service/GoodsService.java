package com.neuedu.boot.service;

import com.neuedu.boot.common.Page;
import com.neuedu.boot.common.Result;
import com.neuedu.boot.entity.Goods;
import com.neuedu.boot.request.Pagerequest;
import com.neuedu.boot.vo.GoodsCateVO;
import com.neuedu.boot.vo.GoodsVO;

import java.util.List;


public interface GoodsService {

    Result add(Goods goods);

    Page<GoodsCateVO> getList(Pagerequest pagerequest);

    Result delete(Goods goods);

    List<GoodsVO>  getGoods();
}
