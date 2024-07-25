/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package DuAn.dao;

import java.util.List;
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
public class ThongKeDAOTest {
    
    public ThongKeDAOTest() {
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

    /**
     * Test of getSoLuongSanPhamLoai method, of class ThongKeDAO.
     */
    @Test
    public void testGetSoLuongSanPhamLoai() {
        System.out.println("getSoLuongSanPhamLoai");
        ThongKeDAO instance = new ThongKeDAO();
        List expResult = null;
        List result = instance.getSoLuongSanPhamLoai();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSoLuongSanPhamThuongHieu method, of class ThongKeDAO.
     */
    @Test
    public void testGetSoLuongSanPhamThuongHieu() {
        System.out.println("getSoLuongSanPhamThuongHieu");
        ThongKeDAO instance = new ThongKeDAO();
        List expResult = null;
        List result = instance.getSoLuongSanPhamThuongHieu();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDoanhThuHomNay method, of class ThongKeDAO.
     */
    @Test
    public void testGetDoanhThuHomNay() {
        System.out.println("getDoanhThuHomNay");
        ThongKeDAO instance = new ThongKeDAO();
        List expResult = null;
        List result = instance.getDoanhThuHomNay();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDoanhThu method, of class ThongKeDAO.
     */
    @Test
    public void testGetDoanhThu_0args() {
        System.out.println("getDoanhThu");
        ThongKeDAO instance = new ThongKeDAO();
        List expResult = null;
        List result = instance.getDoanhThu();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sp_getDoanhThuTheoThang method, of class ThongKeDAO.
     */
    @Test
    public void testSp_getDoanhThuTheoThang() {
        System.out.println("sp_getDoanhThuTheoThang");
        ThongKeDAO instance = new ThongKeDAO();
        List expResult = null;
        List result = instance.sp_getDoanhThuTheoThang();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sp_getDoanhThuTheoNam method, of class ThongKeDAO.
     */
    @Test
    public void testSp_getDoanhThuTheoNam() {
        System.out.println("sp_getDoanhThuTheoNam");
        ThongKeDAO instance = new ThongKeDAO();
        List expResult = null;
        List result = instance.sp_getDoanhThuTheoNam();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKhachHangMuaNhieuNhat method, of class ThongKeDAO.
     */
    @Test
    public void testGetKhachHangMuaNhieuNhat() {
        System.out.println("getKhachHangMuaNhieuNhat");
        ThongKeDAO instance = new ThongKeDAO();
        List expResult = null;
        List result = instance.getKhachHangMuaNhieuNhat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTongTienKhachHang method, of class ThongKeDAO.
     */
    @Test
    public void testGetTongTienKhachHang() {
        System.out.println("getTongTienKhachHang");
        ThongKeDAO instance = new ThongKeDAO();
        List expResult = null;
        List result = instance.getTongTienKhachHang();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTrangThaiHoaDon method, of class ThongKeDAO.
     */
    @Test
    public void testGetTrangThaiHoaDon() {
        System.out.println("getTrangThaiHoaDon");
        ThongKeDAO instance = new ThongKeDAO();
        List expResult = null;
        List result = instance.getTrangThaiHoaDon();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDoanhThu method, of class ThongKeDAO.
     */
    @Test
    public void testGetDoanhThu_String_String() {
        System.out.println("getDoanhThu");
        String thangTruoc = "";
        String thangSau = "";
        ThongKeDAO instance = new ThongKeDAO();
        List expResult = null;
        List result = instance.getDoanhThu(thangTruoc, thangSau);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
