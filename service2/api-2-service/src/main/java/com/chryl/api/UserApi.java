package com.chryl.api;

import com.chryl.po.ChrUser;

import java.util.List;

/**
 * Created by Chr.yl on 2020/6/18.
 *
 * @author Chr.yl
 */
public interface UserApi {
    boolean insert(ChrUser chrUser);

    List<ChrUser> getAllUsers();

    boolean update(ChrUser chrUser);
}
