package com.chryl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created by Chr.yl on 2020/6/18.
 *
 * @author Chr.yl
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients//feign 客户端,注意使用feign
public class Application2 {
    public static void main(String[] args) {
        SpringApplication.run(Application2.class, args);
    }
}
