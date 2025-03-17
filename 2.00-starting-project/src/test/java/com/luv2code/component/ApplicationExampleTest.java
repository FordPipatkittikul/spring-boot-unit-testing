package com.luv2code.component;

import com.luv2code.component.models.CollegeStudent;
import com.luv2code.component.models.StudentGrades;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ApplicationExampleTest {

    @Value("${info.school.name}")
    private String schoolName;

    @Value("${info.app.name}")
    private String appName;

    @Value("${info.app.description}")
    private String appDesc;

    @Value("${info.app.version}")
    private String appVersion;

    @Autowired
    CollegeStudent student;

    @Autowired
    StudentGrades studentGrades;

    @Autowired
    ApplicationContext context;

    @BeforeEach
    void setUp(){
        student.setFirstname("abc");
        student.setLastname("vercoic");
        student.setEmailAddress("abc@gmail.com");
        studentGrades.setMathGradeResults(new ArrayList<>(Arrays.asList(100.0,25.0,30.0)));
        student.setStudentGrades(studentGrades);
    }

    @DisplayName("Add grade results for student grades")
    @Test
    public void addGradeResultsForStudentGrades(){
        assertEquals(155, studentGrades.addGradeResultsForSingleClass(
                student.getStudentGrades().getMathGradeResults()
        ),"Failure - should be 155");
    }

    @DisplayName("Add grade results for student grades not equal")
    @Test
    public void addGradeResultsForStudentGradesNotEquals() {
        assertNotEquals(125, studentGrades.addGradeResultsForSingleClass(
                student.getStudentGrades().getMathGradeResults()
        ),"Failure - should not be 155");
    }

    @DisplayName("Is grade greater")
    @Test
    public void isGradeGreaterStudentGrades(){
        assertTrue(studentGrades.isGradeGreater(90.5,81.5),"Failure - gradeOne should more than gradeTwo");
    }

    @DisplayName("Is grade greater false")
    @Test
    public void isGradeGreaterStudentGradesFalse(){
        assertFalse(studentGrades.isGradeGreater(81.5,90.5),"Failure - gradeOne should less than gradeTwo");
    }

    @DisplayName("Check Null for student grades")
    @Test
    public void checkNullForStudentGrades(){
        assertNotNull(studentGrades.checkNull(student.getStudentGrades().getMathGradeResults()),"Failure - obj should not null");
    }

    @DisplayName("Create student without grade init")
    @Test
    public void createStudentWithoutGradesInit() {
        CollegeStudent studentTwo = context.getBean("collegeStudent", CollegeStudent.class);
        studentTwo.setFirstname("xyz");
        studentTwo.setLastname("ajak");
        studentTwo.setEmailAddress("xyz@gmail.com");
        assertNotNull(studentTwo.getFirstname(), "Failure - Firstname should not be null");
        assertNotNull(studentTwo.getLastname(), "Failure - Lastname should not be null");
        assertNotNull(studentTwo.getEmailAddress(), "Failure - EmailAddress should not be null");
        assertNull(studentTwo.getStudentGrades(), "Failure - StudentGrades should be null");
    }

    @DisplayName("Create student without grade init")
    @Test
    public void verifyStudentsArePrototypes() {
        CollegeStudent studentTwo = context.getBean("collegeStudent", CollegeStudent.class);
        assertNotSame(student, studentTwo, "Failure - Should not be same Object");
    }

    @DisplayName("Find Grade Point Average")
    @Test
    public void findGradePointAverage() {
        assertAll("Testing all assertEquals",
                () -> assertEquals(155, studentGrades.addGradeResultsForSingleClass(
                        student.getStudentGrades().getMathGradeResults()
                ),"Failure - should be 155"),
                () -> assertEquals(51.67,studentGrades.findGradePointAverage(
                        student.getStudentGrades().getMathGradeResults()
                ),"Failure - should be 51.67")
        );
    }
}
