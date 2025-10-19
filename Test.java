public class Test 
{
    public static void main(String[] args) 
    {
        QuanLySach ql = new QuanLySach();
        SachGiaoTrinh sg = new SachGiaoTrinh("GT01", "Lap trinh Java", "Nguyen Van A", 2021, 60, 100000, "CNTT", "Dai hoc");
        SachTieuThuyet st = new SachTieuThuyet("TT01", "Harry Potter", "J.K. Rowling", 2015, 25, 150000, "Phieu luu", true);
        ql.themSach(sg);
        ql.themSach(st);
        ql.hienThiDanhSachSach();
        IKiemKe kiemKe = sg;
        System.out.println("Kiem tra ton kho (toi thieu 50): " + kiemKe.kiemTraTonKho(50));
        kiemKe.capNhatViTri("Kho A1 - Ke 5");
    }
}
