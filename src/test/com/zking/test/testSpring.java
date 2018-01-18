package com.zking.test;

import com.zking.Entity.StudentEntity;
import com.zking.dao.StudentDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author: longyt
 * @create: 2018-01-11 9:38
 * @desc:
 **/
public class testSpring {

    @Test
    public void testSpring(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentDao studentDao = (StudentDao) applicationContext.getBean("studentDao");
       StudentEntity studentEntity= studentDao.getoneStudent(2);
        System.out.println(studentEntity.getSname());
    }
}
