package com.my.tbmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.my.tbmall.common.utils.PageUtils;
import com.my.tbmall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author xiaotangbao
 * @email 914434526@qq.com
 * @date 2020-07-18 11:32:42
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

