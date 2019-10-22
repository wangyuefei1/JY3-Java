package com.neuedu.vo;

import com.sun.javafx.image.impl.ByteBgraPre;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProListVO {

    private Integer id;
    private Integer categoryId;
    private String  name;
    private String  subTitle;
    private String  mainImage;
    private Byte    status;
    private BigDecimal price;
}
