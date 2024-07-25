/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package DuAn.entity;

import java.util.Date;
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
public class KhachHangTest {

    private static KhachHang khachHang;

    @BeforeClass
    public static void setUpClass() {
        khachHang = new KhachHang();
    }

    @AfterClass
    public static void tearDownClass() {
        // Clean up after all tests are done
    }

    @Before
    public void setUp() {
        // Setup before each test
    }

    @After
    public void tearDown() {
        // Cleanup after each test
    }

    @Test
    public void testSetAndGetMaKhachHang() {
        khachHang.setMaKhachHang(1);
        assertEquals(1, khachHang.getMaKhachHang());
    }

    @Test
    public void testSetAndGetTenKhachHang() {
        khachHang.setTenKhachHang("John Doe");
        assertEquals("John Doe", khachHang.getTenKhachHang());
    }

    @Test
    public void testSetAndGetNgaySinh() {
        Date date = new Date();
        khachHang.setNgaySinh(date);
        assertEquals(date, khachHang.getNgaySinh());
    }

    @Test
    public void testSetAndGetSoDienThoai() {
        khachHang.setSoDienThoai("1234567890");
        assertEquals("1234567890", khachHang.getSoDienThoai());
    }

    @Test
    public void testSetAndGetEmail() {
        khachHang.setEmail("john.doe@example.com");
        assertEquals("john.doe@example.com", khachHang.getEmail());
    }

    @Test
    public void testSetAndGetNgayGiaNhap() {
        Date date = new Date();
        khachHang.setNgayGiaNhap(date);
        assertEquals(date, khachHang.getNgayGiaNhap());
    }

    @Test
    public void testSetAndGetDeleted() {
        khachHang.setDeleted(true);
        assertTrue(khachHang.isDeleted());
    }

    @Test
    public void testSetAndGetGioiTinh() {
        khachHang.setGioiTinh(true);
        assertTrue(khachHang.isGioiTinh());
    }

    @Test
    public void testSetAndGetHinh() {
        khachHang.setHinh("image.jpg");
        assertEquals("image.jpg", khachHang.getHinh());
    }

    @Test
    public void testToString() {
        khachHang.setSoDienThoai("1234567890");
        assertEquals("1234567890", khachHang.toString());
    }
}
