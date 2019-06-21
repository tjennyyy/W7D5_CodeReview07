package com.gpch.loginSchool.service;

import com.gpch.loginSchool.model.Role;
import com.gpch.loginSchool.model.Student;
import com.gpch.loginSchool.repository.RoleRepository;
import com.gpch.loginSchool.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashSet;

@Service("studentService")

public class StudentService {

    private StudentRepository studentRepository;
    private RoleRepository roleRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public StudentService(StudentRepository studentRepository, RoleRepository roleRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.studentRepository = studentRepository;
        this.roleRepository = roleRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }
    public Student findByEmail(String email) {
        return studentRepository.findByEmail(email);
    }

    public Student saveStudent(Student student) {
        student.setPassword(bCryptPasswordEncoder.encode(student.getPassword()));
        student.setActive(1);
        Role studentRole = roleRepository.findByRole("STUDENT");
        student.setRoles(new HashSet<Role>(Arrays.asList(studentRole)));
        return studentRepository.save(student);
    }
}