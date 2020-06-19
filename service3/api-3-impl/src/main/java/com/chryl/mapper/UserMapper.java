package com.chryl.mapper;

import com.chryl.po.EsChrUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Chr.yl on 2020/6/7.
 *
 * @author Chr.yl
 */
public interface UserMapper {

    EsChrUser selectUserByUName(@Param("uName") String uName);

    List<EsChrUser> getAllUsers();

}
