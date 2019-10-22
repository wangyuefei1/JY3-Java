package com.neuedu.boot.mapper;

import com.neuedu.boot.entity.Category;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface CategoryMapper extends tk.mybatis.mapper.common.Mapper<Category> {
}
