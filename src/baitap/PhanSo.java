package baitap;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

public class PhanSo {
    private int tuso;
    private int mauso;

    public PhanSo(){
     System.out.println("ham khoi tao khong tham so");

    }

    public PhanSo(int tuso, int mauso){
        this.setTuso();
        this.setMauso();
    }

    public int getTuso() {
        return tuso;
    }

    public void setTuso(int tuso) {
        this.tuso = tuso;
    }

    public int getMauso() {
        return mauso;
    }

    public void setMauso(int mauso) {

        this.mauso = mauso;
    }

    public void setMauSo(int mauSo){
        while (mauso==0){
            Scanner sc = new Scanner(System.in);

        }
    }

    public void nhapPhanSo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap tu so: ");
        setTuso(sc.nextInt());
        sc.nextLine();
        System.out.println("nhap mau so");
//        do{
//            if(mauso == 0)
//                System.out.println("nhap lai:");
//        }while (mauso ==0);
        setMauso(sc.nextInt());
    }

    public void inPhanSo(){
        System.out.println("phan so la:" +getTuso() + "/" +getMauso());
    }

    public void Ucln(){
        int ucln =0;

//        int ucln =1;    //cach 2 tim ucln
//        int t=  Math.abs(getTuso());    //abs la gia tri tuyet doi
//        int m= Math.abs(getMauso());
//        int min = Math.min(t,m);
//        for(int i=min; i>1; i--){
//            if(t%i==0 && m%i==0){
//                ucln =i;
//                break;
//            }
//        }

        for (int i=1;i<Math.min(getMauso(),getTuso());i++){ //tim so nho nhat cua tu va mau
            if(getTuso()%i==0 &&getMauso()%i==0){
                ucln=i;
            }
        }
        return ucln;
    }


    public void rutGonPhanSo(){
        int ucln =1;
        int t=  Math.abs(getTuso()); //abs la gia tri tuyet doi
        int m= Math.abs(getMauso());
        int min = Math.min(t,m);
        for(int i=min; i>1; i--){
            if(t%i==0 && m%i==0){
                ucln =i;
                break;
            }
        } //cach 2 tim ucln
//        int i= Ucln(this.getTuso(),this.getMauso());
        this.setTuso(this.getTuso()/ucln);
        this.setMauso(this.getMauso()/ucln);
    }


    public void nghichDaoPhanSo(){
        if(getTuso() !=0){
            int tmp =getTuso();
            setTuso(getMauso());
            setMauso(tmp);
            return;
        }

        System.out.println("ko the nghic deo tu so bang 0");
    }

    public  PhanSo addFraction (PhanSo f){
        PhanSo phanSoTong = new PhanSo();
        phanSoTong.setTuso(this.getTuso()*f.getMauso() + this.getMauso()*f.getTuso());// this la phan so t1 va f la phan so thu hai
        phanSoTong.setMauso(this.getMauso()*f.getMauso());

        return phanSoTong;

    }

    public  PhanSo subFraction (PhanSo f){
        PhanSo phanSoTru = new PhanSo();
        phanSoTru.setTuso((this.getTuso()*f.getMauso() - this.getMauso()*f.getTuso());
        phanSoTru.setMauso(this.getMauso()*f.getMauso());

        return phanSoTru;
    }

    public PhanSo mulPhanSo(PhanSo f){
        PhanSo phanSoNhan = new PhanSo();
        phanSoNhan.setTuso((this.getTuso()*f.getTuso());
        phanSoNhan.getMauso(this.getMauso()*f.getMauso());

        return phanSoNhan;
    }

    public void chiaPhanSo(PhanSo f){
        PhanSo phanSoChia = new PhanSo();
        phanSoChia.setTuso(this.getTuso()*f.getMauso());
        phanSoChia.getMauso(this.getMauso()*f.getTuso());

        return phanSoChia;
    }
}
