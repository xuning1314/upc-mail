package com.xuning.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xuning.common.utils.PageUtils;
import com.xuning.common.utils.Query;

import com.xuning.coupon.dao.SpuBoundsDao;
import com.xuning.coupon.entity.SpuBoundsEntity;
import com.xuning.coupon.service.SpuBoundsService;


@fun.xuning.rpc.annotation.Service
@Service
public class SpuBoundsServiceImpl extends ServiceImpl<SpuBoundsDao, SpuBoundsEntity> implements SpuBoundsService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SpuBoundsEntity> page = this.page(
                new Query<SpuBoundsEntity>().getPage(params),
                new QueryWrapper<SpuBoundsEntity>()
        );

        return new PageUtils(page);
    }

}