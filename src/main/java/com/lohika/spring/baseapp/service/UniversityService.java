package com.lohika.spring.baseapp.service;

import com.lohika.spring.baseapp.model.Student;

import java.util.List;

/**
 * Created by yuriy on 23.02.16.
 */
public interface UniversityService {

    public List<Student> getAvailableStudents();
}
