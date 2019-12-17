package com.qf.home.util;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;


public class AliSmsUtil {

    /**
     * 发送短信验证码 有效期10分钟
     * @param code 验证码 4位*/
    public static void sendSmsCode(String phone,int code){

        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "LTAIheQ", "X7X9w0Ck6sgmFjQuMv");
        IAcsClient client = new DefaultAcsClient(profile);

        CommonRequest request = new CommonRequest();
        request.setMethod(MethodType.POST);
        request.setDomain("dysmsapi.aliyuncs.com");
        request.setVersion("2017-05-25");
        request.setAction("SendSms");
        request.putQueryParameter("RegionId", "cn-hangzhou");
        request.putQueryParameter("PhoneNumbers", phone);
        System.out.println(phone);
        request.putQueryParameter("SignName", "来自邢朋辉的短信");
        request.putQueryParameter("TemplateCode", "SMS_115250125");
        request.putQueryParameter("TemplateParam", "{\"code\":\""+code+"\"}");
        System.out.println(code);
        try {
            CommonResponse response = client.getCommonResponse(request);
            System.out.println(response.getData());
        } catch (ClientException e) {
            e.printStackTrace();
        }
    }

}
