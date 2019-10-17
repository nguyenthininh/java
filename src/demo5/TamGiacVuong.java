package demo5;

public class TamGiacVuong extends TamGiac{
    public TamGiacVuong(int canh1,int canh2,int canh3){
        super(canh1,canh2,canh3);
        if(!checkTamGiacVuong()){
            System.out.println("day khong phai tam giac can");
        }
    }

    public boolean checkTamGiacVuong(){
        int max = Math.max(Math.max(getCanh1(),getCanh2()),getCanh3());
        if(canh1*canh1 + canh2*canh2+canh3*canh3 == max*max*2){
            return true;
        }
        return false;
    }
}


//    public boolean kiemTra(int a,int b,int c){
//        if(canh1*canh1==canh2*canh2 +canh3*canh3 || canh2*canh2==canh1*canh1 +canh3*canh3 || canh3*canh3==canh1*canh1 +canh2*canh2){
//            return true;
//        }
//        return false;
//    }

