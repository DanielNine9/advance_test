/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAn.dao;

/**
 *
 * @author dinhh
 */
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    NonDAOTest.class,
    ThuongHieuDAOTest.class,
    LoaiDAOTest.class,
    KhachHangDAOTest.class,
    NhanVienDAOTest.class
})
public class SuiteClassDAO {
    // This class remains empty, it is used only as a holder for the above annotations
      @BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("-------------BEFORE DAO SUITE-----------------");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("-------------AFTER DAO SUITE-----------------");

    }
}
