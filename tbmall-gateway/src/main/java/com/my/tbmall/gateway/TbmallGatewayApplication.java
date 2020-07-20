package com.my.tbmall.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: tbmall
 * @Date: 2020/7/20 8:57
 * @Author: xiaotangbao
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class TbmallGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(TbmallGatewayApplication.class,args);
    }
}
