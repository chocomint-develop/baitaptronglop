package baitaptronglop;
import java.util.Scanner;

public class bai2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int day = 0;		
		do { 
			System.out.print("Nhập số để có điều bất ngờ: ");
			day = scan.nextInt();
		} while (day < 2 || day > 8);
		
		if (day == 2) {
			System.out.println("Hôm nay là thứ 2");		
		}
		if (day == 3) {
			System.out.println("Hôm nay là thứ 3");		
		}
		if (day == 4) {
			System.out.println("Hôm nay là thứ 4");		
		}
		if (day == 5) {
			System.out.println("Hôm nay là thứ 5");		
		}
		if (day == 6) {
			System.out.println("Hôm nay là thứ 6");		
		}
		if (day == 7) {
			System.out.println("Hôm nay là thứ 7");		
		}
		if (day == 8) {
			System.out.println("Hôm nay là thứ chủ nhật");		
		}
		
	}	

}
