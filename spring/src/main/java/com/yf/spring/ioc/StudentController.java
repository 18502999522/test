package com.yf.spring.ioc;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class StudentController {

    @Autowired  // byType
    IStudentService studentService;//创建对象的责任被反转

    Logger logger = Logger.getLogger(StudentController.class);


    void save(){
        System.out.println("XXX的XX（）被调用");
        logger.debug("debug......XXX的XX（）被调用");
        logger.info("info........XXX的XX（）被调用");
        logger.error("error........XXX的XX（）被调用");
        logger.fatal("fatal........XXX的XX（）被调用");
        studentService.save();
    }

    public void setStudentService(IStudentService studentService) {
        this.studentService = studentService;
    }
}
