import java.util.ArrayList;
import java.util.Iterator;

public class BookManager {
    private ArrayList<Sach> danhSachSach = new ArrayList<>();

    public void themSach(Sach sach) {
        danhSachSach.add(sach);
    }

    public boolean xoaSach(String maSach) {
        Iterator<Sach> it = danhSachSach.iterator();
        while (it.hasNext()) {
            Sach s = it.next();
            if (s.getmaSach().equals(maSach)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public boolean capNhatSach(String maSach, Sach sachMoi) {
        for (int i = 0; i < danhSachSach.size(); i++) {
            if (danhSachSach.get(i).getmaSach().equals(maSach)) {
                danhSachSach.set(i, sachMoi);
                return true;
            }
        }
        return false;
    }

    public Sach timKiemTheoMaSach(String maSach) {
        for (Sach s : danhSachSach) {
            if (s.getmaSach().equals(maSach)) {
                return s;
            }
        }
        return null;
    }

    public void hienThiDanhSach() {
        for (Sach s : danhSachSach) {
            s.hienthithongtin();
            System.out.println("Gia Ban Uoc Tinh: " + s.tinhGiaBan() + " VNĐ");
            System.out.println("---");
        }
    }
}