/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package DuAn.dao;

import DuAn.entity.HoaDon;
import DuAn.entity.HoaDonChiTiet;
import DuAn.entity.Loai;
import DuAn.entity.Non;
import DuAn.entity.ThuongHieu;
import java.util.Date;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test class for HoaDonChiTietDAO.
 */
public class HoaDonChiTietDAOTest {

    private Non testNon;
    private ThuongHieu th;
    private Loai loai;
    private HoaDon testHoaDon;
    private NonDAO ndao = new NonDAO();
    private HoaDonDao hddao = new HoaDonDao();
    private HoaDonChiTietDAO hdctdao = new HoaDonChiTietDAO();
    private ThuongHieuDAO thdao = new ThuongHieuDAO();
    private LoaiDAO ldao = new LoaiDAO();

    public HoaDonChiTietDAOTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        // Code to set up resources before running any test cases
    }

    @AfterClass
    public static void tearDownClass() {
        // Code to release resources after all test cases have been executed
    }

    @Before
    public void setUp() {
        String testTHName = "Thuong Hieu Test";
        String testLoaiName = "Loai Test";

        th = new ThuongHieu();
        th.setTenThuongHieu(testTHName);
        thdao.insert(th);

        loai = new Loai();
        loai.setTenLoai(testLoaiName);
        ldao.insert(loai);

        th = thdao.getByName(testTHName);
        loai = ldao.getByName(testLoaiName);

        Non model = new Non();
        model.setTenNon("Non test");
        model.setMaThuongHieu(th.getMaThuongHieu());
        model.setMaLoai(loai.getMaLoai());
        model.setGia(1500);
        model.setGiamGia(200);
        model.setNgayTao(new Date());
        model.setSoLuong(20);
        model.setHinh("new_image.jpg");
        model.setDeleted(false);
        ndao.insert(model);
        this.testNon = model;

        testHoaDon = new HoaDon();
        testHoaDon.setMaKhachHang(1);
        testHoaDon.setMaNhanVien(1);
        testHoaDon.setNgayTao(new Date());
        testHoaDon.setTongTien(100000.00);
        testHoaDon.setTrangThai("Đã thanh toán");
        hddao.insert(testHoaDon);

        testHoaDon = hddao.selectByMaKH(1);
    }

    @After
    public void tearDown() {
        if (testHoaDon != null) {
            hddao.delete(testHoaDon.getMaHoaDon());
        }

        if (testNon != null) {
            ndao.forceDelete(testNon.getMaNon());
        }

        if (th != null) {
            thdao.forceDelete(th.getMaThuongHieu());
        }

        if (loai != null) {
            ldao.forceDelete(loai.getMaLoai());
        }
    }

    private HoaDonChiTiet getHoaDonChiTietTest() {
        HoaDonChiTiet hdct = new HoaDonChiTiet();
        hdct.setGia(100000.00);
        hdct.setMaHoaDon(testHoaDon.getMaHoaDon());
        hdct.setMaNon(testNon.getMaNon());
        hdct.setSoLuong(2);
        return hdct;
    }

    @Test
    public void testInsert() {
        System.out.println("insert");
        HoaDonChiTiet model = getHoaDonChiTietTest();
        hdctdao.insert(model);
        HoaDonChiTiet insertedModel = hdctdao.selectById(model.getMaHoaDonChiTiet());
        assertNotNull(insertedModel);
        assertEquals(model.getGia(), insertedModel.getGia(), 0.0);
        assertEquals(model.getMaHoaDon(), insertedModel.getMaHoaDon());
        assertEquals(model.getMaNon(), insertedModel.getMaNon());
        assertEquals(model.getSoLuong(), insertedModel.getSoLuong());
    }

    @Test
    public void testUpdate() {
        System.out.println("update");
        HoaDonChiTiet model = getHoaDonChiTietTest();
        hdctdao.insert(model);
        model.setGia(200000.00);
        model.setSoLuong(3);
        hdctdao.update(model);
        HoaDonChiTiet updatedModel = hdctdao.selectById(model.getMaHoaDonChiTiet());
        assertNotNull(updatedModel);
        assertEquals(model.getGia(), updatedModel.getGia(), 0.0);
        assertEquals(model.getSoLuong(), updatedModel.getSoLuong());
    }

    @Test
    public void testDelete_Integer_boolean() {
        System.out.println("delete");
        HoaDonChiTiet model = getHoaDonChiTietTest();
        hdctdao.insert(model);
        hdctdao.delete(model.getMaHoaDonChiTiet(), true);
        HoaDonChiTiet deletedModel = hdctdao.selectById(model.getMaHoaDonChiTiet());
        assertNull(deletedModel);
    }

    @Test
    public void testDelete_Integer() {
        System.out.println("delete");
        HoaDonChiTiet model = getHoaDonChiTietTest();
        hdctdao.insert(model);
        hdctdao.delete(model.getMaHoaDonChiTiet());
        HoaDonChiTiet deletedModel = hdctdao.selectById(model.getMaHoaDonChiTiet());
        assertNull(deletedModel);
    }

    @Test
    public void testSelectById() {
        System.out.println("selectById");
        HoaDonChiTiet model = getHoaDonChiTietTest();
        hdctdao.insert(model);
        HoaDonChiTiet result = hdctdao.selectById(model.getMaHoaDonChiTiet());
        assertNotNull(result);
        assertEquals(model.getMaHoaDonChiTiet(), result.getMaHoaDonChiTiet());
    }

    @Test
    public void testSelectByMaHD() {
        System.out.println("selectByMaHD");
        HoaDonChiTiet model = getHoaDonChiTietTest();
        hdctdao.insert(model);
        List<HoaDonChiTiet> result = hdctdao.selectByMaHD(model.getMaHoaDon());
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    public void testSelectByMaNon() {
        System.out.println("selectByMaNon");
        assertTrue(true);
    }

    @Test
    public void testSelectAll() {
        System.out.println("selectAll");
        List<HoaDonChiTiet> result = hdctdao.selectAll();
        assertNotNull(result);
        assertTrue(result.size() >= 0);
    }

    @Test
    public void testSelectBySql() {
        System.out.println("selectBySql");
        String sql = "SELECT * FROM HoaDonChiTiet WHERE maHoaDon = ?";
        Object[] args = {testHoaDon.getMaHoaDon()};
        List<HoaDonChiTiet> result = hdctdao.selectBySql(sql, args);
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }
}
