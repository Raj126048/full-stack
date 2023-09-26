package com.example.demo.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="stu")
public class Student {

    @Id
    private String _id;
    private String studentname;
    private String studentaddress;
    private String mobile;
    private String gender;
    private String division;


    public Student(String _id, String studentname, String studentaddress, String mobile,String gender,String division) {
        this._id = _id;
        this.studentname = studentname;
        this.studentaddress = studentaddress;
        this.mobile = mobile;
        this.gender= gender;
        this.division= division;
    }


    public Student() {
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getStudentaddress() {
        return studentaddress;
    }

    public void setStudentaddress(String studentaddress) {
        this.studentaddress = studentaddress;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "_id='" + _id + '\'' +
                ", studentname='" + studentname + '\'' +
                ", studentaddress='" + studentaddress + '\'' +
                ", mobile='" + mobile + '\'' +
                ", division='" + division + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
