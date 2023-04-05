package com.yf.spring.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentService implements  IStudentService{

    //IStudentDao studentDao = new StudentDao();
    //@Autowired  // byType
    @Autowired
    //@Qualifier("studentDao2")
    @Qualifier(value="studentDao2")
    //@Resource(name="studentDao2")
    IStudentDao studentDao2;// field  attribute  property

    @Override
    public void save() {

        studentDao2.save();
    }

    public void setStudentDao2(IStudentDao studentDao) {
        this.studentDao2 = studentDao;
    }
}
