package com.luv2code.test;

import com.luv2code.component.MvcTestingExampleApplication;
import com.luv2code.component.dao.ApplicationDao;
import com.luv2code.component.models.CollegeStudent;
import com.luv2code.component.models.StudentGrades;
import com.luv2code.component.service.ApplicationService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.*;

@SpringBootTest(classes = MvcTestingExampleApplication.class)
public class MockAnnotationTest {

    @Autowired
    ApplicationContext context;

    @Autowired
    CollegeStudent studentOne;

    @Autowired
    StudentGrades studentGrades;

//    @Mock
//    private ApplicationDao applicationDao;
//
//    @InjectMocks
//    private ApplicationService applicationService;

    @MockitoBean
    private ApplicationDao applicationDao;

    @Autowired
    private ApplicationService applicationService;

    @BeforeEach
    public void setUp(){
        studentOne.setFirstname("Eric");
        studentOne.setLastname("Roby");
        studentOne.setEmailAddress("eric.roby@luv2code_school.com");
        studentOne.setStudentGrades(studentGrades);
    }

    @DisplayName("When & Verify")
    @Test
    public void assertEqualsTestAddGrades() {
        when(applicationDao.addGradeResultsForSingleClass(
                studentGrades.getMathGradeResults())).thenReturn(100.0);

        assertEquals(100.0, applicationService.addGradeResultsForSingleClass(
                studentOne.getStudentGrades().getMathGradeResults()));

        assertNotEquals(120.0, applicationService.addGradeResultsForSingleClass(
                studentOne.getStudentGrades().getMathGradeResults()));

        // verify how many times addGradeResultsForSingleClass being called in this test
        verify(applicationDao, times(2)).
                addGradeResultsForSingleClass(studentOne.getStudentGrades().getMathGradeResults());

    }

    @DisplayName("Find GPA")
    @Test
    public void assertEqualsTestFindGPA() {
        when(applicationDao.findGradePointAverage(
                studentGrades.getMathGradeResults())).thenReturn(72.5);

        assertEquals(72.5, applicationService.findGradePointAverage(
                studentOne.getStudentGrades().getMathGradeResults()));

        assertNotEquals(120.0, applicationService.findGradePointAverage(
                studentOne.getStudentGrades().getMathGradeResults()));

        // verify how many times addGradeResultsForSingleClass being called in this test
        verify(applicationDao, times(2)).
                findGradePointAverage(studentOne.getStudentGrades().getMathGradeResults());

    }


    // mock to throw an exception look at pdf in the end

}
