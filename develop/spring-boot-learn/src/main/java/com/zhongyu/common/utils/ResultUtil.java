package com.zhongyu.common.utils;

import com.zhongyu.common.bean.Result;
import com.zhongyu.enums.ResultEnum;

/**
 * Created by ZhongYu on 3/15/2017.
 */
public class ResultUtil {

    public static Result success(ResultEnum failed) {
        Result result = new Result();
        result.setCode(failed.getCode());
        result.setMessage(failed.getMessage());
        return result;
    }

    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(0);
        result.setMessage("成功");
        result.setData(object);
        return result;
    }

    public static Result failed(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMessage(msg);
        return result;
    }

    public static Result failed(ResultEnum failed) {
        Result result = new Result();
        result.setCode(failed.getCode());
        result.setMessage(failed.getMessage());
        return result;
    }
}
