package baitaptronglop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ProductServices service = new ProductServices();

        Product[] dsSanPham = new Product[5];
        dsSanPham[0] = new Product(1, "My", 11000, 2);
        dsSanPham[1] = new Product(2, "Monster", 27000, 5);
        dsSanPham[2] = new Product(3, "iPhone 6s Cu", 3900000, 1);
        dsSanPham[3] = new Product(4, "Lenovo Legion Pro 5", 20000000, 1);
        dsSanPham[4] = new Product(5, "Banh", 10000, 11);

        System.out.println("San pham co gia duoi 100000:");
        service.locGiaDuoi(dsSanPham, 100000);

        System.out.println("\nSan pham co so luong lon hon 10:");
        service.locSoLuongLonHon(dsSanPham, 10);

        System.out.print("\nNhap id san pham muon tim: ");
        int key = scan.nextInt();
        service.findProductById(dsSanPham, key);

        System.out.println("\nSan pham co gia cao nhat trong kho la:");
        service.MaxPrice(dsSanPham);
        
        System.out.println("tong so tien ma MAY can thanh toan la: ");
        service.calculateTotalValue(dsSanPham);
        
        scan.close();
    }
}