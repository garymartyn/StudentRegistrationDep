/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part1.studentregistrationdep;

import java.util.ArrayList;

/**
 *
 * @author gary
 */
public class Module {

    private String name;
    private String ID;
    private ArrayList<Student> students;
    private Course course;

    public Module(String name, String ID, ArrayList<Student> studentsArray) {

        this.name = name;
        this.ID = ID;
        this.students = studentsArray;
        this.updateStudentInfo(studentsArray);

    }

    //Methods
    public void getStudentInfo() {
        for (int i = 0; i < this.students.size(); i++) {
//            students.get(i).getName();
//            students.get(i).getID();
            System.out.println("Student Name: " + students.get(i).getName() + " -ID : " + students.get(i).getID());
        }
    }

    public void updateStudentInfo(ArrayList<Student> sts) {
        for (int i = 0; i < sts.size(); i++) {
            sts.get(i).addModule(this);
        }
    }

    //add add ArrayList<Student> to the students array
    public void addStudents(ArrayList<Student> studentsToAdd) {
        for (int i = 0; i < students.size(); i++) {
            this.students.add(studentsToAdd.get(i));
        }
    }

    //add one student
    public void addStudent(Student person) {
        this.students.add(person);
    }

    //getters and setters
    public void setCourse(Course c) {
        this.course = c;
    }

    public Course getCourse() {
        return this.course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        ID = iD;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> sts) {
        this.students = sts;
    }
}
