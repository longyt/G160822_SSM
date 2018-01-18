package com.zking.test;

import com.zking.Entity.StudentEntity;
import com.zking.dao.StudentDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

/**
 * @author: longyt
 * @create: 2018-01-11 9:16
 * @desc:
 **/
public class TestMybatis {
    @Test
    public void testMybatis(){
        try {
            SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("Mybatis.xml"));
            SqlSession sqlSession = sqlSessionFactory.openSession();
            StudentDao studentDao = sqlSession.getMapper(StudentDao.class);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
