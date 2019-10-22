package com.neuedu.boot.controller;

import com.neuedu.boot.common.Result;
import com.neuedu.boot.entity.Goods;
import com.neuedu.boot.entity.GoodsPic;
import com.neuedu.boot.mapper.GoodsPicMapper;
import com.neuedu.boot.service.GoodsPicService;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.UUID;

@RestController
@RequestMapping("/goodsPic")
@CrossOrigin
public class GoodsPicCon {
    @Value("${upload.path}")
    private String uploadFolder;
    @Autowired
    private GoodsPicService goodsPicService;

    @PostMapping("/goodsPics")
    public Result addPic(MultipartFile file){
        if (Objects.isNull(file)||file.isEmpty()){
            return Result.fail("重新上传");
        }
        try {
            byte[] bytes = file.getBytes();
            Resource resource = new ClassPathResource("/");
            String strPath = resource.getFile().getPath();
            String filename = file.getOriginalFilename();
            filename = UUID.randomUUID().toString().replace("-","")
                    +filename.substring(filename.indexOf("."));
            Path path = Paths.get(strPath +"/"+uploadFolder+"/"+ filename);
            if (!Files.isWritable(path)){
                Files.createDirectories(Paths.get(strPath+"/"+uploadFolder));
            }
            Files.write(path,bytes);
            GoodsPic goodsPic = new GoodsPic();
            goodsPic.setPicPath(filename);
            goodsPicService.add(goodsPic);
            return Result.ok(filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Result.fail("上传失败");
    }

    @DeleteMapping("{picpath}")
    public Result delete(@PathVariable("picpath") String picPath){
        return goodsPicService.deletePic(picPath);
    }

}
