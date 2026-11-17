//package baitaptronglop;
//import java.util.Scanner; 
//public class Product_Main {
//
//	public static void main(String[] args) {
//		Product[] dsSanPham = new Product[5];
//        dsSanPham[0] = new Product(001, "My", 11000, 2);
//        dsSanPham[1] = new Product(002, "Monster", 27000, 5);
//        dsSanPham[2] = new Product(003, "iPhone 6s Cũ", 3900000, 1);
//        dsSanPham[3] = new Product(004, "Lenovo Legion Pro 5", 20000000, 1);
//        dsSanPham[4] = new Product(005, "Banh", 10000, 11);
//        
//        System.out.println("San pham co gia duoi 100000: ");
//        for (int i = 0; i < dsSanPham.length; i++) {
//        	if(dsSanPham[i].getPrice() < 100000) {
//        		dsSanPham[i].printProduct();
//        	}
//        }
//		
//        System.out.println("San pham co so luong san pham lon hon 10: ");
//        for (int i = 0; i < dsSanPham.length; i++) {
//        	if(dsSanPham[i].getQuantity() > 10) {
//        		dsSanPham[i].printProduct();
//        	}
//        }
////       
//    	Scanner scan = new Scanner(System.in);
////        int key;
////        System.out.print("Nhap id san pham muon tim ");
////        key = scan.nextInt();
////        for (int i = 0; i < dsSanPham.length; i++) {
////        	if (dsSanPham[i].getID() == key ) {
////        		dsSanPham[i].printProduct();
////        	}
////        }
//        
////        int count = 0;
////        for (int i = 0; i < dsSanPham.length; i++) {
////        	for (int j = 1; j < dsSanPham.length; j++) {
////        		if (dsSanPham[j].getPrice() > dsSanPham[i].getPrice()) {
////        			count = j;
////        		}
////        	}
////        }
////        
////        System.out.println("San pham co gia cao nhat trong kho la");
////        dsSanPham[count].printProduct();
//        
//       }
//
//	}
//
//
