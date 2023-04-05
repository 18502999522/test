package com.yf.spring.aop.springaop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        //启动Spring，创建IOC容器
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-annotation.xml");
        Bank bank =  applicationContext.getBean(Bank.class);
        System.out.println(bank.getClass());
        bank.out();
    }
}
