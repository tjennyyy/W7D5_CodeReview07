package com.gpch.loginSchool.repository;

import com.gpch.loginSchool.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("studentRepository")
public interface StudentRepository extends JpaRepository<Student,Long>{
    Student findByEmail(String email);
}