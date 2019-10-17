package demo5;

public class TamGiacCan extends TamGiacVuong{
    public TamGiacCan(int canh1,int canh2,int canh3){
        super(canh1,canh2,canh3);
        if(!checkTamGiacCan()){
            System.out.println("day khong phai tam giac can");
        }
    }

    public boolean checkTamGiacCan(){
        if(getCanh1() == getCanh2() || getCanh2() ==getCanh3() || getCanh1()==getCanh3()){
            return true;
        }
        return false;
    }

}
