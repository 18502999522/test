package com.yf.spring.ioc.teacher;

public class TeacherController {

    ITeacherService teacherService;

    void save(){
        teacherService.save();
    }

    public void setTeacherService(ITeacherService teacherService) {
        this.teacherService = teacherService;
    }
}
