package com.xuning.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xuning.common.utils.PageUtils;
import com.xuning.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author xuning
 * @email xuning@gmail.com
 * @date 2021-12-31 21:08:48
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

