package baitaptronglop;
import java.util.Scanner; 

public class Product {
	private int id;
	private String name;
	private double price;
	private int quantity;
	
	//setter 
	public void setID(int MaSP) {
		this.id = MaSP;
	}
	public void setName(String TenSP) {
		this.name = TenSP;
	}
	public void setPrice(double GiaSP) {
		this.price = GiaSP;
	}
	public void setQuantity(int SoSP) {
		this.quantity = SoSP;
	}
	
	//getter 
	public int getID() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	
	//Constructer 
	public Product() {
		//notthing
	}
	public Product(int id, String name, double price, int quantity) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	Scanner scan = new Scanner(System.in);
	
	public void NhapSP(Scanner scan) {
		System.out.print("Nhap id san pham: ");
		id = scan.nextInt();
		scan.nextLine();
		System.out.print("Nhap ten san pham: ");
		name = scan.nextLine();
		System.out.print("Nhap gia san pham: ");
		price = scan.nextDouble();
		System.out.print("Nhap so luong san pham: ");
		quantity = scan.nextInt();
		
	}
	
	public void printProduct() {
		System.out.println("ID: "+id);
		System.out.println("Ten San Pham: "+name);
		System.out.println("Gia San Pham: "+price);
		System.out.println("So Luong San Pham: "+quantity);
	}
}






