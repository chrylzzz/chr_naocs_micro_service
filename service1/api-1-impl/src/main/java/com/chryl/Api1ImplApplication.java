package com.chryl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created by Chr.yl on 2020/6/17.
 *
 * @author Chr.yl
 */
@SpringBootApplication
@EnableDiscoveryClient//nacos客户端
@MapperScan({"com.chryl.mapper"})
public class Api1ImplApplication {
    public static void main(String[] args) {
        SpringApplication.run(Api1ImplApplication.class, args);
    }
}
