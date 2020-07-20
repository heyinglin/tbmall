package com.my.tbmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @program: tbmall
 * @Date: 2020/7/18 11:41
 * @Author: xiaotangbao
 * @Description:
 */
@SpringBootApplication
@MapperScan("com.my.tbmall.product.dao")
@EnableDiscoveryClient
@EnableFeignClients
public class TbmallProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(TbmallProductApplication.class,args);
    }
}
