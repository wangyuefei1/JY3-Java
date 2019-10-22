package com.neuedu.boot.controller;

import com.neuedu.boot.common.Page;
import com.neuedu.boot.common.Result;
import com.neuedu.boot.entity.Category;
import com.neuedu.boot.entity.Goods;
import com.neuedu.boot.entity.GoodsPic;
import com.neuedu.boot.request.Pagerequest;
import com.neuedu.boot.service.GoodsService;
import com.neuedu.boot.vo.GoodsCateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/goods")
@CrossOrigin
public class GoodsCon {
    @Autowired
    private GoodsService goodsService;

    @PostMapping("getList.do")
    public Result getList(@RequestBody Pagerequest pagerequest){
        Page<GoodsCateVO> list = goodsService.getList(pagerequest);
        return Result.ok(list);
    }

    @PostMapping("add.do")
    public Result add(@RequestBody Goods goods){
        return goodsService.add(goods);
    }

    @PostMapping("delete.do")
    public Result delete(@RequestBody Goods goods){
        return goodsService.delete(goods);
    }

    @GetMapping("getgoods.do")
    public Result getgoods(){
        return  Result.ok(goodsService.getGoods());
    }
}
