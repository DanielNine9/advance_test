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
public class NhanVienTest {
    
    private NhanVien nhanVien;

    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        nhanVien = new NhanVien();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetSdt() {
        System.out.println("getSdt");
        nhanVien.setSdt("1234567890");
        assertEquals("1234567890", nhanVien.getSdt());
    }

    @Test
    public void testSetSdt() {
        System.out.println("setSdt");
        nhanVien.setSdt("1234567890");
        assertEquals("1234567890", nhanVien.getSdt());
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        nhanVien.setSdt("1234567890");
        assertEquals("1234567890", nhanVien.toString());
    }

    @Test
    public void testGetOtp() {
        System.out.println("getOtp");
        nhanVien.setOtp("123456");
        assertEquals("123456", nhanVien.getOtp());
    }

    @Test
    public void testSetOtp() {
        System.out.println("setOtp");
        nhanVien.setOtp("123456");
        assertEquals("123456", nhanVien.getOtp());
    }

    @Test
    public void testIsDeleted() {
        System.out.println("isDeleted");
        nhanVien.setDeleted(true);
        assertTrue(nhanVien.isDeleted());
    }

    @Test
    public void testSetDeleted() {
        System.out.println("setDeleted");
        nhanVien.setDeleted(true);
        assertTrue(nhanVien.isDeleted());
    }

    @Test
    public void testGetHinh() {
        System.out.println("getHinh");
        nhanVien.setHinh("image.jpg");
        assertEquals("image.jpg", nhanVien.getHinh());
    }

    @Test
    public void testSetHinh() {
        System.out.println("setHinh");
        nhanVien.setHinh("image.jpg");
        assertEquals("image.jpg", nhanVien.getHinh());
    }

    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        nhanVien.setEmail("john.doe@example.com");
        assertEquals("john.doe@example.com", nhanVien.getEmail());
    }

    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        nhanVien.setEmail("john.doe@example.com");
        assertEquals("john.doe@example.com", nhanVien.getEmail());
    }

    @Test
    public void testGetMaNV() {
        System.out.println("getMaNV");
        nhanVien.setMaNV(1);
        assertEquals(1, nhanVien.getMaNV());
    }

    @Test
    public void testSetMaNV() {
        System.out.println("setMaNV");
        nhanVien.setMaNV(1);
        assertEquals(1, nhanVien.getMaNV());
    }

    @Test
    public void testGetMatKhau() {
        System.out.println("getMatKhau");
        nhanVien.setMatKhau("password");
        assertEquals("password", nhanVien.getMatKhau());
    }

    @Test
    public void testSetMatKhau() {
        System.out.println("setMatKhau");
        nhanVien.setMatKhau("password");
        assertEquals("password", nhanVien.getMatKhau());
    }

    @Test
    public void testGetHoTen() {
        System.out.println("getHoTen");
        nhanVien.setHoTen("John Doe");
        assertEquals("John Doe", nhanVien.getHoTen());
    }

    @Test
    public void testSetHoTen() {
        System.out.println("setHoTen");
        nhanVien.setHoTen("John Doe");
        assertEquals("John Doe", nhanVien.getHoTen());
    }

    @Test
    public void testIsVaiTro() {
        System.out.println("isVaiTro");
        nhanVien.setVaiTro(true);
        assertTrue(nhanVien.isVaiTro());
    }

    @Test
    public void testSetVaiTro() {
        System.out.println("setVaiTro");
        nhanVien.setVaiTro(true);
        assertTrue(nhanVien.isVaiTro());
    }
}
