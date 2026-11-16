package baitaptronglop;

public class Product_Main {

	public static void main(String[] args) {
		Product pro1 = new Product();
		Product pro2 = new Product();
		Product pro3 = new Product();
		Product pro4 = new Product();
		Product pro5 = new Product();
		
		pro1.NhapSP();
		pro2.NhapSP();
		pro3.NhapSP();
		pro4.NhapSP();
		pro5.NhapSP();
		
		// g) h) 
		if (pro1.getPrice() < 100000 & pro1.getQuantity() > 10) {
			pro1.printProduct();
		}
		if (pro2.getPrice() < 100000 & pro2.getQuantity() > 10 ) {
			pro2.printProduct();
		}
		if (pro3.getPrice() < 100000 & pro3.getQuantity() > 10) {
			pro3.printProduct();
		}
		if (pro4.getPrice() < 100000 & pro4.getQuantity() > 10) {
			pro4.printProduct();
		}
		if (pro5.getPrice() < 100000 & pro5.getQuantity() > 10) {
			pro5.printProduct();
		}
		

	}

}
