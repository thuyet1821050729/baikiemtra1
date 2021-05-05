package baikiemtra;
import java.util.Scanner;

public class bai1 {
	interface Nhacungcap{
		void manhacungcap(String mncc);
		void ten(String ten);
		void diachi(String diachi);
	}
	public class Ncp implements Nhacungcap{
		String mncc,ten,diachi;
		Scanner sc;


		public void nhap() {
			sc = new Scanner(System.in);
			System.out.print("nhap vao ma nha cung cap : ");
			mncc=sc.next();
			System.out.print("nhap vao ten : ");
			ten=sc.next();
			System.out.print("nhap vao dia chi : ");
			diachi = sc.next();
		}
		public void hienthi() {
			System.out.print("ma nha cung cap la "+mncc);
			System.out.print("dia chi la "+diachi);
			System.out.print("ten nha cung cap  "+ten);
			
			
		}
		@Override
		public void manhacungcap(String mncc) {
			// TODO Auto-generated method stub
			this.mncc=mncc;
			
		}
		@Override
		public void ten(String ten) {
			// TODO Auto-generated method stub
			this.ten=ten;
			
		}
		@Override
		public void diachi(String diachi) {
			// TODO Auto-generated method stub
			this.diachi = diachi;
			
		}
	}
	public static void main(String[] args) {
		
	}

}
