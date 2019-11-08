package com.gphw.pattern.adapter;

public interface IPassportForOtherAdapter {
    ResultMsg invokeForHttp(Object []args);
    ResultMsg invokeForDubbo(Object []args);
}
