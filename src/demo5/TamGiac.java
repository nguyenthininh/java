package demo5;

import java.util.Scanner;

public class TamGiac {
    public int canh1;
    public int canh2;
    public int canh3;

    public TamGiac(){

    }

    public TamGiac(int canh1, int canh2,int canh3){
        while(!this.kiemTra(canh1,canh2,canh3)) {
            Scanner sc = new Scanner(System.in);
            System.out.println("nhap lai canh 1:");
            setCanh1(sc.nextInt());
            System.out.println("nhap lai canh 2:");
            setCanh2(sc.nextInt());
            System.out.println("nhap lai canh 3:");
            setCanh3(sc.nextInt());
        }
        this.setCanh1(canh1);
        this.setCanh2(canh2);
        this.setCanh3(canh3);
    }

    public int getCanh1() {
        return canh1;
    }

    public void setCanh1(int canh1) {
        this.canh1 = canh1;
    }

    public int getCanh2() {
        return canh2;
    }

    public void setCanh2(int canh2) {
        this.canh2 = canh2;
    }

    public int getCanh3() {
        return canh3;
    }

    public void setCanh3(int canh3) {
        this.canh3 = canh3;
    }

    public boolean kiemTra(int a, int b, int c) {
        if (a + b > c && a + c > b && b + c > a) {
            return true;
        }
        return false;
    }

    public int chuVi(){
        return this.getCanh1() +this.getCanh2() +this.getCanh3();
    }

    public double dienTich(){
        double p = (double)this.chuVi()/2;
        return Math.sqrt(p*(p- getCanh1() *getCanh2() *getCanh3()));

    }
}
