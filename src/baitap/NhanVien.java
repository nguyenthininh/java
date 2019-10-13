package baitap;

import java.util.Scanner;

public class NhanVien {

    private String ten;
    private int tuoi;
    private String diachi;
    private double tienluong;
    private int tongsogiolam;

    public NhanVien(){

    }

//public NhanVien( String ten, int tuoi, String diachi, double tienluong, int tongsogiolam){
//
//}


    public void setTen(String ten){
        this.ten=ten;
    }

    public String getTen() {
        return ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public double getTienluong() {
        return tienluong;
    }

    public void setTienluong(double tienluong) {
        this.tienluong = tienluong;
    }

    public int getTongsogiolam() {
        return tongsogiolam;
    }

    public void setTongsogiolam(int tongsogiolam) {
        this.tongsogiolam = tongsogiolam;
    }


    public void inputInfor(){

        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten nhan vien:");
        setTen(sc.nextLine());
        System.out.println("nhap tuoi nhan vien:");
        setTuoi(sc.nextInt());
        System.out.println("nhap diachi nhan vien:");
        setDiachi(sc.nextLine());
        System.out.println("nhap tien luong nhan vien:");
        setTienluong(sc.nextInt());
        System.out.println("nhap tong so gio lam nhan vien:");
        setTongsogiolam(sc.nextInt());

    }

    public void printInfo(){

        System.out.println("ten" +getTen());
        System.out.println("tuoi" +getTuoi());
        System.out.println("dia chi" +getDiachi());
        System.out.println("tien luong" +getTienluong());
        System.out.println("tong so gio lam" +getTongsogiolam());
    }

    public void tinhluong(){
        double thuong =0;
        if(getTongsogiolam() >= 200) {thuong= getTienluong() * 20 /100}
        else if (getTongsogiolam() >= 100) {thuong = getTienluong() *10 /100}
        else {thuong =0;}
        return thuong;
    }

}

