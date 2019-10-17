package lapsession5;

import java.util.Scanner;

public class Person {
    public String ten;
    public String gioitinh;
    public String ngaysinh;
    public String diachi;

    public Person(){

    }
    public Person(String ten, String gioitinh, String diachi){
        this.ten=ten;
        this.gioitinh=gioitinh;
        this.diachi=diachi;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void inputInfo(){
        System.out.println("nhap thong tin ");
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten: ");
        setTen(sc.nextLine());
        System.out.println("nhap gioi tinh");
        setGioitinh(sc.nextLine());
        System.out.println("nhap ngay sinh (year-month-day)");
        setNgaysinh(sc.nextLine());
        System.out.println("nhap dia chi");
        setDiachi(sc.nextLine());
    }

    public void showInfo(){
        System.out.println("thong tin cua Person la:");
        System.out.println("ten:" +getTen());
        System.out.println("gioi tinh: " +getGioitinh());
        System.out.println("ngay sinh: " +getNgaysinh());
        System.out.println("dia chi: " +getDiachi());
    }


}


//    String ngaysinh = "2019-02-22";
//    String[] arr = ngaysinh.split("-");
//    for(int i=0;i<arr.length; i++){
//        System.out.println(arr[i]);
//    }
//   int year =Integer.parseInt(arr[0]);
//    System.out.println("year " +year);

