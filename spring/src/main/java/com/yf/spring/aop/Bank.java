package com.yf.spring.aop;

import java.io.IOError;

public class Bank implements IOut {

    /**
     * 取钱方法
     */
    public void out(){
        //System.out.println("校验账号+密码的有效性");

        //System.out.println("校验余额是否足够");

        System.out.println("update 账户表 set 余额=余额 - 100 where 账号=？");

        //System.out.println("生成对账单................");

        //System.out.println("给手机发短信................");
    }
}
