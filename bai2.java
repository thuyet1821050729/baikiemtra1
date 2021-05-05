package baikiemtra;
import java.util.Scanner;
public class bai2 {
	public class phieunhap{
		String mapn,ngaynhap,tennv;
		Scanner sc;
		public void nhap() {
			sc=new Scanner(System.in);
			System.out.print("nhap vao ma phieu nhao : ");
			mapn=sc.next();
			System.out.print("nhap vao ngay nhao : ");
			ngaynhap=sc.next();
			System.out.print("nhap vao ten nhan vien nhap : ");
			tennv=sc.next();
			
		}
		public void xuat() {
			System.out.println("ma phieu la : "+mapn);
			System.out.println("ngay nhap la : "+ngaynhap);
			System.out.println("ten nhan vien nhap: "+tennv);
		}
	}
	class chitietphieu extends phieunhap{
		String masp,tensp,hsd;
		int sl;
		public void nhap() {
			System.out.print("nhap vao ma sp : ");
			masp=sc.next();
			System.out.print("nhap vao ten sp : ");
			tensp=sc.next();
			System.out.print("nhap vao so luong : ");
			sl=sc.nextInt();
			System.out.print("nhap vao han su dung : ");
			hsd=sc.next();
			
			
		}
		public void xuat() {
			System.out.println("ma sp la : "+masp);
			System.out.println("ten sp la : "+tensp);
			System.out.println("so luon sp la : "+sl);
			System.out.println("han su dung la : "+hsd);
		}
	}
	public static void main(String[] args){
		Scanner sc;
		sc=new Scanner(System.in);
		int n;
		System.out.print("nhap vao sao sp : ");
		
		chitietphieu ct=new chitietphieu();
	}

}
