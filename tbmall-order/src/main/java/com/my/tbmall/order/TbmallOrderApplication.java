package com.my.tbmall.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: tbmall
 * @Date: 2020/7/18 11:40
 * @Author: xiaotangbao
 * @Description:
 */
@SpringBootApplication
@MapperScan("com.my.tbmall.order.dao")
public class TbmallOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(TbmallOrderApplication.class,args);
    }
}
