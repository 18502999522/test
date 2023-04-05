package com.yf.spring.ioc;

import com.yf.spring.JDBCProperties;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        /*StudentService studentService = new StudentService();
        studentService.setStudentDao(new StudentDao2());
        studentService.save();*/

        //启动Spring，创建IOC容器
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-annotation.xml");
        /*StudentService studentService = (StudentService)applicationContext.getBean("studentService");//byName
        studentService.save();*/

        // 以不变应万变
       /* StudentController studentController =  applicationContext.getBean(StudentController.class);//byType
        studentController.save();*/

        JDBCProperties properties = applicationContext.getBean(JDBCProperties.class);

        System.out.println(properties);

    }
}
