package com.zzp.hello.spring.cloud.web.admin.feign.service.hystrix;

import com.zzp.hello.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.stereotype.Component;

/**
 * @Author: 张展鹏
 * @Date: 2019/8/6 15:41
 * @Content:
 */
@Component
public class AdminServiceHystrix implements AdminService {
    @Override
    public String sayHi(String message) {
        return String.format("Hi your message is : %s but request bad", message);
    }
}
