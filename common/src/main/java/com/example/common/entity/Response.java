package com.example.common.entity;

import com.example.common.common.GlobalException;
import lombok.Data;

@Data
public class Response<T> {

    private boolean success;

    private Integer errCode;

    private String msg;

    private T data;

    private Response(T data){
        success = true;
        this.data = data;
    }

    private Response(T data, String msg){

    }

    private Response(Integer errCode, String msg){

    }
    public static <T> Response<T> success(T data){
        return new Response<T>(data);
    }

    public static <T> Response<T> success(T data, String msg){
        return new Response<T>(data, msg);
    }

    public static Response error(Integer errCode, String msg){
        return new Response(errCode, msg);
    }

    public static Response error(GlobalException exception){
        return new Response(exception.getErrCode(), exception.getMessage());
    }
}
