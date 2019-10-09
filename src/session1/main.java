package session1;

import java.util.Scanner;

public class main {
    int age = 20;
    static String say = "hello"; //biến của lớp

    public static void main(String arg[]){
        int x;
        x = 10;
        System.out.println(" x= "+x);
        //System.out.println(main.say);
        System.out.println("nhap 1 so tu ban phim");
        Scanner sc = new Scanner(System.in);
        x= sc.nextInt();
        System.out.println("sau khi nhap x = "+x);
        main ss1 = new main();
        System.out.println("age = " + ss1.age);
        int[] ary = {1,2,3,4,5};
        //int[ư ary = new int [5];
        for  (int i=0; i<5; i++){
            System.out.println(ary[i]);
        }
        for(int z:ary){  //có ưu điểm có bao nhiêu số cũng dc, ko cần quan tâm chỉ số. nhưng nhược điểm là đếm hết số từ đầu

            System.out.println(z);
        }
    }
}
