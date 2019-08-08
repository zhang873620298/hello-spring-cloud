package com.zzp.hello.spring.cloud.web.admin.feign.service;

import com.zzp.hello.spring.cloud.web.admin.feign.service.hystrix.AdminServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: 张展鹏
 * @Date: 2019/8/6 15:20
 * @Content:
 */
@FeignClient(value = "hello-spring-cloud-service-admin", fallback = AdminServiceHystrix.class)
public interface AdminService {
    @RequestMapping(value = "hi",method = RequestMethod.GET)
    String sayHi(@RequestParam String message);
}
