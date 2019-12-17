package com.qf.home.api;

import com.qf.home.common.vo.R;
import com.qf.home.sms.service.SmsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "发送短信", tags = "发送短信")
@RestController
public class SmsController {

    @Autowired
    private SmsService smsService;
    //发送短信验证码
    @PostMapping("sendCode")
    @ApiOperation(value = "发送短信验证码", notes = "发送短信验证码")
    public R sendCode (String phone) {
        return smsService.sendCode(phone);
    }
    //校验短信验证码
    @PostMapping("verifyCode")
    @ApiOperation(value = "校验短信验证码", notes = "校验短信验证码")
    public R verifyCode (String phone, String code) {
        return smsService.verifyCode(phone,code);
    }
}
