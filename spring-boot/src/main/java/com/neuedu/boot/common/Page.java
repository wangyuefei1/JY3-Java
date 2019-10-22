package com.neuedu.boot.common;

import com.github.pagehelper.PageInfo;
import lombok.Data;

import java.util.List;

@Data
public class Page<T> {
    private Long total;
    private Integer currentPage;
    private Integer pageSize;
    private List<T> data;
    public Page(PageInfo pageInfo, List<T> data){
        total=pageInfo.getTotal();
        currentPage=pageInfo.getPageNum();
        pageSize=pageInfo.getPageSize();
        this.data=data;
    }
}
