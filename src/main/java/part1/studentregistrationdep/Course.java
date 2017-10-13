/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part1.studentregistrationdep;

import java.util.ArrayList;
import org.joda.time.*;

/**
 *
 * @author gary
 */
public class Course {

    private String name;
    private ArrayList<Module> modules;
    private DateTime startDate;
    private DateTime endDate;

    public Course(String name, ArrayList<Module> theModules, DateTime start, DateTime finish) {
        this.name = name;
        this.modules = theModules;
        this.startDate = start;
        this.endDate = finish;
        this.setModuleInfo(theModules);
    }

    //Methods
    public void setModuleInfo(ArrayList<Module> mods) {
        for (int i = 0; i < mods.size(); i++) {
            mods.get(i).setCourse(this);
        }
    }

    public void addModule(Module mod) {
        this.modules.add(mod);
    }

    public void addModules(ArrayList<Module> mods) {
        for (int i = 0; i < mods.size(); i++) {
            this.modules.add(mods.get(i));
        }
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }

}
