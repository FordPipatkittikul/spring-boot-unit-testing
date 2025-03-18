package com.luv2code.test;


import com.luv2code.component.MvcTestingExampleApplication;
import com.luv2code.component.models.CollegeStudent;
import com.luv2code.component.models.StudentGrades;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.util.ReflectionTestUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = MvcTestingExampleApplication.class)
public class ReflectionTestUtilsTest {

    @Autowired
    ApplicationContext context;

    @Autowired
    CollegeStudent collegeStudentOne;

    @Autowired
    StudentGrades studentGrades;

    @BeforeEach
    public void setUp(){

        // for education purpose. Normally we use setter
        ReflectionTestUtils.setField(collegeStudentOne, "id", 1);

        collegeStudentOne.setFirstname("abc");
        collegeStudentOne.setLastname("Roby");
        collegeStudentOne.setEmailAddress("abc@gmail.com");
        collegeStudentOne.setStudentGrades(studentGrades);
    }

    @Test
    public void getPrivateField() {
        assertEquals(1, ReflectionTestUtils.getField(collegeStudentOne,"id"));
    }

    @Test
    public void invokePrivateMethod() {
        assertEquals("abc 1", ReflectionTestUtils.invokeMethod(collegeStudentOne,"getFirstNameAndId"));
    }
}
