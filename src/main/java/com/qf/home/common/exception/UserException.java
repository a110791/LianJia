package com.qf.home.common.exception;

/**
 * @program: home
 * @description: 登录注册异常 自定义异常
 * @author: group7
 * @create: 2019-12-10 09:48
 */
public class UserException extends Exception {
    public UserException(){
        super();
    }
    public UserException(String msg){
        super(msg);
    }
}
