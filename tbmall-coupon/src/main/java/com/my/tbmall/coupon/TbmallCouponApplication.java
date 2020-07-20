package com.my.tbmall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @program: tbmall
 * @Date: 2020/7/18 11:39
 * @Author: xiaotangbao
 * @Description:
 */
@SpringBootApplication
@MapperScan("com.my.tbmall.coupon.dao")
@EnableDiscoveryClient
@EnableFeignClients
public class TbmallCouponApplication {
    public static void main(String[] args) {
        SpringApplication.run(TbmallCouponApplication.class,args);
    }
}
