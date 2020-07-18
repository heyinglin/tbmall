package com.my.tbmall.member;

import com.my.tbmall.member.entity.MemberEntity;
import com.my.tbmall.member.service.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TbmallMemberApplicationTests {

    @Autowired
    private MemberService   memberService;
    @Test
    void contextLoads() {
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setNickname("chenlaoban");
        memberService.save(memberEntity);
    }

}
