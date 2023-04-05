package com.yf.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 辅助业务类：切面
 */
@Component
@Aspect
public class BankHelper {

    /**
     * 校验账户的合法性
     */
    //@Before("execution(public void com.yf.aop.Bank.out())")
    public void validate(){
        System.out.println("校验账户的合法性..............");
    }

    /**
     * 给用户发送余额通知的短信
     */
    //@After("execution(public void com.yf.aop.Bank.out())")
    public void send(){
        System.out.println("给用户发送余额通知的短信..............");
    }

    //@Around("execution(public void com.yf.aop.Bank.out())")
    public void around(ProceedingJoinPoint point)throws Throwable{
        validate();
        point.proceed();//调用切点方法
        send();
    }
    @AfterReturning(pointcut="execution(public int com.yf.aop.Bank.out())",returning = "result")
    public void getRemainAmont(Object result){

        System.out.println("账户剩余金额为：" + result);
    }

    //@AfterThrowing("execution(public void com.yf.aop.Bank.out())")
    public void exception(){
        System.out.println("目标方法执行出错！");
    }



}
