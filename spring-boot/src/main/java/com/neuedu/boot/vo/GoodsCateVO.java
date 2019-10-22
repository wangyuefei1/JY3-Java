package com.neuedu.boot.vo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class GoodsCateVO {
    private Integer id;
    private String name;
    private String categoryName;
    private Integer stock;
    private BigDecimal price;
    private Byte status;

}
