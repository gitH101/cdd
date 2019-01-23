package com.example.common.common;

import lombok.Data;

@Data
public class GlobalException extends RuntimeException {

    private Integer errCode;



}
