package com.zking.dao;

import com.zking.Entity.StudentEntity;

import java.util.List;

/**
 * @author: longyt
 * @create: 2018-01-11 9:11
 * @desc:
 **/
public interface StudentDao {
    public List<StudentEntity> getallStudent(StudentEntity studentEntity);

    public void deleteStudent(int sid);

    public void updateStudent(StudentEntity studentEntity);

    public void insertStudent(StudentEntity studentEntity);

    public StudentEntity getoneStudent(int id);
}
