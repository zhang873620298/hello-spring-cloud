package com.zzp.hello.spring.cloud.web.admin.ribbon.controller;

import com.zzp.hello.spring.cloud.web.admin.ribbon.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 张展鹏
 * @Date: 2019/8/6 15:06
 * @Content:
 */
@RestController
public class AdminController {
    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "hi",method = RequestMethod.GET)
    public String sayHi(String message) {
        return adminService.sayHi(message);
    }
}
