package com.yf.spring.aop.springaop;

import org.springframework.stereotype.Component;

/**
 * 定义被切面(主业务类)
 */
@Component
public class Bank {

    int out(){
        //int i = 10 / 0;
        System.out.println("从XX账户取走了XX元...............");

        return 100;
    }

    void save(){

    }

    void transfer(){

    }
}
