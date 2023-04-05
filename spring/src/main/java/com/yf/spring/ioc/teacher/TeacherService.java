package com.yf.spring.ioc.teacher;

import org.springframework.stereotype.Controller;

public class TeacherService implements ITeacherService {

    ITeacherDao teacherDao;

    @Override
    public void save() {
        teacherDao.save();
    }

    public void setTeacherDao(ITeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }
}
