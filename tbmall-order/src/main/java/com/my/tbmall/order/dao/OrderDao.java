package com.my.tbmall.order.dao;

import com.my.tbmall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author xiaotangbao
 * @email 914434526@qq.com
 * @date 2020-07-18 11:27:43
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
