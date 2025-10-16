public class Novel extends Sach implements IKiemKe { 
    private String theLoai;
    private boolean laSachSeries;

    public Novel(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String theLoai, boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
        this.giaCoBan = giaCoBan; 
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public boolean getlaSachSeries() {
        return laSachSeries;
    }

    public void setlaSachSeries(boolean laSachSeries) {
        this.laSachSeries = laSachSeries;
    }

    @Override
    public double tinhGiaBan() {
        return getgiaCoBan() + (laSachSeries ? 15000.0 : 0.0); 
    }
    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return getsoLuong() >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Da Chuyen Sach[" + gettieuDe() + "] den khu vuc: [" + viTriMoi + "].");
    }

    @Override
    public String toString() {
    return super.toString() +
           ", The Loai: " + theLoai + 
           ", La Sach Series: " + (laSachSeries ? "Co" : "Khong") +
           ", Gia Ban: " + tinhGiaBan() + " VNĐ";
    }
    
}