package assignment4;

import java.util.Scanner;

public class Product {
    public int id;
    public String productName;
    public int soluong;
    public double gia;

    public Product(){

    }
    public Product(int id, String productName,int soluong, double gia){
        this.id=id;
        this.productName=productName;
        this.soluong=soluong;
        this.gia = gia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
//        if(soluong >0){
//            System.out.println("con hang");
//        }else{
//            System.out.println("da het hang");
//        }
//        this.soluong = soluong;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public void inputProduct(){
        System.out.println("Nhap thong tin san pham");
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap id");
        setId(sc.nextInt());
        sc.nextLine();
        System.out.println("nhap ten san pham");
        setProductName(sc.nextLine());
        sc.nextLine();
        System.out.println("nhap so luong");
        setSoluong(sc.nextInt());
        System.out.println("nhap gia");
        setGia(sc.nextInt());
    }

    public void showProduct(){
        System.out.println("thong tin san pham la:");
        System.out.println("id " +getId());
        System.out.println("ten san pham la :" +getProductName());
        System.out.println("so luong la :" +getSoluong());
        System.out.println("gia san pham la :" +getGia());
    }

    public boolean checkSoLuong(){
        if(this.getSoluong() >0){
            return true;
        }
        System.out.println("san pham het hang");
        return false;
    }


}
