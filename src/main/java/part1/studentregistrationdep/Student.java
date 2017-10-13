/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part1.studentregistrationdep;

import java.util.ArrayList;
import org.joda.time.LocalDate;
import org.joda.time.Years;

/**
 *
 * @author gary
 */
public class Student {

    private String name;
    private int age;
    private LocalDate DOB; //form (year,month,day)
    private String ID;
    private String username;

    private ArrayList<Module> modules = new ArrayList<Module>();
    private String course;

    /*Constructor*/
    public Student(String name, LocalDate DOB, String ID) {
        this.name = name;
        LocalDate now = LocalDate.now();
        Years numYears = Years.yearsBetween(DOB, now);
        this.age = numYears.getYears();
        this.DOB = DOB;
        this.ID = ID;
        this.username = name + age;
    }

    /*Getters and Setters*/
    public ArrayList<Module> getModules() {
        return this.modules;
    }

    public void addModule(Module mod) {
        this.modules.add(mod);
    }

    public void setCourse(String crs) {
        this.course = crs;
    }

    public String getCourse() {
        return this.course;
    }

    public String getUsername() {
        return this.name + this.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

}
