package com.yf.spring.aop;

/**
 * 代理
 */
public class BankProxy2 implements IOut{

    @Override
    public void out() {

        System.out.println("校验账号+密码的有效性");

        System.out.println("校验余额是否足够");

        new Bank().out();//被代理目标的原方法


        System.out.println("生成对账单................");

        System.out.println("给手机发短信................");

    }

    public static void main(String[] args) {

        IOut out = new  BankProxy2();

        out.out();

    }
}
