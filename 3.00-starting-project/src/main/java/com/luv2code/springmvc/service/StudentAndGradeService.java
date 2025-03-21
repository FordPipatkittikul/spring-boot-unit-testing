package com.luv2code.springmvc.service;

import com.luv2code.springmvc.models.CollegeStudent;
import com.luv2code.springmvc.repository.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class StudentAndGradeService {

    @Autowired
    StudentDao studentDao;

    public void createStudent(String firstname, String lastname, String emailAddress){
        CollegeStudent student = new CollegeStudent(firstname, lastname, emailAddress);

        studentDao.save(student);
    }

    public boolean checkIfStudentIsNotNull(int id) {
        Optional<CollegeStudent> student = studentDao.findById(id);
        if (student.isPresent()) {
            return true;
        }
        return false;
    }

    public void deleteStudent(int id) {
        if (checkIfStudentIsNotNull(id)){
            studentDao.deleteById(id);
        }

    }

    public Iterable<CollegeStudent> getGradebook() {
        return studentDao.findAll();
    }
}
