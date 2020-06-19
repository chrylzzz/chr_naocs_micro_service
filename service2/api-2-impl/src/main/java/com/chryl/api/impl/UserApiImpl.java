package com.chryl.api.impl;

import com.chryl.api.UserApi;
import com.chryl.mapper.UserMapper;
import com.chryl.po.ChrUser;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Chr.yl on 2020/6/18.
 *
 * @author Chr.yl
 */
@Service
public class UserApiImpl implements UserApi {

    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean insert(ChrUser chrUser) {
        return false;
    }

    @Override
    public List<ChrUser> getAllUsers() {
        return userMapper.getAllUsers();
    }

    @Override
    public boolean update(ChrUser chrUser) {
        return false;
    }
}
