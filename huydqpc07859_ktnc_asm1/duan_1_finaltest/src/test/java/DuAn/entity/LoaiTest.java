/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package DuAn.entity;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dinhh
 */
public class LoaiTest {

    private Loai instance;

    @BeforeClass
    public static void setUpClass() {
        // Code to run before all tests
    }

    @AfterClass
    public static void tearDownClass() {
        // Code to run after all tests
    }

    @Before
    public void setUp() {
        instance = new Loai();
    }

    @After
    public void tearDown() {
        // Code to run after each test
    }

    /**
     * Test of toString method, of class Loai.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "";
        instance.setTenLoai(expResult);
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMaLoai method, of class Loai.
     */
    @Test
    public void testGetMaLoai() {
        System.out.println("getMaLoai");
        int expResult = 0;
        instance.setMaLoai(expResult);
        int result = instance.getMaLoai();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMaLoai method, of class Loai.
     */
    @Test
    public void testSetMaLoai() {
        System.out.println("setMaLoai");
        int maLoai = 1;
        instance.setMaLoai(maLoai);
        assertEquals(maLoai, instance.getMaLoai());
    }

    /**
     * Test of getTenLoai method, of class Loai.
     */
    @Test
    public void testGetTenLoai() {
        System.out.println("getTenLoai");
        String expResult = "Loai1";
        instance.setTenLoai(expResult);
        String result = instance.getTenLoai();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTenLoai method, of class Loai.
     */
    @Test
    public void testSetTenLoai() {
        System.out.println("setTenLoai");
        String tenLoai = "Loai1";
        instance.setTenLoai(tenLoai);
        assertEquals(tenLoai, instance.getTenLoai());
    }

    /**
     * Test of isDeleted method, of class Loai.
     */
    @Test
    public void testIsDeleted() {
        System.out.println("isDeleted");
        boolean expResult = false;
        instance.setDeleted(expResult);
        boolean result = instance.isDeleted();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDeleted method, of class Loai.
     */
    @Test
    public void testSetDeleted() {
        System.out.println("setDeleted");
        boolean deleted = true;
        instance.setDeleted(deleted);
        assertEquals(deleted, instance.isDeleted());
    }
}
