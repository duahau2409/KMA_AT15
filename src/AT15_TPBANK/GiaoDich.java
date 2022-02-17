package AT15_TPBANK;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class GiaoDich {
	private String maGD;
	private String NgayGD;
	private double soTienGD;
	
	private String loaiGiaoDich;

	
	public GiaoDich() {
		super();
	}
	
	
	@Override
	public String toString() {
		return "GiaoDich [maGD=" + maGD + ", NgayGD=" + NgayGD + ", soTienGD=" + soTienGD + ", loaiGiaoDich="
				+ loaiGiaoDich + "]";
	}


	public GiaoDich(String maGD, String ngayGD, double soTienGD, String loaiGiaoDich) {
		super();
		this.maGD = maGD;
		this.NgayGD = ngayGD;
		this.soTienGD = soTienGD;
		this.loaiGiaoDich = loaiGiaoDich;
	}

	public String getMaGD() {
		return maGD;
	}

	public void setMaGD(String maGD) {
		this.maGD = maGD;
	}

	public String getNgayGD() {
		return NgayGD;
	}

	public void setNgayGD(String ngayGD) {
		NgayGD = ngayGD;
	}

	public double getSoTienGD() {
		return soTienGD;
	}

	public void setSoTienGD(double soTienGD) {
		this.soTienGD = soTienGD;
	}

	public String getLoaiGiaoDich() {
		return loaiGiaoDich;
	}

	public void setLoaiGiaoDich(String loaiGiaoDich) {
		this.loaiGiaoDich = loaiGiaoDich;
	}
	
	
}
