package com.hanlu.test;

import com.hanlu.dao.StudentDao;
import com.hanlu.pojo.Student;
import com.hanlu.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

/**
 * @author HMY
 * @date 2018/12/18-23:51
 */
public class MybatisTest {


    @Test
    public void findAllStu(){
        SqlSession session = MybatisUtils.getSession();
        List<Student> list = session.selectList("com.hanlu.mapper.StudentMapper.findAllStu");
        for (Student stu:list){
            System.out.println(stu.toString());
        }
        session.close();
    }

    @Test
    public void studentAdd(){
            Student student=new Student();
            student.setAge5(11);
            student.setIntro5("sdf");
            student.setName5("sdf");
            student.setSnum5("aa");
            StudentDao studentDao = new StudentDao();
            studentDao.studentAdd(student);
    }
    @Test
    public void studentEdit(){
        Student student=new Student();
        student.setId5(21);
        /*student.setName5("qwd");
        student.setAge5(21);
        student.setIntro5("vc");*/
        student.setSnum5("1111");
        StudentDao studentDao = new StudentDao();
        studentDao.studentEdit(student);
    }

    @Test
    public void search(){
        StudentDao studentDao = new StudentDao();
        Map<String,Object> map= new HashMap<>();
        map.put("name","韩");
        map.put("age",12);
        List<Student> list = studentDao.studentFindByNameOrAge(map);
        for(Student student1:list){
            System.out.println(student1.toString());
        }
    }


    @Test
    public void del(){
        StudentDao studentDao = new StudentDao();
        studentDao.studentDel("21");
    }
}
