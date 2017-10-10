/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part1.studentregistrationdep;

/**
 *
 * @author gary
 */
public class Student {
    
    	private String name;
	private String age;
	private String DOB;
	private String ID;
	private String username;
	
	/*Constructor*/
	public Student(String name, String age, String DOB,String ID) {
		this.name=name;
		this.age=age;
		this.DOB=DOB;
		this.ID=ID;
		this.username=name+age;
	}
	
	/*Getters and Setters*/
	public String getUsername() {
		return this.name+this.age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
}
