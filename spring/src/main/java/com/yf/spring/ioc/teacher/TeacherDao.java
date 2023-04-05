package com.yf.spring.ioc.teacher;

public class TeacherDao implements ITeacherDao {

    @Override
    public void save() {
        System.out.println("dao的保存被调用");
    }
}
