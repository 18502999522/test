package com.yf.aop;

import org.springframework.stereotype.Component;

/**
 * 主业务类: 被切面
 */
@Component
public class Bank {

    public int out(){

        System.out.println("银行的取钱业务..................");

        return 1000;
    }

    public void in(){
        System.out.println("银行的存钱业务..................");
    }
}
