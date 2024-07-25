package DuAn.dao;

import DuAn.entity.HoaDon;
import DuAn.entity.Non;
import DuAn.entity.ThuongHieu;
import DuAn.entity.Loai;
import DuAn.utils.XJDBC;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test class for HoaDonDao.
 */
public class HoaDonDaoTest {

    private HoaDon testHoaDon;
    private ThuongHieu th;
    private Loai loai;
    private Non testNon;
    private static HoaDonDao hddao = new HoaDonDao();
    private static ThuongHieuDAO thdao = new ThuongHieuDAO();
    private static LoaiDAO ldao = new LoaiDAO();
    private static NonDAO ndao = new NonDAO();

    public HoaDonDaoTest() {
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
        String testTHName = "Thuong Hieu Test In TestHoaDon";
        String testLoaiName = "Loai TestIn TestHoaDon";

        th = new ThuongHieu();
        th.setTenThuongHieu(testTHName);
        thdao.insert(th);

        loai = new Loai();
        loai.setTenLoai(testLoaiName);
        ldao.insert(loai);

        th = thdao.getByName(testTHName);
        loai = ldao.getByName(testLoaiName);

        Non model = new Non();
        model.setTenNon("Non test in test hoa don");
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
        testHoaDon.setTrangThai("Pending");
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

    @Test
    public void testInsert() {
        System.out.println("insert");
        HoaDon model = new HoaDon();
        model.setMaKhachHang(2);
        model.setMaNhanVien(1);
        model.setNgayTao(new Date());
        model.setTongTien(50000.00);
        model.setTrangThai("Pending");
        hddao.insert(model);

        HoaDon insertedModel = hddao.selectByMaKH(2);
        assertNotNull(insertedModel);
    }

    @Test
    public void testUpdate() {
        System.out.println("update");
        testHoaDon.setTongTien(200000.00);
        testHoaDon.setTrangThai("Completed");
        hddao.update(testHoaDon);

        HoaDon updatedModel = hddao.selectById(testHoaDon.getMaHoaDon());
        assertNotNull(updatedModel);
        assertEquals(testHoaDon.getTongTien(), updatedModel.getTongTien(), 0.0);
        assertEquals(testHoaDon.getTrangThai(), updatedModel.getTrangThai());
    }

    @Test
    public void testDelete_Integer_boolean() {
        System.out.println("delete with soft delete");
        hddao.delete(testHoaDon.getMaHoaDon(), true);
        HoaDon deletedModel = hddao.selectById(testHoaDon.getMaHoaDon());
        assertNotNull(deletedModel);
        assertEquals("1", deletedModel.getTrangThai());
    }

    @Test
    public void testDelete_Integer() {
        System.out.println("delete with hard delete");
        hddao.delete(testHoaDon.getMaHoaDon());
        HoaDon deletedModel = hddao.selectById(testHoaDon.getMaHoaDon());
        assertNull(deletedModel);
    }

    @Test
    public void testSelectById() {
        System.out.println("selectById");
        HoaDon result = hddao.selectById(testHoaDon.getMaHoaDon());
        assertNotNull(result);
        assertEquals(testHoaDon.getMaHoaDon(), result.getMaHoaDon());
    }

    @Test
    public void testSelectByMaKH() {
        System.out.println("selectByMaKH");
        HoaDon result = hddao.selectByMaKH(testHoaDon.getMaKhachHang());
        assertNotNull(result);
    }

    @Test
    public void testSelectAll() {
        System.out.println("selectAll");
        List<HoaDon> result = hddao.selectAll();
        assertNotNull(result);
        assertTrue(result.size() > 0);
    }

    @Test
    public void testSelectBySql() {
        System.out.println("selectBySql");
        String sql = "SELECT * FROM HoaDon WHERE MaKhachHang = ?";
        List<HoaDon> result = hddao.selectBySql(sql, testHoaDon.getMaKhachHang());
        assertNotNull(result);
        assertTrue(result.size() > 0);
    }

    @Test
    public void testGenerateNewId() throws SQLException {
        System.out.println("generateNewId");
        String newId = hddao.generateNewId();
        assertNotNull(newId);
        assertTrue(newId.startsWith("HD"));
    }
}
