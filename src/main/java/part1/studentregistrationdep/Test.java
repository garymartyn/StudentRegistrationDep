/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part1.studentregistrationdep;

import org.joda.time.LocalDate;

/**
 *
 * @author gary
 */
public class Test {

    public static void main(String args[]) {
        // Course s = new Course("joe");

        //   System.out.println("course is " + s.getName());
        System.out.println("yoo");
        System.out.println("cunt");

        Student st = new Student("gary martyn", new LocalDate(1996, 5, 20), "14520687");
        System.out.println("-----------------");
//
        System.out.println("student age is " + st.getAge());
        System.out.println("student username is " + st.getUsername());
    }
}
