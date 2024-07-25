package DuAn.entity;

import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

public class ThuongHieuTest {

    @Test
    public void testToString() {
        System.out.println("toString");
        ThuongHieu instance = new ThuongHieu();
        String tenThuongHieu = "Sample Brand";
        instance.setTenThuongHieu(tenThuongHieu);
        assertEquals(tenThuongHieu, instance.toString());
    }

    @Test
    public void testGetAndSetMaThuongHieu() {
        System.out.println("getMaThuongHieu");
        ThuongHieu instance = new ThuongHieu();
        int maThuongHieu = 1;
        instance.setMaThuongHieu(maThuongHieu);
        assertEquals(maThuongHieu, instance.getMaThuongHieu());
    }

    @Test
    public void testGetAndSetTenThuongHieu() {
        System.out.println("getTenThuongHieu");
        ThuongHieu instance = new ThuongHieu();
        String tenThuongHieu = "Sample Brand";
        instance.setTenThuongHieu(tenThuongHieu);
        assertEquals(tenThuongHieu, instance.getTenThuongHieu());
    }

    @Test
    public void testGetAndSetNgayTao() {
        System.out.println("getNgayTao");
        ThuongHieu instance = new ThuongHieu();
        Date ngayTao = new Date();
        instance.setNgayTao(ngayTao);
        assertEquals(ngayTao, instance.getNgayTao());
    }

    @Test
    public void testGetAndSetLogo() {
        System.out.println("getLogo");
        ThuongHieu instance = new ThuongHieu();
        String logo = "logo.jpg";
        instance.setLogo(logo);
        assertEquals(logo, instance.getLogo());
    }

    @Test
    public void testIsAndSetDeleted() {
        System.out.println("isDeleted");
        ThuongHieu instance = new ThuongHieu();
        boolean deleted = true;
        instance.setDeleted(deleted);
        assertEquals(deleted, instance.isDeleted());
    }
}
