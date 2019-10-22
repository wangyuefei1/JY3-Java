package com.neuedu.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import org.springframework.stereotype.Component;

/*
* 高复用对象
* */
@Data
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class HigherResponse<T> {
    private Integer status;

    private String msg;

    private T   data;

    public HigherResponse(){

    }

    public HigherResponse(Integer status){
        this.status = status;
    }
    public HigherResponse(Integer status, String msg){
        this.msg = msg;
        this.status=status;
    }
    public HigherResponse(Integer status, T t){
        this.data = t;
        this.status=status;
    }
    public HigherResponse(Integer status, T t,String msg){
        this.data = t;
        this.status=status;
        this.msg = msg;
    }

    /**
     * 提供对外公开的方法
     * */
    @JsonIgnore
    public boolean isResponseSuccess(){
        return this.status == StatusUtil.SUCCESSSTATUS;
    }

    public static  HigherResponse getResponseSuccess(){
        return new HigherResponse(StatusUtil.SUCCESSSTATUS);
    }
    public static HigherResponse getResponseSuccess(String msg){
        return new HigherResponse(StatusUtil.SUCCESSSTATUS,msg);
    }
    public static <T> HigherResponse getResponseSuccess(T t){
        return new HigherResponse(StatusUtil.SUCCESSSTATUS,t);
    }
    public static <T> HigherResponse getResponseSuccess(T t,String msg){
        return new HigherResponse(StatusUtil.SUCCESSSTATUS,t,msg);
    }

    @JsonIgnore
    public boolean isResponseFailed(){
        return this.status == StatusUtil.FAILEDSTATUS;
    }
    public static  HigherResponse getResponseFailed() {
        return new HigherResponse(StatusUtil.FAILEDSTATUS);
    }
    public static HigherResponse getResponseFailed(String msg){
        return new HigherResponse(StatusUtil.FAILEDSTATUS,msg);
    }

}
