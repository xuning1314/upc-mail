package com.xuning.product.feign;

import com.xuning.common.to.SkuWareTo;
import com.xuning.common.to.SpuBoundTo;
import com.xuning.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("upc-ware")
public interface WareSkuFeignService {


    @PostMapping("/ware/waresku/save")
    R saveSkuWare(@RequestBody SkuWareTo skuWareTo);
}
