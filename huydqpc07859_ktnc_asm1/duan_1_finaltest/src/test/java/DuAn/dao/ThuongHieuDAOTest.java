package DuAn.dao;

import DuAn.entity.ThuongHieu;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class ThuongHieuDAOTest {

    private ThuongHieuDAO dao = new ThuongHieuDAO();
    private String testThuongHieuName = "test brand";
    private ThuongHieu testThuongHieu;

    public ThuongHieuDAOTest() {
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
        ThuongHieu th = dao.getByName(testThuongHieuName);
        if (th != null) {
            dao.forceDelete(th.getMaThuongHieu());
        }
    }

    @Test
    public void testInsert() {
        System.out.println("insert");
        ThuongHieu model = new ThuongHieu();
        model.setTenThuongHieu(testThuongHieuName);
        dao.insert(model);

        ThuongHieu insertedThuongHieu = dao.getByName(testThuongHieuName);
        assertNotNull(insertedThuongHieu);
        assertEquals(testThuongHieuName, insertedThuongHieu.getTenThuongHieu());
    }

    @Test(expected = RuntimeException.class)
    public void testInsertConflict() {
        ThuongHieu model = new ThuongHieu();
        model.setTenThuongHieu(testThuongHieuName);
        dao.insert(model);

        System.out.println("insert conflict");
        ThuongHieu modelConflict = new ThuongHieu();
        modelConflict.setTenThuongHieu(testThuongHieuName);
        dao.insert(modelConflict); // This should cause a conflict or exception
    }

    @Test
    public void testUpdate() {
        System.out.println("update");
        ThuongHieu model = new ThuongHieu();
        model.setTenThuongHieu(testThuongHieuName);
        dao.insert(model);

        ThuongHieu modelUpdate = dao.getByName(testThuongHieuName);
        modelUpdate.setTenThuongHieu(testThuongHieuName);
        dao.update(modelUpdate);

        ThuongHieu updatedModel = dao.getByName(testThuongHieuName);
        assertNotNull(updatedModel);
        assertEquals(testThuongHieuName, updatedModel.getTenThuongHieu());
    }

    @Test
    public void testDelete() {
        ThuongHieu model = new ThuongHieu();
        model.setTenThuongHieu(testThuongHieuName);
        dao.insert(model);

        ThuongHieu loaiDelete = dao.getByName(testThuongHieuName);
        dao.forceDelete(loaiDelete.getMaThuongHieu());

        ThuongHieu deletedThuongHieu = dao.getByName(testThuongHieuName);
        assertNull(deletedThuongHieu);

    }

    @Test
    public void testSelectAll() {
        System.out.println("selectAll");
        List<ThuongHieu> result = dao.selectAll();
        assertNotNull(result);
        assertTrue(result.size() >= 0);
    }

    @Test
    public void testSelectById() {
        System.out.println("selectById");
        ThuongHieu model = new ThuongHieu();
        model.setTenThuongHieu(testThuongHieuName);
        dao.insert(model);

        ThuongHieu getModel = dao.getByName(testThuongHieuName);
        ThuongHieu result = dao.selectById(getModel.getMaThuongHieu());
        assertNotNull(result);
        assertEquals(getModel.getMaThuongHieu(), result.getMaThuongHieu());
    }

    @Test
    public void testSelectBySql() {
        System.out.println("selectBySql");
        String sql = "SELECT * FROM ThuongHieu WHERE TenThuongHieu = ?";
        Object[] args = {testThuongHieuName};
        List<ThuongHieu> result = dao.selectBySql(sql, args);
        assertNotNull(result);
        assertFalse(result.isEmpty());
        assertEquals(testThuongHieuName, result.get(0).getTenThuongHieu());
    }

    @Test
    public void testGetByName() {
        System.out.println("getByName");
        ThuongHieu model = new ThuongHieu();
        model.setTenThuongHieu(testThuongHieuName);
        dao.insert(model);

        ThuongHieu result = dao.getByName(testThuongHieuName);
        assertNotNull(result);
        assertEquals(testThuongHieuName, result.getTenThuongHieu());
    }

    @Test
    public void testGenerateNewId() throws Exception {
        System.out.println("generateNewId");
        String newId = dao.generateNewId();
        assertNotNull(newId);
        assertFalse(newId.isEmpty());
    }
}
