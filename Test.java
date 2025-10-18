public class Test {
    public static void main(String[] args) {
        // Tao doi tuong SachGiaoTrinh
        SachGiaoTrinh sgk = new SachGiaoTrinh("GT01", "Lap trinh Java", "Nguyen Van A", 2020, 120, 50000, "CNTT");

        // Tao doi tuong SachTieuThuyet
        SachTieuThuyet stt = new SachTieuThuyet("TT01", "Harry Potter", "J.K. Rowling", 2015, 50, 70000, true);

        // Tao doi tuong QuanLySach
        QuanLySach ql = new QuanLySach();
        ql.themSach(sgk);
        ql.themSach(stt);

        // Hien thi danh sach
        ql.hienThiDanhSachSach();

        // Kiem tra giao dien IKiemKe
        IKiemKe kiemKe = sgk;
        System.out.println("Kiem tra ton kho >= 100: " + kiemKe.kiemTraTonKho(100));
        kiemKe.capNhatViTri("Kho A1 - Ke 5");
    }
}
