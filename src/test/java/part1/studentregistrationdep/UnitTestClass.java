/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part1.studentregistrationdep;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.joda.time.LocalDate;

/**
 *
 * @author gary
 */
public class UnitTestClass {

    public UnitTestClass() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    //Two tests to test the getUsername method
    @Test
    public void studentTest1() {
        Student s1 = new Student("Test Student", new LocalDate(1996, 5, 20), "1455400000");

        assertTrue(s1.getUsername().equals("Test Student21"));
    }

    @Test
    public void studentTest2() {
        Student s1 = new Student("Test Student", new LocalDate(1995, 4, 24), "1455400000");

        assertFalse(s1.getUsername().equals("Test Student50"));
    }

    @Test
    public void test2() {
        Student s = new Student("john smith", new LocalDate(1995, 5, 10), "14520");
        assertTrue(s.getAge() == 22);
    }

}
