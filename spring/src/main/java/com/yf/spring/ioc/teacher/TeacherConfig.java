package com.yf.spring.ioc.teacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TeacherConfig {

    @Bean
    TeacherDao studentDao(){

        return new TeacherDao();
    }




    @Bean
    TeacherService teacherService(ITeacherDao teacherDao){

        TeacherService teacherService = new TeacherService();

        teacherService.setTeacherDao(teacherDao);

        return  teacherService;
    }

    @Bean
    TeacherController teacherController(ITeacherService teacherService){

        TeacherController teacherController = new TeacherController();
        teacherController.setTeacherService(teacherService);

        return teacherController;
    }

}
