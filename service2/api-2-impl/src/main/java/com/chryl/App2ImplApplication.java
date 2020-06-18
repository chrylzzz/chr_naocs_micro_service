package com.chryl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by Chr.yl on 2020/6/18.
 *
 * @author Chr.yl
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan({"com.chryl.mapper"})
public class App2ImplApplication {
    public static void main(String[] args) {
        SpringApplication.run(App2ImplApplication.class, args);
    }
}
