package com.my.tbmall.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @program: tbmall
 * @Date: 2020/7/18 11:40
 * @Author: xiaotangbao
 * @Description:
 */
@SpringBootApplication
@MapperScan("com.my.tbmall.order.dao")
@EnableDiscoveryClient
@EnableFeignClients
public class TbmallOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(TbmallOrderApplication.class,args);
    }
}
