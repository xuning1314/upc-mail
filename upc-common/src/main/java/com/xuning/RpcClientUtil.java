package com.xuning;

import fun.xuning.rpc.serializer.CommonSerializer;
import fun.xuning.rpc.transport.RpcClientProxy;
import fun.xuning.rpc.transport.socket.client.SocketClient;

public class RpcClientUtil {

    private static RpcClientProxy rpcClientProxy = null;

    private RpcClientUtil(){
    }

    public static RpcClientProxy getRpcClientProxy(){

        if(rpcClientProxy==null){
            synchronized (RpcClientUtil.class){
                if (rpcClientProxy==null){
                    rpcClientProxy = new RpcClientProxy(new SocketClient(CommonSerializer.KRYO_SERIALIZER));
                }
            }
        }
        return rpcClientProxy;
    }

}
