package com.bai.javaniodemo;

import org.junit.Test;

public class Test1 {

    @Test
    public void test1() {
        byte[] bytes = "lalla".getBytes();
        System.out.println(bytes.length);
    }

    @Test
    public void test2() {
        byte[] bytes = "我的中国心".getBytes();
        System.out.println(bytes.length);
    }

}
