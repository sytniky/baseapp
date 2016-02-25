package com.lohika.spring.baseapp.repository;

import com.lohika.spring.baseapp.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuriy on 23.02.16.
 */

@Repository("studentRepository")
public class StudentRepositoryImpl implements StudentRepository {


    public List<Student> getStudents() {

        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Yuriy", "Sytnik", 30));
        students.add(new Student("Svetlana", "Sytnik", 28));
        return students;
    }
}
