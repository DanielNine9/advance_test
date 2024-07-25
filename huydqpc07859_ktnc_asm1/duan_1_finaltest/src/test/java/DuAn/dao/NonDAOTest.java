package DuAn.dao;

import DuAn.entity.Non;
import DuAn.entity.ThuongHieu;
import DuAn.entity.Loai;
import java.util.Date;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class NonDAOTest {

    private NonDAO nonDao = new NonDAO();
    private ThuongHieuDAO thuongHieuDao = new ThuongHieuDAO();
    private LoaiDAO loaiDao = new LoaiDAO();

    private ThuongHieu testThuongHieu;
    private Loai testLoai;
    private Non testNon;

    private String testThuongHieuName = "test thuong hieu11";
    private String testLoaiName = "test loai11";
    private String testNonName = "test non11";

    public NonDAOTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        // Create a test ThuongHieu
        testThuongHieu = new ThuongHieu();
        testThuongHieu.setTenThuongHieu(testThuongHieuName);
        thuongHieuDao.insert(testThuongHieu);

        testThuongHieu = thuongHieuDao.getByName(testThuongHieu.getTenThuongHieu());

        // Create a test Loai
        testLoai = new Loai();
        testLoai.setTenLoai(testLoaiName);
        loaiDao.insert(testLoai);
        testLoai = loaiDao.getByName(testLoai.getTenLoai());

    }

    @After
    public void tearDown() {
        // Delete the test Non
        Non non = nonDao.getByName(testNonName);
        if (non != null) {
            nonDao.forceDelete(non.getMaNon());
        }

        // Delete the test ThuongHieu
        ThuongHieu thuongHieu = thuongHieuDao.getByName(testThuongHieuName);
        if (thuongHieu != null) {
            thuongHieuDao.forceDelete(thuongHieu.getMaThuongHieu());
        }

        // Delete the test Loai
        Loai loai = loaiDao.getByName(testLoaiName);
        if (loai != null) {
            loaiDao.forceDelete(loai.getMaLoai());
        }
    }

    @Test
    public void testInsert() {
        System.out.println("insert");
        Non model = new Non();
        model.setTenNon(testNonName);
        model.setMaThuongHieu(testThuongHieu.getMaThuongHieu());
        model.setMaLoai(testLoai.getMaLoai());
        model.setGia(1500);
        model.setGiamGia(200);
        model.setNgayTao(new Date());
        model.setSoLuong(20);
        model.setHinh("new_image.jpg");
        model.setDeleted(false);
        nonDao.insert(model);

        Non insertedNon = nonDao.getByName(testNonName);
        assertNotNull(insertedNon);
        assertEquals(testNonName, insertedNon.getTenNon());
    }

    @Test(expected = RuntimeException.class)
    public void testInsertConflict() {
        System.out.println("insert conflict");
        Non model = new Non();
        model.setTenNon(testNonName);
        model.setMaThuongHieu(testThuongHieu.getMaThuongHieu());
        model.setMaLoai(testLoai.getMaLoai());
        model.setGia(1500);
        model.setGiamGia(200);
        model.setNgayTao(new Date());
        model.setSoLuong(20);
        model.setHinh("new_image.jpg");
        model.setDeleted(false);
        nonDao.insert(model);
        nonDao.insert(model);

    }

    @Test
    public void testUpdate() {
        Non model = new Non();
        model.setTenNon(testNonName);
        model.setMaThuongHieu(testThuongHieu.getMaThuongHieu());
        model.setMaLoai(testLoai.getMaLoai());
        model.setGia(1500);
        model.setGiamGia(200);
        model.setNgayTao(new Date());
        model.setSoLuong(20);
        model.setHinh("new_image.jpg");
        model.setDeleted(false);
        nonDao.insert(model);

        Non getModel = nonDao.getByName(testNonName);
        getModel.setGia(100000);
        nonDao.update(getModel);
        Non updatedModel = nonDao.getByName(testNonName);
        assertNotNull(updatedModel);
        assertEquals(100000, updatedModel.getGia());

    }

    @Test
    public void testDelete() {
        Non model = new Non();
        model.setTenNon(testNonName);
        model.setMaLoai(testLoai.getMaLoai());
        model.setMaThuongHieu(testThuongHieu.getMaThuongHieu());

        nonDao.insert(model);

        Non modelDelete = nonDao.getByName(testNonName);
        assertNotNull(modelDelete);

        nonDao.forceDelete(modelDelete.getMaNon());

        Non deletedThuongHieu = nonDao.getByName(testNonName);
        assertNull(deletedThuongHieu);
    }

    @Test
    public void testSelectAll() {
        System.out.println("selectAll");
        List<Non> result = nonDao.selectAll();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    public void testSelectById() {
        System.out.println("selectById");
        Non model = new Non();
        model.setTenNon(testNonName);
        model.setMaThuongHieu(testThuongHieu.getMaThuongHieu());
        model.setMaLoai(testLoai.getMaLoai());

        nonDao.insert(model);

        Non getModel = nonDao.getByName(testNonName);
        Non result = nonDao.selectById(getModel.getMaNon());
        assertNotNull(result);
        assertEquals(getModel.getMaNon(), result.getMaNon());

    }

    @Test
    public void testSelectBySql() {
        System.out.println("selectBySql");
        String sql = "SELECT * FROM Non";
        List<Non> result = nonDao.selectBySql(sql);
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    public void testGetByLoaiNotFound() {
        System.out.println("getByLoai not found");
        Non result = nonDao.getByLoai(testLoai.getMaLoai());
        assertNull(result);
    }

    @Test
    public void testGetByThuongHieuNotFound() {
        System.out.println("getByThuongHieu not found");
        Non result = nonDao.getByThuongHieu(testThuongHieu.getMaThuongHieu());
        assertNull(result);
    }

    @Test
    public void testGenerateNewId() throws Exception {
        System.out.println("generateNewId");
        String newId = nonDao.generateNewId();
        assertNotNull(newId);
        assertFalse(newId.isEmpty());
    }
}
