package com.yf.spring.ioc;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao implements IStudentDao{

    public void save(){
        System.out.println("已保存到mysql数据库");
    }
}
