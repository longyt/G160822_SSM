package com.zking.controller;

import com.zking.Entity.StudentEntity;
import com.zking.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author: longyt
 * @create: 2018-01-11 10:56
 * @desc:
 **/
@Controller
public class StudentController {
    @Autowired
    private StudentDao studentDao;

    @ResponseBody
    @RequestMapping("getAllStudent")
    public List<StudentEntity> getall(@RequestBody StudentEntity studentEntity){

        List<StudentEntity> list = studentDao.getallStudent(studentEntity);

        return list;
    }

    @RequestMapping("updateStudent")
    public void updateStudent(@RequestBody StudentEntity studentEntity){
        studentDao.updateStudent(studentEntity);
    }

    @RequestMapping("deleetStduent")
    public void deleteStudent(@RequestParam String studentid){
        studentDao.deleteStudent(Integer.parseInt(studentid));
    }
    @RequestMapping("insertStudent")
    public void insertStduent(@RequestBody StudentEntity studentEntity){
        studentDao.insertStudent(studentEntity);
    }

    @ResponseBody
    @RequestMapping("getoneStudnet")
    public StudentEntity getOneStudent(@RequestParam String id){
        StudentEntity studentEntity = studentDao.getoneStudent(Integer.parseInt(id));
        return studentEntity;
    }
}
