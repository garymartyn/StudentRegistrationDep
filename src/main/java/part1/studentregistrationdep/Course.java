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
        
        public Course(String name){
        this.name=name;
        }
    
        public String getName(){
        return this.name;
        }
}
