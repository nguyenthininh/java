package jv2_lapsession3;

public class Main {
    public static void main(String[] args) {

//        Runnable r1 = ()->{
//            for (int i=10; i>0; i--) {
//                try {
//                    System.out.println(i + "s");
//                    Thread.sleep(1000);
//                } catch (Exception e) {
//
//                }
//            }
//            for (int i=10; i>0; i--) {
//                try {
//                    Thread.sleep(1000);
//                } catch (Exception e) {
//
//                }
//            }
//            System.out.println("no hookup");
//        };
//        Thread t1 = new Thread(r1);
//        t1.start();


        Runnable  r2 = ()->{
            int time = 10*60;
            String strmin = "";
            String strsec = "";
            for (int i=time; i>=0; i--) {
                try{
                    int min = (int)Math.floor(i/60);
                    int sec = i - min*60;
                    if (min < 10) {
                        strmin = String.format("0%d", min);
                    }else {
                        strmin = String.format("%d", min);
                    }
                    if (sec < 10) {
                        strsec = String.format("0%d", sec);
                    }else {
                        strsec = String.format("%d", sec);
                    }
                    System.out.println(strmin+":"+strsec);
                    Thread.sleep(1000);
                }catch (Exception e) {

                }
            }
        };
        Thread t2 = new Thread(r2);
        t2.start();
    }
}
