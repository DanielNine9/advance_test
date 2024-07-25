package DuAn.dao;

import DuAn.entity.Loai;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class LoaiDAOTest {

    private LoaiDAO dao = new LoaiDAO();
    private String testLoaiName = "tt 1";

    public LoaiDAOTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        // Ensure there is no existing Loai with testLoaiName
        Loai existingLoai = dao.getByName(testLoaiName);
        if (existingLoai != null) {
            dao.forceDelete(existingLoai.getMaLoai());
        }
    }

    @After
    public void tearDown() {
        Loai loai = dao.getByName(testLoaiName);
        if (loai != null) {
            dao.forceDelete(loai.getMaLoai());
        }
    }

    @Test
    public void testInsert() {
        System.out.println("insert");
        Loai model = new Loai();
        model.setTenLoai(testLoaiName);
        dao.insert(model);

        Loai insertedLoai = dao.getByName(testLoaiName);
        assertNotNull(insertedLoai);
        assertEquals(testLoaiName, insertedLoai.getTenLoai());
    }

    @Test(expected = RuntimeException.class)

    public void testInsertConflict() {
        System.out.println("insert conflict");
        Loai model = new Loai();
        model.setTenLoai(testLoaiName);

        dao.insert(model);
        dao.insert(model); // Should throw an exception or fail
    }

    @Test
    public void testUpdate() {
        System.out.println("update");
        Loai model = new Loai();
        model.setTenLoai(testLoaiName);
        dao.insert(model);

        Loai loaiToUpdate = dao.getByName(testLoaiName);
        loaiToUpdate.setTenLoai("Updated Name");
        dao.update(loaiToUpdate);

        Loai updatedLoai = dao.getByName("Updated Name");
        assertNotNull(updatedLoai);
        assertEquals("Updated Name", updatedLoai.getTenLoai());
    }

    @Test
    public void testForceDelete() {
        System.out.println("force delete");
        Loai model = new Loai();
        model.setTenLoai(testLoaiName);
        dao.insert(model);

        Loai loaiDelete = dao.getByName(testLoaiName);
        dao.forceDelete(loaiDelete.getMaLoai());

        Loai deletedLoai = dao.getByName(testLoaiName);
        assertNull(deletedLoai);
    }

    @Test
    public void testSelectAll() {
        System.out.println("selectAll");
        List<Loai> result = dao.selectAll();
        assertNotNull(result);
        assertTrue(result.size() >= 0);
    }

    @Test
    public void testSelectById() {
        System.out.println("selectById");
        Loai model = new Loai();
        model.setTenLoai(testLoaiName);
        dao.insert(model);

        Loai loai = dao.getByName(testLoaiName);
        Loai result = dao.selectById(loai.getMaLoai());
        assertNotNull(result);
        assertEquals(loai.getMaLoai(), result.getMaLoai());
    }

    @Test
    public void testSelectBySql() {
        System.out.println("selectBySql");
        String sql = "SELECT * FROM Loai WHERE TenLoai = ?";
        Object[] args = {testLoaiName};
        Loai loai = new Loai();
        loai.setTenLoai(testLoaiName);
        dao.insert(loai);

        List<Loai> result = dao.selectBySql(sql, args);
        assertNotNull(result);
        assertFalse(result.isEmpty());
        assertEquals(testLoaiName, result.get(0).getTenLoai());
    }

    @Test
    public void testGetByName() {
        System.out.println("getByName");
        Loai model = new Loai();
        model.setTenLoai(testLoaiName);
        dao.insert(model);

        Loai result = dao.getByName(testLoaiName);
        assertNotNull(result);
        assertEquals(testLoaiName, result.getTenLoai());
    }

    @Test
    public void testGetByLoai() {
        System.out.println("getByLoai");
        Loai model = new Loai();
        model.setTenLoai(testLoaiName);
        dao.insert(model);

        Loai loai = dao.getByName(testLoaiName);
        System.out.println("loai " + loai.getTenLoai());
        assertNotNull(loai);
        Loai result = dao.getByLoai(String.valueOf(loai.getTenLoai()));

        assertNotNull(result);
        assertEquals(loai.getMaLoai(), result.getMaLoai());
    }

    @Test
    public void testGenerateNewId() throws Exception {
        System.out.println("generateNewId");
        String newId = dao.generateNewId();
        assertNotNull(newId);
        assertFalse(newId.isEmpty());
    }
}
