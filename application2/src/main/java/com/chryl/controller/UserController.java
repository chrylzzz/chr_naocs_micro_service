package com.chryl.controller;

import com.chryl.api.UserApi;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Chr.yl on 2020/6/18.
 *
 * @author Chr.yl
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Reference
    UserApi userApi;

    @PostMapping("/query")
    public Object getAllUsers() {
        return userApi.getAllUsers();
    }

    @PostMapping("/insert")
    public void insert() {

    }


}
