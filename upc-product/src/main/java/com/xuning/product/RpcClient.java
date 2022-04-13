package com.xuning.product;



import com.xuning.coupon.controller.SpuBounds;
import com.xuning.coupon.controller.SpuBoundsController;
import com.xuning.coupon.entity.SpuBoundsEntity;
import com.xuning.coupon.service.SpuBoundsService;
import fun.xuning.rpc.serializer.CommonSerializer;
import fun.xuning.rpc.transport.RpcClientProxy;
import fun.xuning.rpc.transport.socket.client.SocketClient;

public class RpcClient {
    public static void main(String[] args) {
        SocketClient socketClient = new SocketClient(CommonSerializer.KRYO_SERIALIZER);
        RpcClientProxy clientProxy = new RpcClientProxy(socketClient);
        SpuBounds proxy = clientProxy.getProxy(SpuBounds.class);
        SpuBoundsEntity spuBoundsEntity = new SpuBoundsEntity();
        spuBoundsEntity.setWork(-1);
        spuBoundsEntity.setId(666L);
        spuBoundsEntity.setSpuId(666L);
        proxy.save(spuBoundsEntity);
    }
}
