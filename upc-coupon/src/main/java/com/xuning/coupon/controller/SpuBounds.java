package com.xuning.coupon.controller;

import com.xuning.common.utils.R;
import com.xuning.coupon.entity.SpuBoundsEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

public interface SpuBounds {
    public R list( Map<String, Object> params);
    public R info(Long id);
    public R save(SpuBoundsEntity spuBounds);
    public R update(SpuBoundsEntity spuBounds);
    public R delete(Long[] ids);
}
