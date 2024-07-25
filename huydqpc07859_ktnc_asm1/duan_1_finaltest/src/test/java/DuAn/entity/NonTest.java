package DuAn.entity;

import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

public class NonTest {

    @Test
    public void testGetAndSetHinh() {
        // Test getHinh and setHinh methods
        Non instance = new Non();
        String hinh = "sample.jpg";
        instance.setHinh(hinh);
        assertEquals(hinh, instance.getHinh());
    }

    @Test
    public void testGetAndSetMaNon() {
        // Test getMaNon and setMaNon methods
        Non instance = new Non();
        int maNon = 1;
        instance.setMaNon(maNon);
        assertEquals(maNon, instance.getMaNon());
    }

    @Test
    public void testGetAndSetTenNon() {
        // Test getTenNon and setTenNon methods
        Non instance = new Non();
        String tenNon = "Sample Non";
        instance.setTenNon(tenNon);
        assertEquals(tenNon, instance.getTenNon());
    }

    @Test
    public void testGetAndSetMaThuongHieu() {
        // Test getMaThuongHieu and setMaThuongHieu methods
        Non instance = new Non();
        int maThuongHieu = 2;
        instance.setMaThuongHieu(maThuongHieu);
        assertEquals(maThuongHieu, instance.getMaThuongHieu());
    }

    @Test
    public void testGetAndSetMaLoai() {
        // Test getMaLoai and setMaLoai methods
        Non instance = new Non();
        int maLoai = 3;
        instance.setMaLoai(maLoai);
        assertEquals(maLoai, instance.getMaLoai());
    }

    @Test
    public void testGetAndSetGia() {
        // Test getGia and setGia methods
        Non instance = new Non();
        int gia = 100;
        instance.setGia(gia);
        assertEquals(gia, instance.getGia());
    }

    @Test
    public void testGetAndSetGiamGia() {
        // Test getGiamGia and setGiamGia methods
        Non instance = new Non();
        int giamGia = 10;
        instance.setGiamGia(giamGia);
        assertEquals(giamGia, instance.getGiamGia());
    }

    @Test
    public void testGetAndSetNgayTao() {
        // Test getNgayTao and setNgayTao methods
        Non instance = new Non();
        // Assuming a specific date for testing
        Date ngayTao = new Date();
        instance.setNgayTao(ngayTao);
        assertEquals(ngayTao, instance.getNgayTao());
    }

    @Test
    public void testGetAndSetSoLuong() {
        // Test getSoLuong and setSoLuong methods
        Non instance = new Non();
        int soLuong = 5;
        instance.setSoLuong(soLuong);
        assertEquals(soLuong, instance.getSoLuong());
    }

    @Test
    public void testIsAndSetDeleted() {
        // Test isDeleted and setDeleted methods
        Non instance = new Non();
        boolean deleted = true;
        instance.setDeleted(deleted);
        assertEquals(deleted, instance.isDeleted());
    }

    @Test
    public void testToString() {
        // Test toString method
        Non instance = new Non();
        instance.setMaNon(1); // Set an example ID
        String expectedString = "SP1";
        assertEquals(expectedString, instance.toString());
    }
}
