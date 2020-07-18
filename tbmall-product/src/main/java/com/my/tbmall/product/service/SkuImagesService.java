package com.my.tbmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.my.tbmall.common.utils.PageUtils;
import com.my.tbmall.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author xiaotangbao
 * @email 914434526@qq.com
 * @date 2020-07-18 11:32:42
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

