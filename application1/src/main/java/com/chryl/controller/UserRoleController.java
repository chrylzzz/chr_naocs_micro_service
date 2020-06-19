package com.chryl.controller;

import com.chryl.client.UserRoleFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试feign
 * Created by Chr.yl on 2020/6/19.
 *
 * @author Chr.yl
 */
@RestController
@RequestMapping("/feignUR")
public class UserRoleController {
    //测试feign
    @Autowired
    private UserRoleFeign userRoleFeign;

    //注意写全地址
    @GetMapping("/userQuery")
    public Object feignUserQuery() {
        return userRoleFeign.getAllUsers();
    }

}
