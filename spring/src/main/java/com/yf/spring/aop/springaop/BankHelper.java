package com.yf.spring.aop.springaop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.awt.*;

/**
 * 定义切面(辅助业务类)
 */

@Component
@Aspect
public class BankHelper {

    @Before("execution(int com.yf.spring.aop.springaop.Bank.out())")
    void validate(){
        System.out.println("校验账号和密码的有效性");
    }

    void salary(){
        System.out.println("校验余额是否足够");
    }

    void generate(){
        System.out.println("生成对账单");
    }

    void send(){
        System.out.println("给手机发送短信");
    }

    void afterReturn(int result){
        System.out.println("当下余额为：" + result);
    }

    void except(){
        System.out.println("目标方法执行有错");
    }

    void around(ProceedingJoinPoint point)throws Throwable{
        validate();
         point.proceed();//调用切点方法
        send();

    }
}
