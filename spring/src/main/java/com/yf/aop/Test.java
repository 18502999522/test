package com.yf.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("spring-annotation.xml");

        Bank bank = app.getBean(Bank.class);

        System.out.println(bank.getClass());
        bank.out();

    }
}
