package com.my.tbmall.store;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: tbmall
 * @Date: 2020/7/18 11:42
 * @Author: xiaotangbao
 * @Description:
 */
@SpringBootApplication
@MapperScan("com.my.tbmall.store.dao")
public class TbmallStoreApplication {
    public static void main(String[] args) {
        SpringApplication.run(TbmallStoreApplication.class,args);
    }
}
