package com.chryl.client.fallback;

import com.chryl.client.UserRoleFeign;

/**
 * 接口错误返回类
 * Created by Chr.yl on 2020/6/19.
 *
 * @author Chr.yl
 */
public class UserRoleFallBack implements UserRoleFeign {


    @Override
    public Object getAllUsers() {
        return "暂时未查到信息 ~ ";
    }
}
