package com.tiza.leo._05mybatis_baizhi03_complex_plus.test;

import com.tiza.leo._05mybatis_baizhi03_complex_plus.dao.StudentDAO;
import com.tiza.leo._05mybatis_baizhi03_complex_plus.entity.Course;
import com.tiza.leo._05mybatis_baizhi03_complex_plus.entity.Student;
import com.tiza.leo._05mybatis_baizhi03_complex_plus.util.MybatisUtil;

import java.util.List;

/**
 * @author leowei
 * @date 2020/12/13  - 13:25
 */
public class TestStudentDAO {
    public static void main(String[] args) {
        StudentDAO mapper = MybatisUtil.getSqlSession().getMapper(StudentDAO.class);
        List<Student> students = mapper.queryAll();
        for (Student student : students) {
            System.out.println("student = " + student);
            List<Course> courses = student.getCourses();
            for (Course cours : courses) {
                System.out.println("cours = " + cours);
            }
            System.out.println("===================================================");
        }
    }
}
