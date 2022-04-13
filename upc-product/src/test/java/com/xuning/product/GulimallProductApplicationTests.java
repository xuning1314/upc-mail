package com.xuning.product;

import com.xuning.coupon.controller.SpuBounds;
import com.xuning.coupon.entity.SpuBoundsEntity;
import com.xuning.product.entity.BrandEntity;

import com.xuning.product.service.BrandService;
import com.xuning.product.service.CategoryService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import fun.xuning.rpc.api.HelloService;
import fun.xuning.rpc.serializer.CommonSerializer;
import fun.xuning.rpc.transport.RpcClientProxy;
import fun.xuning.rpc.transport.socket.client.SocketClient;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;


/**
 * 1、引入oss-starter
 * 2、配置key，endpoint相关信息即可
 * 3、使用OSSClient 进行相关操作
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;


//    @Test
//    public void rpcTest(){
//        SocketClient socketClient = new SocketClient(CommonSerializer.KRYO_SERIALIZER);
//        RpcClientProxy clientProxy = new RpcClientProxy(socketClient);
//        SpuBounds proxy = clientProxy.getProxy(SpuBounds.class);
//        SpuBoundsEntity spuBoundsEntity = new SpuBoundsEntity();
//        spuBoundsEntity.setWork(-1);
//        spuBoundsEntity.setId(666L);
//        spuBoundsEntity.setSpuId(666L);
//        //proxy.save(spuBoundsEntity);
//    }


    @Test
    public void xuningTest(){
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("xuning");
        brandService.save(brandEntity);
        System.out.println("success!!!");

//
//        brandEntity.setBrandId(1L);
//        brandService.updateById(brandEntity);

        List<BrandEntity> res = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L).
                or().eq("brand_id", 3L));
        for (BrandEntity re : res) {
            System.out.println(re)  ;
        }


    }


    @Autowired
    CategoryService categoryService;

    @Test
    public void testFindPath(){
        Long[] catelogPath = categoryService.findCatelogPath(225L);
        log.info("完整路径：{}",Arrays.asList(catelogPath));
    }


    @Test
    public void contextLoads() {

//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setBrandId(1L);
//        brandEntity.setDescript("华为");

//
//        brandEntity.setName("华为");
//        brandService.save(brandEntity);
//        System.out.println("保存成功....");

//        brandService.updateById(brandEntity);


        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        list.forEach((item) -> {
            System.out.println(item);
        });

    }

}
