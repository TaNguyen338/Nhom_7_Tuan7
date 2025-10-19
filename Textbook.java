
public class Textbook extends Sach implements IKiemKe {
	private String monHoc;
	private String capDo;
	public Textbook(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String monHoc, String capDo) {
		super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
        this.giaCoBan = giaCoBan; 
		this.monHoc = monHoc;
		this.capDo = capDo;
	}

	public String getMonHoc() {
		return monHoc;
	}

	public void setMonHoc(String monHoc) {
		this.monHoc = monHoc;
	}

	public String getCapDo() {
		return capDo;
	}

	public void setCapDo(String capDo) {
		this.capDo = capDo;
	}

	 @Override
    public double tinhGiaBan() {
        int soNam = 2025 - getnamXuatBan();
        if (soNam < 0) soNam = 0; 
        return getgiaCoBan() + soNam * 5000.0; 
    }
    
    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return getsoLuong() >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Da Chuyen Sach [" + gettieuDe() + "] den khu vuc: [" + viTriMoi + "].");
    }

@Override
public String toString() {
	return super.toString() +
		   ", Mon Hoc: " + monHoc + 
           ", Cap Do: " + capDo +
		   ", Gia Ban: " + tinhGiaBan() + " VNĐ";
}
}