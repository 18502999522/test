package com.yf;

import com.yf.model.mapper.StudentMapper;
import com.yf.model.mapper.UserMapper;
import com.yf.model.service.IBankService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

public class Test {

    public static void main(String[] args)throws Exception {

        ClassPathXmlApplicationContext  app = new ClassPathXmlApplicationContext("spring-datasource.xml","spring-annotation.xml");

        //StudentMapper studentMapper = app.getBean(StudentMapper.class);

        //studentMapper.deleteByPrimaryKey(101);
        /*Collection<Integer> set = new ArrayList<>();
        set.add(1000);set.add(1001);set.add(1002);
        studentMapper.deleteBatch(set);*/

       /* UserMapper userMapper =  app.getBean(UserMapper.class);
        userMapper.login("a","w");*/

        IBankService bankService = app.getBean(IBankService.class);

        bankService.transfer("001","002",1000);
    }
}
