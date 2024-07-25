/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package DuAn.dao;

import DuAn.entity.KhachHang;
import java.util.Date;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author dinhh
 */
public class KhachHangDAOTest {

    private String sdtKhachHangTest = "0345677891";
    private KhachHangDAO khdao = new KhachHangDAO();

    public KhachHangDAOTest() {
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
        KhachHang kh = khdao.getBySDT(sdtKhachHangTest);
        if (kh != null) {
            khdao.forceDelete(kh.getMaKhachHang());
        }
    }

    /**
     * Test of insert method, of class KhachHangDAO.
     */
    private KhachHang getKhachHangTest() {

        KhachHang model = new KhachHang();
        model.setDeleted(false);
        model.setHinh("KhachHangTestHinh");
        model.setEmail("kh@gmail.com");
        model.setGioiTinh(false);

        model.setNgayGiaNhap(new Date());
        model.setSoDienThoai(sdtKhachHangTest);
        model.setTenKhachHang("TenKHTest");
        return model;
    }

    @Test
    public void testInsert() {
        System.out.println("insert");
        KhachHang model = getKhachHangTest();
        khdao.insert(model);
        model = khdao.getBySDT(sdtKhachHangTest);
        assertNotNull(model);
    }

    @Test(expected = RuntimeException.class)
    public void testInsertConflict() {
        System.out.println("insert conflict");
        KhachHang model = getKhachHangTest();
        khdao.insert(model);
        khdao.insert(model);

    }

    /**
     * Test of update method, of class KhachHangDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        KhachHang model = getKhachHangTest();
        khdao.insert(model);
        model = khdao.getBySDT(sdtKhachHangTest);
        assertNotNull(model);
        model.setGioiTinh(true);
        khdao.update(model);
        KhachHang updated = khdao.getBySDT(sdtKhachHangTest);
        assertNotNull(updated);
        assertTrue(updated.isGioiTinh());

    }

    /**
     * Test of delete method, of class KhachHangDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        KhachHang model = getKhachHangTest();
        khdao.insert(model);
        model = khdao.getBySDT(sdtKhachHangTest);
        assertNotNull(model);
        khdao.forceDelete(model.getMaKhachHang());

        KhachHang deleted = khdao.getBySDT(sdtKhachHangTest);
        assertNull(deleted);

    }

    /**
     * Test of selectAll method, of class KhachHangDAO.
     */
    @Test
    public void testSelectAll() {
        System.out.println("selectAll");
        KhachHang model = getKhachHangTest();
        khdao.insert(model);
        model = khdao.getBySDT(sdtKhachHangTest);
        assertNotNull(model);
        List<KhachHang> list = khdao.selectAll();
        assertNotNull(list);
        assertTrue(list.size() >= 0);
    }

    /**
     * Test of selectById method, of class KhachHangDAO.
     */
    @Test
    public void testSelectById() {
        System.out.println("selectById");
        KhachHang model = getKhachHangTest();
        khdao.insert(model);
        model = khdao.getBySDT(sdtKhachHangTest);
        assertNotNull(model);
        KhachHang kh = khdao.selectById(model.getMaKhachHang());
        assertNotNull(kh);
    }

    /**
     * Test of selectBySql method, of class KhachHangDAO.
     */
    @Test
    public void testSelectBySql() {
        System.out.println("selectBySql");
        KhachHang model = getKhachHangTest();
        khdao.insert(model);
        model = khdao.getBySDT(sdtKhachHangTest);
        assertNotNull(model);
        String sql = "SELECT * FROM KHACHHANG";
        List<KhachHang> result = khdao.selectBySql(sql);
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    /**
     * Test of getBySDT method, of class KhachHangDAO.
     */
    @Test
    public void testGetBySDT() {
        System.out.println("getBySDT");
        KhachHang model = getKhachHangTest();
        khdao.insert(model);
        model = khdao.getBySDT(sdtKhachHangTest);
        assertNotNull(model);
    }

    /**
     * Test of generateNewId method, of class KhachHangDAO.
     */
 @Test
public void testGenerateNewId() throws Exception {
    System.out.println("generateNewId");
    String id = khdao.generateNewId();
    assertNotNull(id);
    assertTrue(id instanceof String); // Check if id is an instance of String
}

}
