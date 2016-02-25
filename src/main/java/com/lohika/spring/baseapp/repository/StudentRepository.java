package com.lohika.spring.baseapp.repository;

import com.lohika.spring.baseapp.model.Student;

import java.util.List;

/**
 * Created by yuriy on 23.02.16.
 */
public interface StudentRepository {

    public List<Student> getStudents();

}
