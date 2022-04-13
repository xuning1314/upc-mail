package com.xuning.product.controller;

import java.util.Arrays;
import java.util.Map;

import com.xuning.RpcClientUtil;
import com.xuning.common.valid.AddGroup;
import com.xuning.common.valid.UpdateGroup;
import com.xuning.common.valid.UpdateStatusGroup;
import com.xuning.coupon.controller.SpuBounds;
import com.xuning.coupon.entity.SpuBoundsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xuning.product.entity.BrandEntity;
import com.xuning.product.service.BrandService;
import com.xuning.common.utils.PageUtils;
import com.xuning.common.utils.R;


/**
 * 品牌
 *
 * @author xuning
 * @email xuning@gmail.com
 * @date 2021-12-31 22:50:32
 */
@RestController
@RequestMapping("product/brand")
public class BrandController {
    @Autowired
    private BrandService brandService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("product:brand:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = brandService.queryPage(params);

        //TODO RPC Client 想要使用客户端，用 RpcClientUtil 获得 proxy，然后进行方法调用
        // 将想要远程调用的 Controller 加入 @Service，
//        SpuBounds proxy = RpcClientUtil.getRpcClientProxy().getProxy(SpuBounds.class);
//        SpuBoundsEntity spuBoundsEntity = new SpuBoundsEntity();
//        spuBoundsEntity.setWork(-1);
//        spuBoundsEntity.setId(777L);
//        spuBoundsEntity.setSpuId(777L);
//        proxy.save(spuBoundsEntity);

        return R.ok().put("page", page);




    }


    /**
     * 信息
     */
    @RequestMapping("/info/{brandId}")
    //@RequiresPermissions("product:brand:info")
    public R info(@PathVariable("brandId") Long brandId){
		BrandEntity brand = brandService.getById(brandId);

        return R.ok().put("brand", brand);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("product:brand:save")
    public R save(@Validated({AddGroup.class}) @RequestBody BrandEntity brand/*,BindingResult result*/){
//        if(result.hasErrors()){
//            Map<String,String> map = new HashMap<>();
//            //1、获取校验的错误结果
//            result.getFieldErrors().forEach((item)->{
//                //FieldError 获取到错误提示
//                String message = item.getDefaultMessage();
//                //获取错误的属性的名字
//                String field = item.getField();
//                map.put(field,message);
//            });
//
//            return R.error(400,"提交的数据不合法").put("data",map);
//        }else {
//
//        }

        brandService.save(brand);


        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("product:brand:update")
    public R update(@Validated(UpdateGroup.class) @RequestBody BrandEntity brand){
		brandService.updateDetail(brand);

        return R.ok();
    }
    /**
     * 修改状态
     */
    @RequestMapping("/update/status")
    //@RequiresPermissions("product:brand:update")
    public R updateStatus(@Validated(UpdateStatusGroup.class) @RequestBody BrandEntity brand){
        brandService.updateById(brand);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("product:brand:delete")
    public R delete(@RequestBody Long[] brandIds){
		brandService.removeByIds(Arrays.asList(brandIds));

        return R.ok();
    }

}
