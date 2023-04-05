package com.yf.model.mapper;

import com.yf.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public interface StudentMapper {

    int deleteByPrimaryKey(Integer stuId);

    int deleteBatch(Collection<Integer> stuIds);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer stuId);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}