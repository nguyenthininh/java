package jv2_lapsession4;

public class SoNguyenTo {
    public int snt = 2;
    public int prev_snt;

    public boolean checkSoNguyenTo(int n){
        if (n<=1) return false;
        if (n<=3) return true;
        for( int i=2; i<=n/2;i++){
            if (n%i==0) return false;
        }
            return true;
    }

    public synchronized int soNguyenToTiepTheo(){
        for (int i=snt+1;true;i++){
            if(checkSoNguyenTo(i)){
                //prev_snt = snt;
                snt =i;
                notify();
                System.out.println("next: " +snt);

            }
        }
    }

    public synchronized void binhPhuong(){
        if (prev_snt ==snt){
            try {
                wait();
            }catch (Exception e){

            }
            System.out.println("binhg phuong:" +(snt*snt));
        }

    }


}
