package com.gphw.pattern.adapter.atom;

import com.gphw.pattern.adapter.ResultMsg;

public class HttpAdapter implements InvokeAdapter {
    @Override
    public boolean support(Object adapter) {
        if (adapter instanceof HttpAdapter){
            return true;
        }
        return false;
    }

    @Override
    public ResultMsg invoke(Object[] objs, Object adapter) {
        return new ResultMsg(200,"调用成功","HttpAdapter 调用成功！！");
    }
}
