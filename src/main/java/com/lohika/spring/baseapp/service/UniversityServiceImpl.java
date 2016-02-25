package com.lohika.spring.baseapp.service;

import com.lohika.spring.baseapp.model.Student;
import com.lohika.spring.baseapp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yuriy on 23.02.16.
 */
@Service("universityService")
public class UniversityServiceImpl implements UniversityService {

    @Autowired
    private StudentRepository studentRepository;

    public UniversityServiceImpl() {
    }

    @Autowired
    public UniversityServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Autowired
    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAvailableStudents() {
        return studentRepository.getStudents();
    }
}
