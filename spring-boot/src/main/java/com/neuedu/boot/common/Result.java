package com.neuedu.boot.common;

import com.alibaba.fastjson.JSONObject;

public class Result<T> {
    public int code;
    private String msg;
    private T data;

    public int getCode() {
        return code;
    }
    public Result<T> setCode(int code) {
        this.code = code;
        return this;
    }
    public String getMsg() {
        return msg;
    }
    public Result<T> setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public T getData() {
        return data;
    }
    public  Result<T> setData(T data) {
        this.data = data;
        return this;
    }

    public static Result ok(String msg){
        Result  result = new Result();
        result.setCode(0);
        result.setMsg(msg);
        return result;
    }
    public static <T> Result ok(T data){
        Result  result = new Result();
        result.setCode(0);
        result.setMsg("ok");
        result.setData(data);
        return result;
    }
    public static Result fail(String msg){
        Result  result = new Result();
        result.setCode(11);
        result.setMsg(msg);
        return result;
    }

    @Override
    public  String  toString(){
        return JSONObject.toJSONString(this);
    }
}
