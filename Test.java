public class Test {
    public static void main(String[] args) {
        BookManager manager = new BookManager();

        Textbook textbook1 = new Textbook("003", "Toan Cao Cap", "Le Van C", 2021, 7, 100000.0, "Toan", "Dai Hoc");
        
        Novel novel1 = new Novel("004", "Co be ban diem", "ACE", 2010, 50, 50000.0, "Co Tich", true);
        Novel novel2 = new Novel("005", "Doraemon", "Kira", 2024, 150, 40000.0, "Truyen Tranh", false);
        manager.themSach(textbook1);
        manager.themSach(novel1);
        manager.themSach(novel2);

        System.out.println("DANH SACH BAN DAU");
        manager.hienThiDanhSach();

        System.out.println("\nTIM KIEM MA 004 (Novel)");
        Sach found = manager.timKiemTheoMaSach("004");
        if (found != null) {
            System.out.println(found.toString());
        } else {
            System.out.println("khong tim thay sach!");
        }

        Novel novelMoi = new Novel("004", "Co be ban diem phan 2", "ACE", 2024, 80, 50000.0, "Co Tich", true);
        manager.capNhatSach("004", novelMoi);
        System.out.println("\nDANH SACH SAU CAP NHAT MA 004 ");
        manager.hienThiDanhSach();
        manager.xoaSach("003");
        System.out.println("\nDANH SACH SAU KHI XOA MA 003 (Textbook) ");
        manager.hienThiDanhSach();
        
        System.out.println("\n KIEM TRA GIAO DIEN IKIEMKE");
        
        IKiemKe kiemKeNovel = novelMoi; 
        
        System.out.print("Kiem tra ton kho (Novel - 80 cuon) so luong toi thieu 100: ");
        if (kiemKeNovel.kiemTraTonKho(100)) {
            System.out.println("Dat yeu cau!");
        } else {
            System.out.println("Khong dat yeu cau (Hien co: " + novelMoi.getsoLuong() + ")");
        }
        
        kiemKeNovel.capNhatViTri("Kho A1-Ke 5");

        Textbook textbook2 = new Textbook("006", "Sinh hoc dai cuong", "P. Van", 2024, 120, 120000.0, "Sinh hoc", "daihoc");
        IKiemKe kiemKeTextbook = textbook2;

        System.out.print("Kiem tra ton kho (Textbook - 120 cuon) so luong toi thieu 100: ");
        if (kiemKeTextbook.kiemTraTonKho(100)) {
            System.out.println("Dat yeu cau!");
        } else {
            System.out.println("Khong dat yeu cau (Hien co: " + textbook2.getsoLuong() + ")");
        }
        
    }
}