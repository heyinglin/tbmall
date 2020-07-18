package com.my.tbmall.store.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.my.tbmall.common.utils.PageUtils;
import com.my.tbmall.store.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author xiaotangbao
 * @email 914434526@qq.com
 * @date 2020-07-18 11:36:27
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

