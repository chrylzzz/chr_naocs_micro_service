package com.chryl.client;

import com.chryl.client.fallback.UserRoleFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * feign 作为app之间调用更为方便
 * Created by Chr.yl on 2020/6/19.
 *
 * @author Chr.yl
 */
@FeignClient(value = "application2",fallback = UserRoleFallBack.class) //value为其他工程yml配置文件的applicationName
public interface UserRoleFeign {

    //feign.FeignException$NotFound: status 404 reading   ,这种错误为, feign调用的接口 路径不全
    @PostMapping("application2/user/query")//这里为什么要写application2呢,因为app2的配置项有context-path ,所以要写完成地址
    Object getAllUsers();

}
