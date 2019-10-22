package com.neuedu.boot.service;

import com.neuedu.boot.common.Result;
import com.neuedu.boot.entity.GoodsPic;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;


public interface GoodsPicService {
    Result add(GoodsPic goodsPic);

    Result deletePic(String  picPath);
}
