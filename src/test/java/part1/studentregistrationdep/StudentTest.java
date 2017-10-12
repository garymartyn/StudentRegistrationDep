/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part1.studentregistrationdep;

import org.joda.time.LocalDate;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gary
 */
public class StudentTest {

    public StudentTest() {
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

    /*unit test to check username should assertFalse*/
    @Test
    public void studentTest2() {
        Student s1 = new Student("Test Student", new LocalDate(1995, 4, 24), "1455400000");

        assertFalse(s1.getUsername().equals("Test Student50"));
    }

    /*unit test to check username - should be assertTrue*/
    @Test
    public void test2() {
        Student s = new Student("john smith", new LocalDate(1995, 5, 10), "14520");
        assertTrue(s.getAge() == 22);
    }

}
