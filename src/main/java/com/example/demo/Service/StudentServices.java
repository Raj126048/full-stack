package com.example.demo.Service;

import com.example.demo.Entity.Student;
import com.example.demo.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServices {

    @Autowired
    private StudentRepo repo;

    public void saveorUpdate(Student students) {

        repo.save(students);
    }

    public Iterable<Student> listAll() {

       return this.repo.findAll(Sort.by("studentname"));
    }


    public void deleteStudent(String id) {

        repo.deleteById(id);
    }

    public Student getStudentByID(String studentid) {

        return repo.findById(studentid).get();
    }
}
