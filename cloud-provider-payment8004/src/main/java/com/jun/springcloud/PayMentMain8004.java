package com.jun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author jun
 * @date 2021年04月05日 17:13
 */
@SpringBootApplication
@EnableDiscoveryClient //该注解用于向使用consul或者zookeeper作为注册中心时注册服务
public class PayMentMain8004 {
    public static void main(String[] args) {
        SpringApplication.run(PayMentMain8004.class,args);
    }
}
