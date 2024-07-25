package DuAn.dao;

import DuAn.entity.NhanVien;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 * Test class for NhanVienDAO.
 */
public class NhanVienDAOTest {

    private NhanVienDAO nhanVienDao = new NhanVienDAO();

    private String testNhanVienEmail = "test1@example.com";

    public NhanVienDAOTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        // Create a test NhanVien

    }

    @After
    public void tearDown() {
        // Delete the test NhanVien
        NhanVien nhanVien = nhanVienDao.getByEmail(testNhanVienEmail);
        if (nhanVien != null) {
            nhanVienDao.forceDelete(nhanVien.getMaNV());
        }
    }

    @Test
    public void testInsert() {
        System.out.println("insert");
        NhanVien testNhanVien = new NhanVien();
        testNhanVien = new NhanVien();
        testNhanVien.setMatKhau("test_password");
        testNhanVien.setHoTen("Test User");
        testNhanVien.setEmail(testNhanVienEmail);
        testNhanVien.setVaiTro(false); // Nhân viên
        testNhanVien.setSdt("0123456789");
        nhanVienDao.insert(testNhanVien);
        testNhanVien = nhanVienDao.getByEmail(testNhanVienEmail);

        NhanVien insertedNhanVien = nhanVienDao.getByEmail(testNhanVienEmail);
        assertNotNull(insertedNhanVien);
        assertEquals(testNhanVienEmail, insertedNhanVien.getEmail());
    }

    @Test
    public void testUpdate() {
        System.out.println("update");
        NhanVien testNhanVien = new NhanVien();
        testNhanVien = new NhanVien();
        testNhanVien.setMatKhau("test_password");
        testNhanVien.setHoTen("Test User");
        testNhanVien.setEmail(testNhanVienEmail);
        testNhanVien.setVaiTro(false); // Nhân viên
        testNhanVien.setSdt("0123456789");
        nhanVienDao.insert(testNhanVien);
        testNhanVien = nhanVienDao.getByEmail(testNhanVienEmail);
        testNhanVien.setHoTen("Updated User");
        nhanVienDao.update(testNhanVien);

        NhanVien updatedNhanVien = nhanVienDao.getByEmail(testNhanVienEmail);
        assertNotNull(updatedNhanVien);
        assertEquals("Updated User", updatedNhanVien.getHoTen());
    }

    @Test
    @Ignore
    public void testUpdateKhongDoiMatKhau() {
        System.out.println("updateKhongDoiMatKhau");
        NhanVien testNhanVien = new NhanVien();
        testNhanVien = new NhanVien();
        testNhanVien.setMatKhau("test_password");
        testNhanVien.setHoTen("Test User");
        testNhanVien.setEmail(testNhanVienEmail);
        testNhanVien.setVaiTro(false); // Nhân viên
        testNhanVien.setSdt("0123456789");
        nhanVienDao.insert(testNhanVien);
        testNhanVien = nhanVienDao.getByEmail(testNhanVienEmail);
        testNhanVien.setHoTen("Updated User");
        nhanVienDao.update(testNhanVien);

        NhanVien updatedNhanVien = nhanVienDao.getByEmail(testNhanVienEmail);
        assertNotNull(updatedNhanVien);
        assertEquals("Updated User", updatedNhanVien.getHoTen());
    }

    @Test
    public void testDelete() {
        System.out.println("delete");
        NhanVien testNhanVien = new NhanVien();
        testNhanVien = new NhanVien();
        testNhanVien.setMatKhau("test_password");
        testNhanVien.setHoTen("Test User");
        testNhanVien.setEmail(testNhanVienEmail);
        testNhanVien.setVaiTro(false); // Nhân viên
        testNhanVien.setSdt("0123456789");
        nhanVienDao.insert(testNhanVien);
        
        testNhanVien = nhanVienDao.getByEmail(testNhanVienEmail);
        assertNotNull(testNhanVien);
        
        nhanVienDao.forceDelete(testNhanVien.getMaNV());

        NhanVien deletedNhanVien = nhanVienDao.getByEmail(testNhanVienEmail);
        assertNull(deletedNhanVien);
    }

    @Test
    public void testSelectAll() {
        System.out.println("selectAll");
        List<NhanVien> result = nhanVienDao.selectAll();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    public void testSelectById() {
        System.out.println("selectById");
        NhanVien testNhanVien = new NhanVien();
        testNhanVien = new NhanVien();
        testNhanVien.setMatKhau("test_password");
        testNhanVien.setHoTen("Test User");
        testNhanVien.setEmail(testNhanVienEmail);
        testNhanVien.setVaiTro(false); // Nhân viên
        testNhanVien.setSdt("0123456789");
        nhanVienDao.insert(testNhanVien);
        testNhanVien = nhanVienDao.getByEmail(testNhanVienEmail);
        assertNotNull(testNhanVien);
        NhanVien result = nhanVienDao.selectById(testNhanVien.getMaNV());
        assertNotNull(result);
        assertEquals(testNhanVien.getEmail(), result.getEmail());
    }

    @Test
    public void testSelectBySql() {
        System.out.println("selectBySql");
        String sql = "SELECT * FROM NhanVien";
        List<NhanVien> result = nhanVienDao.selectBySql(sql);
        assertNotNull(result);
    }

    @Test
    public void testLayMaQuenMatKhau() {
        NhanVien testNhanVien = new NhanVien();
        testNhanVien = new NhanVien();
        testNhanVien.setMatKhau("test_password");
        testNhanVien.setHoTen("Test User");
        testNhanVien.setEmail(testNhanVienEmail);
        testNhanVien.setVaiTro(false); // Nhân viên
        testNhanVien.setSdt("0123456789");
        nhanVienDao.insert(testNhanVien);

        String result = nhanVienDao.layMaQuenMatKhau(testNhanVienEmail);
        assertNotNull(result);
    }

    @Test
    public void testGetByEmail() {
        NhanVien testNhanVien = new NhanVien();
        testNhanVien = new NhanVien();
        testNhanVien.setMatKhau("test_password");
        testNhanVien.setHoTen("Test User");
        testNhanVien.setEmail(testNhanVienEmail);
        testNhanVien.setVaiTro(false); // Nhân viên
        testNhanVien.setSdt("0123456789");
        nhanVienDao.insert(testNhanVien);
        System.out.println("getByEmail");
        NhanVien result = nhanVienDao.getByEmail(testNhanVienEmail);
        assertNotNull(result);
        assertEquals(testNhanVienEmail, result.getEmail());
    }

    @Test
    public void testGenerateNewId() throws Exception {
        System.out.println("generateNewId");
        String newId = nhanVienDao.generateNewId();
        assertNotNull(newId);
        assertFalse(newId.isEmpty());
    }
}
