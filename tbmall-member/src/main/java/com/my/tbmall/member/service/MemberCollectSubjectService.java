package com.my.tbmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.my.tbmall.common.utils.PageUtils;
import com.my.tbmall.member.entity.MemberCollectSubjectEntity;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author xiaotangbao
 * @email 914434526@qq.com
 * @date 2020-07-18 11:01:22
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

