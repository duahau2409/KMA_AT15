package AT15_TPBANK;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class KhachHang {
	private String maKH;
	private String tenKH;
	private String diaChi, thon, xa,huyen, tinh;
	
	ArrayList<TaiKhoanNganHang> tknhs = new ArrayList<>();
	Scanner sc  = new Scanner(System.in);
	
//	public void inRaKhachHangCoSoLuongGiaoDichNhieuNhat() {
//		double soLuongGiaoDichNhieuNhat = 0;
//		for(int i = 0; i<tknhs.size() ;i++)
//		{
//			if(tknhs.get(i).gds.size() > soLuongGiaoDichNhieuNhat)
//			{
//				soLuongGiaoDichNhieuNhat = tknhs.get(i).gds.size();
//			}
//		}
//		for(int i = 0; i<tknhs.size() ;i++)
//		{
//			if(tknhs.get(i).gds.size() == soLuongGiaoDichNhieuNhat)
//			{
//				System.out.println(tknhs.get(i));
//			}
//		}
//	}
	
	public double tongSoLuongGiaoDich() {
		double tongGiaoDich = 0;
		for(int i = 0; i<tknhs.size() ;i++)
		{
			tongGiaoDich += tknhs.get(i).gds.size();
		}
		return tongGiaoDich;
	}
	
	public void sapXepTangDan() {
		Collections.sort(tknhs, new Comparator<TaiKhoanNganHang>() {
            @Override
            public int compare(TaiKhoanNganHang tknh1, TaiKhoanNganHang tknh2) {
                if (tknh1.getSoDu() < tknh2.getSoDu()) {
                    return -1;
                } else {
                    if (tknh1.getSoDu() == tknh2.getSoDu()) {
                        return 0;
                    } else {
                        return 1;
                    }
                }
            }
        });
	}
	public double soDuNhieuNhat() {
		double soDuMax = tknhs.get(0).getSoDu();
		for(int i = 0; i < tknhs.size(); i++)
		{
			if(soDuMax < tknhs.get(i).getSoDu())
			{
				soDuMax = tknhs.get(i).getSoDu();
			}
		}
		return soDuMax;
	}
	
	
	public void inRaThongTinKhachHangTiemNang() {
		System.out.println("Mã khách hàng: "+ maKH);
		for(int i=0;i<tknhs.size(); i++)
		{
			if(soDuNhieuNhat() == tknhs.get(i).getSoDu())
			{
				System.out.println("Thông tin tài khoản có nhiều tiền nhất: \n"+ tknhs.get(i).toString());
			}
		}
	}
	
	public void inTatCaThongTinTaiKhoan() {
		System.out.println("Thông tin giao dịch của khách hàng: "+maKH);
		for(int i=0 ; i<tknhs.size(); i++)
		{
			tknhs.get(i).inTatCaThongTinGiaoDich();
		}
	}
	public void nhapThongTinTK() {
		String luachon = "y";
		while(luachon.equals("y"))
		{
			TaiKhoanNganHang tknh = new TaiKhoanNganHang();
			tknh.nhapThongTinTaiKhoan();
			tknhs.add(tknh);
			System.out.println("bạn có muốn làm tiếp tài khoản không?");
			luachon = sc.nextLine();
		}
		
	}
	
	
	@Override
	public String toString() {
		return "KhachHang [maKH=" + maKH + ", tenKH=" + tenKH + ", diaChi= thon: " + thon + ", xa: " + xa
				+ ", huyen: " + huyen + ", tinh: " + tinh + "] \n "+ tknhs.toString();
	}


	public void nhapThongTin() 
	{	
		System.out.println("Nhập mã khách hàng: ");
		maKH = sc.nextLine();
		System.out.println("Nhập tên khách hàng: ");
		tenKH = sc.nextLine();
		System.out.println("Nhập thôn: ");
		thon = sc.nextLine();
		System.out.println("Nhập xã: ");
		xa = sc.nextLine();
		System.out.println("Nhập huyện: ");
		huyen = sc.nextLine();
		System.out.println("Nhập tỉnh: ");
		tinh = sc.nextLine();
	}
	
	public KhachHang() {
		super();
	}

	public KhachHang(String maKH, String tenKH, String thon, String xa, String huyen, String tinh) {
		super();
		this.maKH = maKH;
		this.tenKH = tenKH;
		this.thon = thon;
		this.xa = xa;
		this.huyen = huyen;
		this.tinh = tinh;
	}

	public String getMaKH() {
		return maKH;
	}

	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}

	public String getTenKH() {
		return tenKH;
	}

	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public String getThon() {
		return thon;
	}

	public void setThon(String thon) {
		this.thon = thon;
	}

	public String getXa() {
		return xa;
	}

	public void setXa(String xa) {
		this.xa = xa;
	}

	public String getHuyen() {
		return huyen;
	}

	public void setHuyen(String huyen) {
		this.huyen = huyen;
	}

	public String getTinh() {
		return tinh;
	}

	public void setTinh(String tinh) {
		this.tinh = tinh;
	}
	
	
}
