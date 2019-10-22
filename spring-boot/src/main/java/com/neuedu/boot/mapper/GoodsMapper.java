package com.neuedu.boot.mapper;

import com.neuedu.boot.entity.Goods;
import com.neuedu.boot.vo.GoodsCateVO;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
@org.apache.ibatis.annotations.Mapper
public interface GoodsMapper extends Mapper<Goods> {

    List<GoodsCateVO> getList();
}
