package com.yf.spring.aop;

/**
 * 静态代理
 */

public class BankProxy extends Bank {


    @Override
  public  void out() {

        System.out.println("校验账号+密码的有效性");

        System.out.println("校验余额是否足够");

        super.out();//被代理的取钱动作

        System.out.println("生成对账单................");

        System.out.println("给手机发短信................");
    }

    public static void main(String[] args) {

        //Bank bank = new Bank();
        Bank bank = new BankProxy();
        bank.out();
    }
}
