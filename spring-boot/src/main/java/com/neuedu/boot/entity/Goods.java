package com.neuedu.boot.entity;

import com.neuedu.boot.common.BaseEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;
import java.math.BigDecimal;

@Data
@Table(name = "goods_goods")
public class Goods extends BaseEntity {

    private String name;
    @Column(name = "category_id")
    private Integer categoryId;
    private Integer stock;
    private String  pics;
    @Column(name = "price")
    private BigDecimal price;
    private Byte status;
}
