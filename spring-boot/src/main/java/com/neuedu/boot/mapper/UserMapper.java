package com.neuedu.boot.mapper;

import com.neuedu.boot.entity.User;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
@org.apache.ibatis.annotations.Mapper
public interface UserMapper extends Mapper<User> {
     List<User> getList();
}
