package com.gphw.pattern.adapter;

public class InvokeAdapterTest {
    public static void main(String[] args) {
        IPassportForOtherAdapter iPassportForOtherAdapter = new PassportForOtherAdapter();
        ResultMsg resultMsg=iPassportForOtherAdapter.invokeForDubbo(new String[]{"1111"});
        System.out.println(resultMsg.getData());
    }
}
