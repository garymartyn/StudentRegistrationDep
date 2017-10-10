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
	
	public Module(String name, String ID, ArrayList<Student> studentsArray)  {
	
		this.name=name;
		this.ID=ID;
		this.students= studentsArray;
	}
	
	
	//getters and setters
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

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
}
