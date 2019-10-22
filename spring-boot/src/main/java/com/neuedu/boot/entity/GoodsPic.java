package com.neuedu.boot.entity;

import com.neuedu.boot.common.BaseEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "goods_pic")
public class GoodsPic   extends BaseEntity {
    @Column(name = "pic_path")
    private String picPath;
    @Column(name = "pic_type")
    private String picType;
}
