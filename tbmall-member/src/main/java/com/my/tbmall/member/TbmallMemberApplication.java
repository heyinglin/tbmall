package com.my.tbmall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: tbmall
 * @Date: 2020/7/18 11:03
 * @Author: xiaotangbao
 * @Description:
 */
@SpringBootApplication
@MapperScan("com.my.tbmall.member.dao")
public class TbmallMemberApplication {
    public static void main(String[] args) {
        SpringApplication.run(TbmallMemberApplication.class,args);
    }
}
