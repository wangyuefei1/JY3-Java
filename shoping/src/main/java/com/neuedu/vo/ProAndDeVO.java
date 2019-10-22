package com.neuedu.vo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProAndDeVO {

    private  Integer id;
    private  Integer categoryId;
    private  Integer parentCategoryId;
    private  String  name;
    private  String  subTitle;
    private  String  imageHost;
    private  String  mainImage;
    private  String  subImage;
    private  String  detail;
    private  BigDecimal  price;
    private  Integer stock;
    private  Byte   status;
    private  String createTime;
    private  String updateTime;

}
