package com.zhongyu.commons.exception;


import com.zhongyu.commons.enums.ResultEnum;

/**
 * Created by ZhongYu on 3/25/2017.
 */
public class WarnException extends RuntimeException {

    private Integer code;

    public WarnException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

}
