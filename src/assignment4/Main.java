package assignment4;

public class Main {
    public static void main(String args[]){
        Product p1 = new Product(1, "tivi sony",2,20000);
        Product p2 = new Product(2,"Loa sony",1,10000);
        Product p3 = new Product(3,"dien thoai iphone",5,75000);

        Cart c1= new Cart(1,"Nguyen Van A",0, "HN");
        Cart c2 = new Cart(2,"Nguyen Van B",0,"BN");

        c1.addProfuctToCart(p1);
        c1.addProfuctToCart(p1);

        System.out.println("danh sach san pham 1 la " );
        for(Product p: c1.getProductList()){
            System.out.println(p.getProductName() + "--" +p.getGia());
        }
        System.out.println("so tiem gio hang 1:" +c1.checkOut());


        c2.addProfuctToCart(p2);
        c2.addProfuctToCart(p3);

        System.out.println("danh sach san pham 2 la " );
        for(Product p: c2.getProductList()){
            System.out.println(p.getProductName() + "--" +p.getGia());
        }
        System.out.println("so tiem gio hang 2:" +c1.checkOut());


    }

}
