package com.yf.spring.ioc.teacher;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {


    public static void main(String[] args) {

        FileSystemXmlApplicationContext applicationContext = new FileSystemXmlApplicationContext("classpath:spring-annotation.xml");
        TeacherController teacherController = applicationContext.getBean(TeacherController.class);
        teacherController.save();
    }
}
