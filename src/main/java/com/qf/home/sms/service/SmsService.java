package com.qf.home.sms.service;

import com.qf.home.common.vo.R;
import com.qf.home.util.AliSmsUtil;

public interface SmsService {

    /**
     * 发送验证码
     * @param phone 手机号
     * @return 返回验证码
     */
    R sendCode(String phone);

    /**
     * 校验短信验证码
     * @param phone 手机号
     * @param code 验证码
     * @return 验证结果
     */
    R verifyCode(String phone, String code);
}
