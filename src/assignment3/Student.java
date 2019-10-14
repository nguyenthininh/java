package assignment3;

import java.util.Scanner;

public class Student {
    private String mssv;
    private private double diemso;
    private int tuoi;
    private String lophoc;


    public Student(){
        System.out.println("ham khoi tao khong tham so");
    }

    public Student(String mssv, double diemso,int tuoi,String lophoc ){
        this.mssv=mssv;
        this.diemso = diemso;
        this.tuoi= tuoi;
        this.lophoc = lophoc;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        while (mssv.length()!=8){
            System.out.println("nhap lai: mssv phai du 8 ki tu");
            Scanner sc = new Scanner(System.in);
            mssv = sc.nextLine();
        }
        this.mssv = mssv;
    }

    public double getDiemso() {
        return diemso;
    }

    public void setDiemso(double diemso) {
        while (diemso < 0 || diemso > 10){
            System.out.println("nhap lai diem so: phai tu 0.0 den 10.0");
            Scanner sc = new Scanner(System.in);
            diemso = sc.nextInt();
            }
        this.diemso = diemso;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        while (tuoi<18){
            System.out.println("vui long nhap lai: sinh vien phai >= 18 tuoi");
            Scanner sc = new Scanner(System.in);
            tuoi = sc.nextInt();
        }
        this.tuoi = tuoi;
    }

    public String getLophoc() {
        return lophoc;
    }

    public void setLophoc(String lophoc) {
        while (!(lophoc.startsWith("A") || lophoc.startsWith("C"))) {
            System.out.println("Vui long nhap lai: Lop hoc phai bat dau chu A hoac C");
            Scanner sc = new Scanner(System.in);
            lophoc = sc.nextLine();
        }
        lophoc = lophoc;
    }


    public void inputInfo(){
        System.out.println("Nhap thong tin sinh vien");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma so sinh vien: 8 ky tu");
        setMssv(sc.nextLine());
        System.out.println("Nhap diem sinh vien: tu 0.0 den 10.0");
        setDiemso(sc.nextDouble());
        System.out.println("Nhap tuoi sinh vien: >= 18 tuoi");
        setTuoi(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap lop sinh vien: bat dau chu A hoac C");
        setLophoc(sc.nextLine());

    }

    public void showInfo(){
        System.out.println("Thong tin chi tiet cua sinh vien la: ");
        System.out.println("mssv: " + getMssv());
        System.out.println("tuoi: " + getTuoi());
        System.out.println("diem: " + getDiemso());
        System.out.println("lop hoc: " + getLophoc();
    }


    public void xetHocbong(){
        if(diemso>=8){
            System.out.println("Sinh vien nay duoc hoc bong");
        }
        else {
            System.out.println("Sinh vien nay khong duoc hoc bong");
        }
    }

}
