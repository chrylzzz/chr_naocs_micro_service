package com.chryl;

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
public class Application2 {
    public static void main(String[] args) {
        SpringApplication.run(Application2.class, args);
    }
}
