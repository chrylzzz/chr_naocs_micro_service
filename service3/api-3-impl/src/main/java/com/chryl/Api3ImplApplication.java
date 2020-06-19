package com.chryl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by Chr.yl on 2020/6/19.
 *
 * @author Chr.yl
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.chryl.mapper")
public class Api3ImplApplication {

    public static void main(String[] args) {

        //最近项目中有整合了ES 跟Redis，在写测试用例的时候会报如上错误
        //Caused by: java.lang.IllegalStateException: availableProcessors is already set to [8], rejecting [8]
//    经过一顿DEBUG， ES跟Redis后面都会使用Netty来进行网络通信
//    ElasticsearchAutoConfiguration类elasticsearchClient会在IDEA环境先初始化Bean，如果是这样不会产生问题
//    LettuceConnectionConfiguration类redisConnectionFactory在测试环境的时候会先初始化，导致了availableProcessors重复赋值
        System.setProperty("es.set.netty.runtime.available.processors", "false");
        SpringApplication.run(Api3ImplApplication.class, args);
    }
}
