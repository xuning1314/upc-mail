package com.xuning.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xuning.common.utils.PageUtils;
import com.xuning.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author xuning
 * @email xuning@gmail.com
 * @date 2021-12-31 21:08:49
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void updateDetail(BrandEntity brand);

}

