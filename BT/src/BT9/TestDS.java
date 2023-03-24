package BT9;

import java.util.Scanner;

public class TestDS {
	public class Main {
	    public static void main(String[] args) {
	        Scanner sc = new (System.in);
	        
	        // Nhập số lượng công nhân
	        System.out.print("Nhập số lượng công nhân: ");
	        int n = sc.nextInt();
	        
	        // Tạo đối tượng DanhSachCongNhan và khởi tạo n phần tử
	        DanhSachCongNhan ds = new DanhSachCongNhan(n);
	        
	        // Nhập thông tin các công nhân
	        for (int i = 0; i < n; i++) {
	            System.out.println("Nhập thông tin công nhân thứ " + (i+1) + ":");
	            System.out.print("Họ: ");
	            String ho = sc.next();
	            System.out.print("Tên: ");
	            String ten = sc.next();
	            System.out.print("Số sản phẩm: ");
	            int soSP = sc.nextInt();
	            
	            // Tạo đối tượng CongNhan và thêm vào danh sách
	            CongNhan cn = new CongNhan(ho, ten, soSP);
	            ds.themCongNhan(cn);
	        }
	        
	        // Xuất toàn bộ thông tin công nhân viên
	        System.out.println("Thông tin toàn bộ công nhân viên:");
	        ds.xuatDanhSach();
	        
	        // Tính số lượng công nhân viên trong danh sách
	        int soLuongCN = ds.tinhSoLuongCN();
	        System.out.println("Số lượng công nhân viên trong danh sách: " + soLuongCN);
	        
	        // Xuất thông tin các công nhân làm trên 200 sản phẩm
	        System.out.println("Thông tin các công nhân làm trên 200 sản phẩm:");
	        ds.xuatCongNhanSPTren200();
	        
	        // Sắp xếp công nhân theo số sản phẩm giảm dần
	        System.out.println("Danh sách công nhân được sắp xếp theo số sản phẩm giảm dần:");
	        ds.sapXepTheoSoSPGiamDan();
	        ds.xuatDanhSach();
	    }

	}
}
