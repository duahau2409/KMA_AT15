package AT15_TPBANK;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int luachon;
		Scanner sc = new Scanner(System.in);
		ChiNhanh cn = new ChiNhanh();
		while(true)
		{
			menu();
			luachon = sc.nextInt();
			switch(luachon)
			{
			 	case 1: cn.nhapKhachHang();
			 	break;
			 	case 2: cn.timKiemKhachHang();
			 	break;
			 	case 3: cn.giaoDichTaiKhoan();
			 	break;
			 	case 4: cn.inTatCaThongTinTaiKhoanTrongChiNhanh();
			 	break;
			 	case 5: cn.locTKCuaTungKhachHang();
			 	break;
			 	case 6:	cn.sapXepSoDuTrongTaiKhoanCuaTungKhachHang();
			 	break;
			 	case 7: cn.timKhachHangCoSoLuongGiaoDichMax();
			 	break;
			 	case 8:
			 	System.exit(0);
			 	default: System.out.println("mời bạn chọn lại!");
			 	break;
			}
		}

		
	}
	
	public static void menu()
	{
		System.out.println("1. Khai báo một chi nhánh và cho phép nhập nhiều khách hàng vào 1 chi nhánh cho phép thêm nhiều tài khoản vào một khách hàng");
		System.out.println("2. cho phép in ra thông tin của 1 cá nhân bất kỳ");
		System.out.println("3. Cho phép thực hiện gửi tiền và rút tiền vào 1 tài khoản bất kỳ vào 1 khách hàng bất kỳ");
		System.out.println("4. Thực hiện ra tất cả các giao dịch của tất cả tài khoản, của tất cả khách hàng trong chi nhánh ra màn hình");
		System.out.println("5. Liệt kê tất cả các tài khoản có số dư lớn nhất của từng khách hàng trong chi nhánh");
		System.out.println("6. sắp xếp tăng dần theo tổng số dư của từng khách hàng");
		System.out.println("7. hiển thị khách hàng giao dịch nhiều nhất");
		System.out.println("8. Thoát khỏi menu");

	}
	
}
