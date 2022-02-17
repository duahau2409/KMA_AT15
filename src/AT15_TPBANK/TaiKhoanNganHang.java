package AT15_TPBANK;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TaiKhoanNganHang {
	private String maTK;
	private double soDu;
	Scanner sc = new Scanner(System.in);
	
	ArrayList<GiaoDich> gds = new ArrayList<>();

	
	
	
	
	public void giaoDich() {
		System.out.println("Nhập số tiền bạn cần giao dịch: ");
		double soTienGiaoDich = Double.parseDouble(sc.nextLine());
		System.out.println("bạn muốn rút tiền(w) hay gửi tiền(d): ");
		String loaiGiaoDich = sc.nextLine();
		LocalDateTime current = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
		String NgayGD = current.format(formatter);
		String maGD = (int)Math.random()+"";
		GiaoDich gd = new GiaoDich(maGD, NgayGD, soTienGiaoDich, loaiGiaoDich);
		if(loaiGiaoDich.equalsIgnoreCase("w") && soDu >= soTienGiaoDich)
		{
			soDu -= soTienGiaoDich;
		}
		else if(loaiGiaoDich.equalsIgnoreCase("d"))
		{
			soDu += soTienGiaoDich;
		}	
		gds.add(gd);
	}
	
	public void inTatCaThongTinGiaoDich() {
		System.out.println("Thông tin giao dich của tài khoản: "+maTK);
		for(int i=0; i<gds.size(); i++)
		{
			System.out.println(gds.get(i).toString());
		}
	}
	public void nhapThongTinTaiKhoan() {
		System.out.println("Nhập mã tài khoản: ");
		maTK = sc.nextLine();
		System.out.println("Số dư: ");
		soDu = Double.parseDouble(sc.nextLine());
	}
	
	
	

	@Override
	public String toString() {
		return "TaiKhoanNganHang [maTK=" + maTK + ", soDu=" + soDu + "]";
	}

	public TaiKhoanNganHang() {
		super();
	}

	public TaiKhoanNganHang(String maTK, double soDu) {
		super();
		this.maTK = maTK;
		this.soDu = soDu;
	}

	public String getMaTK() {
		return maTK;
	}

	public void setMaTK(String maTK) {
		this.maTK = maTK;
	}

	public double getSoDu() {
		return soDu;
	}

	public void setSoDu(double soDu) {
		this.soDu = soDu;
	}
	
}
