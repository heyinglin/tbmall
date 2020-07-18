package com.my.tbmall.member.dao;

import com.my.tbmall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author xiaotangbao
 * @email 914434526@qq.com
 * @date 2020-07-18 11:01:22
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
