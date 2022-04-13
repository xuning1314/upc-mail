package com.xuning.order.dao;

import com.xuning.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author xuning
 * @email xuning@gmail.com
 * @date 2021-12-31 09:56:16
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
