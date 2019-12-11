package com.qf.home.common.vo;

import com.qf.home.common.result.ResultCode;
import lombok.Data;

/**
 * @program: home
 * @description: 统一返回前端的数据类型为R
 * @author: group7
 * @create: 2019-12-10 11:03
 */

@Data
public class R {
    //结果码
    private int code;
    //字符串
    private String msg;
    //携带数据
    private Object data;

    public static R setR(int code,String msg,Object data){
        R r=new R();

        r.setCode(code);
        r.setData(data);
        r.setMsg(msg);
        return r;
    }
    public static R Ok(Object data){

        return setR(ResultCode.OK.getVal(),"OK",data);
    }
    public static R Ok(){

        return setR(ResultCode.OK.getVal(),"OK",null);
    }
    public static R fail(){
        return setR(ResultCode.ERROR.getVal(),"Error",null);
    }
    public static R fail(String msg){

        return setR(ResultCode.ERROR.getVal(),msg,null);
    }

}
