package com.gphw.pattern.adapter;

import com.gphw.pattern.adapter.atom.DubboAdapter;
import com.gphw.pattern.adapter.atom.HttpAdapter;
import com.gphw.pattern.adapter.atom.InvokeAdapter;

public class PassportForOtherAdapter implements IPassportForOtherAdapter{
    @Override
    public ResultMsg invokeForHttp(Object[] args) {
        return doInvoke(args, HttpAdapter.class);
    }

    @Override
    public ResultMsg invokeForDubbo(Object[] args) {
        return doInvoke(args, DubboAdapter.class);
    }

    private ResultMsg doInvoke(Object[] args,Class<? extends InvokeAdapter> clazz){
        try {
            InvokeAdapter adapter = clazz.newInstance();
            if(adapter.support(adapter)){
                return adapter.invoke(args,adapter);
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return new ResultMsg(500,"调用失败","服务调用失败！");
    }
}
