package AT15_TPBANK;

import java.util.ArrayList;
import java.util.Scanner;

public class ChiNhanh {
	private String maCN = "Nguyễn Văn Luật";
	private String tenCN;
	private String diaChi;
	Scanner sc  = new Scanner(System.in);
	ArrayList<KhachHang> khs = new ArrayList<>();

	
	
	public void timKhachHangCoSoLuongGiaoDichMax() {
		double soLuongGiaoDichLonNhat = khs.get(0).tongSoLuongGiaoDich();
		for(int i = 0 ; i< khs.size() ; i++)
		{
			if(soLuongGiaoDichLonNhat < khs.get(i).tongSoLuongGiaoDich())
			{
				soLuongGiaoDichLonNhat = khs.get(i).tongSoLuongGiaoDich();
			}
		}
		System.out.println("số lượng giao dịch của khách hàng: "+ soLuongGiaoDichLonNhat);
		for(int i = 0 ; i< khs.size() ; i++)
		{
			if(soLuongGiaoDichLonNhat == khs.get(i).tongSoLuongGiaoDich())
			{
				System.out.println("tài khoản có số lượng giao dịch nhiều nhất: "+khs.get(i).toString());
			}
		}
	}
	public void sapXepSoDuTrongTaiKhoanCuaTungKhachHang() {
		for(int i=0;i<khs.size();i++)
		{
			khs.get(i).sapXepTangDan();
		}
		System.out.println("đã sắp xếp xong");
	}
	public void locTKCuaTungKhachHang() {
		for(int i=0 ; i < khs.size() ; i++)
		{
			khs.get(i).inRaThongTinKhachHangTiemNang();
		}
	}
	public void inTatCaThongTinTaiKhoanTrongChiNhanh() {
		System.out.println("Thông tin giao dịch của Chi Nhánh: "+ maCN);
		for(int i=0 ; i<khs.size(); i++)
		{
			khs.get(i).inTatCaThongTinTaiKhoan();
		}
	}
	
	public void giaoDichTaiKhoan() {
		System.out.println("nhập mã khách hàng: ");
		String maKHCanTim = sc.nextLine();
		for(int i=0; i< khs.size(); i++)
		{
			if(khs.get(i).getMaKH().equalsIgnoreCase(maKHCanTim))
			{
				System.out.println("nhập mã tài khoản: ");
				String maTKCanTim = sc.nextLine();
				for(int j=0; j< khs.get(i).tknhs.size(); j++)
				{
					if(khs.get(i).tknhs.get(j).getMaTK().equalsIgnoreCase(maTKCanTim))
					{
						khs.get(i).tknhs.get(j).giaoDich();
					}
				}
			}
		}
	}
	public void timKiemKhachHang() {
		System.out.println("nhập mã khách hàng: ");
		String maKHCanTim = sc.nextLine();
		for(int i=0; i< khs.size(); i++)
		{
			if(khs.get(i).getMaKH().equalsIgnoreCase(maKHCanTim))
			{
				System.out.println("Thông tin khách hàng cần tìm: "+ khs.get(i).toString());
			}
		}
	}
	public void nhapKhachHang() {
		String luachon = "y";
		
		while (luachon.equals("y"))
		{
			KhachHang kh = new KhachHang();
			kh.nhapThongTin();
			kh.nhapThongTinTK();
			khs.add(kh);
			System.out.println("bạn có muốn tạo khách hàng không?");
			luachon = sc.nextLine();
		}
		
	}
	
	public ChiNhanh() {
		
	}

	public ChiNhanh(String maCN, String tenCN, String diaChi) {
		this.maCN = maCN;
		this.tenCN = tenCN;
		this.diaChi = diaChi;
	}

	public String getMaCN() {
		return maCN;
	}

	public void setMaCN(String maCN) {
		this.maCN = maCN;
	}

	public String getTenCN() {
		return tenCN;
	}

	public void setTenCN(String tenCN) {
		this.tenCN = tenCN;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
}
