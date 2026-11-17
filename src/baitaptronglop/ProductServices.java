package baitaptronglop;
import java.util.Scanner; 
public class ProductServices {
	
//	public void NhapSP(Product[] ds, Scanner scan) {
//		for (int i = 0; i < ds.length; i++) {
//			System.out.print("Nhap id san pham: ");
//			int id = scan.nextInt();
//			scan.nextLine();
//			System.out.print("Nhap ten san pham: ");
//			String name = scan.nextLine();
//			System.out.print("Nhap gia san pham: ");
//			double price = scan.nextDouble();
//			System.out.print("Nhap so luong san pham: ");
//			int quantity = scan.nextInt();
//        }
//		
//	}
	
	public void printProduct(Product p) {
	    if (p != null) {
	        p.printProduct(); 
	    }
	}
	
	public void locGiaDuoi(Product[] ds, double Gia ) {
		Gia = 100000;
		for (int i = 0; i < ds.length; i++) {
        	if(ds[i].getPrice() < Gia) {
        		ds[i].printProduct();
        	}
        }
	}
	
	public void locSoLuongLonHon(Product[] ds, double so ) {
		so = 10;
		for (int i = 0; i < ds.length; i++) {
        	if(ds[i].getQuantity() > so) {
        		ds[i].printProduct();
        	}
        }
	}
	
	public void findProductById(Product[] ds, int id) {
		boolean timThay = false;
        for (Product sp : ds) {
            if (sp.getID() == id) {
                sp.printProduct();
                timThay = true;
            }
        }
        if (!timThay) {
            System.out.println("Khong tim thay san pham co ID = " + id);
        }
	}
	
	public void MaxPrice(Product[] ds) {
		int count = 0;
        for (int i = 0; i < ds.length; i++) {
        	for (int j = 1; j < ds.length; j++) {
        		if (ds[j].getPrice() > ds[i].getPrice()) {
        			count = j;
        		}
        	}
        }
        ds[count].printProduct();
	}
	
	public double calculateTotalValue(Product[] ds) {
		double tong = 000;
		for (int i = 0; i < ds.length; i++) {
			tong = (ds[i].getPrice() * ds[i].getQuantity()) + tong ;
		}
		System.out.println(tong);
		return 0 ; 
	}
	
	}
