package com.example.common.enums;

import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.annotations.Param;

public enum  ExceptionEnum {

    PARAM_ERR(1001,"参数错误");

    @Getter
    @Setter
    private Integer code;

    @Getter
    @Setter
    private String msg;

    private ExceptionEnum(Integer code, String msg){
        this.code = code;
        this.msg = msg;
    }

}
