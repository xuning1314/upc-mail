package com.xuning.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xuning.common.utils.PageUtils;
import com.xuning.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author xuning
 * @email xuning@gmail.com
 * @date 2021-12-31 09:56:16
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

