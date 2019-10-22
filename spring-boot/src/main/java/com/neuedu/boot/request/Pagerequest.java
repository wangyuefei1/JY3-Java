package com.neuedu.boot.request;

import lombok.Data;

@Data
public class Pagerequest {
    private Integer currentPage;
    private Integer pageSize;
}
