package com.lohika.spring.baseapp;

import com.lohika.spring.baseapp.model.Student;
import com.lohika.spring.baseapp.service.UniversityService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by yuriy on 23.02.16.
 */
public class MainApplication {

    public static void main(String[] args) {

//        ApplicationContext applicationContext =
//                new ClassPathXmlApplicationContext("spring-config.xml");

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(ApplicationConfig.class);

        UniversityService universityService = applicationContext.getBean(
                "universityService",
                UniversityService.class);

        List<Student> students = universityService.getAvailableStudents();

        for (Student student : students) {
            System.out.println(student.getFirstname() +
                    ", " + student.getLastname() +
                    ", " + student.getAge());
        }
    }
}
