package com.yf.spring.ioc;

import org.springframework.stereotype.Repository;

@Repository   //@Repository("studentDao2")
public class StudentDao2 implements IStudentDao {

    @Override
    public void save() {
        System.out.println("保存数据到Oracle");
    }
}
