package com.my.tbmall.store.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.my.tbmall.common.utils.PageUtils;
import com.my.tbmall.store.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author xiaotangbao
 * @email 914434526@qq.com
 * @date 2020-07-18 11:36:27
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

