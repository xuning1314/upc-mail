package com.xuning.common.to;


import lombok.Data;

@Data
public class SkuWareTo {

    Long skuId;
    Long wareId;
    Integer stock;
    String skuName;

}
