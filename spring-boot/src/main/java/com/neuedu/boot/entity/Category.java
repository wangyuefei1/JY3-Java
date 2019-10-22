package com.neuedu.boot.entity;

import com.neuedu.boot.common.BaseEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "goods_category")
public class Category extends BaseEntity {
    @Column(name = "category_name")
    private String name;
    @Column(name = "parent_id")
    private Integer parentId;
    private Integer level;

}
