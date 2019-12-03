package com.ljy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @类名: com.ljy
 * @作者:
 * @创建时间: 2019-12-03 08:54
 * @描述:
 **/
@SpringBootApplication
@EnableEurekaClient
public class DemoApp {
    public static void main(String[] args){
        SpringApplication.run(DemoApp.class);
    }

}
