package com.neuedu.boot.entity;

import com.neuedu.boot.common.BaseEntity;
import lombok.Data;

import javax.persistence.Table;

@Data
@Table(name = "user_user")
public class User extends BaseEntity {
    private String username;
    private String realname;
    private String phone;
    private Integer status;
}
