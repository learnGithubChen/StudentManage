package com.student.model;

/**学生信息类
 * Created by peter on 2017/2/17.
 */
public class StudentInfo {
    public String studentID;//学号
    public String studentName;//姓名
    public String sex;//性别
    public String age;//年龄
    public String major;//专业

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getSex() {
        return sex;
    }

    public String getAge() {
        return age;
    }

    public String getMajor() {
        return major;
    }
}
