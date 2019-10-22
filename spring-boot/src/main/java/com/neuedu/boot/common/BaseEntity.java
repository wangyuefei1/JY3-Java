package com.neuedu.boot.common;

import lombok.Data;

import javax.persistence.Id;
import java.time.LocalDate;

@Data
public class BaseEntity {
    @Id
    private Integer id;
    private LocalDate createTime;
    private LocalDate updateTime;
}
