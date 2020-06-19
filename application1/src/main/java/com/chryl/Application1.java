package com.chryl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created by Chr.yl on 2020/6/17.
 *
 * @author Chr.yl
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients//feign客户端
public class Application1 {
    public static void main(String[] args) {
        SpringApplication.run(Application1.class, args);
    }
}
