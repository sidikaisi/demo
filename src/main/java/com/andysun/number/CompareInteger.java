package com.andysun.number;

/**
 * Created by zhangxiaojun on 2016/11/21 0021.
 */
public class CompareInteger {
    /**
     * 如果你查看Integer.java类，你会找到IntegerCache.java这个内部私有类，它为-128到127之间的所有整数对象提供缓存
     * 所以a=1000和b=1000是2个地方
     * @param args
     */
    public static void main(String[] args) {
        Integer a = 1000;
        Integer b = 1000;
        System.out.println("a=1000,b=1000,(a == b)="+(a == b));

        Integer c = 100;
        Integer d = 100;
        System.out.print("a=100,b=100,(a == b)="+(c == d));
    }
}
