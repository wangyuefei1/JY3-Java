package com.neuedu.boot.entity;

import com.neuedu.boot.common.BaseEntity;
import lombok.Data;

import javax.persistence.Table;

@Data
@Table(name = "system_admin")
public class Admin extends BaseEntity {
    private String  username;
    private String  password;
}
