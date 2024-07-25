/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package DuAn.entity;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author dinhh
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({DuAn.entity.ThuongHieuTest.class, DuAn.entity.KhachHangTest.class, DuAn.entity.NonTest.class, DuAn.entity.LoaiTest.class, DuAn.entity.NhanVienTest.class})
public class EntitySuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("-------------BEFORE ENTITY SUITE-----------------");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("-------------AFTER ENTITY SUITE-----------------");

    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

}
