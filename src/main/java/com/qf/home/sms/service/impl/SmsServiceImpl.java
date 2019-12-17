package com.qf.home.sms.service.impl;

import com.qf.home.common.vo.R;
import com.qf.home.sms.service.SmsService;
import com.qf.home.util.AliSmsUtil;
import com.qf.home.util.JedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SmsServiceImpl implements SmsService {

    @Autowired
    private JedisUtil jedisUtil;

    /**
     * 发送验证码
     * @param phone 手机号
     * @return 返回验证码
     */
    @Override
    public R sendCode(String phone) {
        //判断验证码是否失效
        if (jedisUtil.getStr(phone) != null) {
            //没失效 直接返回
            return R.Ok(jedisUtil.getStr(phone));
        }else {
            //失效了，重新发送
            AliSmsUtil.sendSmsCode(phone,code());
        }
        //写入数据库
        jedisUtil.addStr(phone,code() + "",63);
        //返回验证码
        return R.Ok(code());
    }
    /**
     * 校验短信验证码
     * @param phone 手机号
     * @param code 验证码
     * @return 验证结果
     */
    @Override
    public R verifyCode(String phone,String code) {
        //判断验证码是否存在
        if (jedisUtil.getStr(phone) != null && jedisUtil.getStr(phone).equals(code)) {
            return R.Ok();
        }
        return R.fail("验证码错误");
    }
    private static int code() {
        int max=10000,min=1;
        int ran2 = (int) (Math.random()*(max-min)+min);
        System.out.println(ran2);
        return ran2;
    }
}
