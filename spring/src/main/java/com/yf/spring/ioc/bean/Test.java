package com.yf.spring.ioc.bean;

import com.yf.spring.JDBCProperties;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        //启动Spring，创建IOC容器
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-bean.xml");

        //Student student = applicationContext.getBean(Student.class);
        Class2204 class2204 = applicationContext.getBean(Class2204.class);

        System.out.println(class2204);

    }
}
