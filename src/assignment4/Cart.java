package assignment4;

import java.util.ArrayList;
import java.util.Scanner;

public class Cart {
    public int id;
    public String customer;
    public double grandTotal;
    public String city;
    public ArrayList<Product> productList;


    public Cart(){
        productList = new ArrayList<>();
    }

    public Cart(int id, String customer,double grandTotal, String city){
        this.id=id;
        this.customer = customer;
        this.grandTotal = grandTotal;
        this.city = city;
        this.productList = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public double getGrandTotal() {

        return grandTotal;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public ArrayList<Product> getProductList(){
        return productList;
    }

    public boolean addProfuctToCart(Product p){
        if(p.checkSoLuong()){
            this.productList.add(p);
            p.setSoluong((p.getSoluong()-1));  //them thi so luong trong kho phai tru di 1
            this.setGrandTotal(this.getGrandTotal() +p.getGia());
            return true;
        }
        return false;
    }

    public boolean removeProductFromCart(Product p){
        if(this.productList.contains(p)){  //contains co tac dung kiem tra xem trong cai gio hang cua mk co hang mk muon xoa ko
            this.productList.remove(p);
            p.setSoluong(p.getSoluong()+1);   // +1 o day la khi xoa thif so luong trong kho lai co them 1 sp
            this.setGrandTotal(this.getGrandTotal() - p.getGia());
            return true;
        }
        return false;
    }


    public double checkOut(){
        if(this.getCity().equals("HN") || this.getCity().equals("HCM")){   //equals la so sanh hai chuoi xem co bang nhau ko
            return this.getGrandTotal()*1.01;                              // xet xem "getCity" co bang "HN" ko
        }else{
            return this.getGrandTotal()*1.02;
        }
    }

    public void addCart(){
        System.out.println("thong tin khach hang");
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhap id ");
        setId(sc.nextInt());
        sc.nextLine();
        System.out.println("nhap ten khach hang ");
        setCustomer(sc.nextLine());
        System.out.println("nhap thanh pho ");
        setCity(sc.nextLine());

    }

    public void showCart(){
        System.out.println("id"+getId());
        System.out.println("ten khach hang"+getCustomer());
        System.out.println("tong tien la "+getGrandTotal());
        System.out.println("ten thanh pho la "+getCity());

        for (Product p: productList){
            p.showProduct();
        }
    }

//    public double tinhTongTien(){
//        double tong=0;
//        String HaNoi;
//        String HCM;
//        if(getCity() == "HaNoi" || getCity() == "HCM"){
//            tong = getGrandTotal() +1/100;
//        }else {
//            tong= getGrandTotal() +2/100;
//        }
//
//        return tong;
//    }
}
