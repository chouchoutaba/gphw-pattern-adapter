package com.gphw.pattern.adapter.atom;

import com.gphw.pattern.adapter.ResultMsg;

public interface InvokeAdapter {
    boolean support(Object adapter);
    ResultMsg invoke(Object[] objs, Object adapter);
}
