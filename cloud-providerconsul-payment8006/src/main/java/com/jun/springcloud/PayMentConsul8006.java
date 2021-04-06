package com.jun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author jun
 * @date 2021年04月06日 21:29
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PayMentConsul8006 {
    public static void main(String[] args) {
        SpringApplication.run(PayMentConsul8006.class,args);
    }
}
