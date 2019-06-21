/*
package com.gpch.loginSchool;

import com.gpch.loginSchool.model.Student;
import com.gpch.loginSchool.repository.RoleRepository;
import com.gpch.loginSchool.repository.StudentRepository;
import com.gpch.loginSchool.service.StudentService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.MockitoAnnotations.initMocks;

public class StudentServiceTest {

    @Mock
    private StudentRepository mockUserRepository;
    @Mock
    private RoleRepository mockRoleRepository;
    @Mock
    private BCryptPasswordEncoder mockBCryptPasswordEncoder;

    private StudentService studentServiceUnderTest;
    private Student user;

    @Before
    public void setUp() {
        initMocks(this);
        studentServiceUnderTest = new StudentService(mockUserRepository,
                mockRoleRepository,
                mockBCryptPasswordEncoder);
        user = Student.builder()
                .id(5)
                .name("John")
                .lastName("Doe")
                .email("test@test.com")
                .course("Java")
                .build();

        Mockito.when(mockUserRepository.save(any()))
                .thenReturn(user);
        Mockito.when(mockUserRepository.findByEmail(anyString()))
                .thenReturn(user);
    }

    @Test
    public void testFindUserByEmail() {
        final String email = "test@test.com";
        final Student result = studentServiceUnderTest.findByEmail(email);
        assertEquals(email, result.getEmail());
    }

    @Test
    public void testSaveUser() {
        final String email = "test@test.com";
        Student result = studentServiceUnderTest.saveStudent(Student.builder().build());
        assertEquals(email, result.getEmail());
    }
}
*/