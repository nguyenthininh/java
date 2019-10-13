package baitap;

public class Main {

    public static void main (String args[]) {
//        NhanVien nv1 = new NhanVien();
//        nv1.inputInfor();
//        nv1.printInfo();
//        System.out.println("thuong thang cua nhan vien " nv1.getTen() + "la" +nv1.getTienluong());
//
//
//        TamGiac tg = new TamGiac();
//        TamGiac tg2 = new TamGiac(1,2,3);
//        System.out.println("dien tich" +tg2.dienTich());


        PhanSo fc = new PhanSo; //tạo phân số thứ hai
        fc.nhapPhanSo();
        fc.inPhanSo();
        fc.rutGonPhanSo();
        fc.nghichDaoPhanSo();

        PhanSo dc2 = new PhanSo(1, 3);
        PhanSo tong = fc.addFraction(fc);


    }
}
