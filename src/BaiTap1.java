
import java.util.Scanner;

public class BaiTap1 {

    public static void main(String[] args) {

        int n;
        System.out.println("nhap n :");
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();

        System.out.println("cac so nguyen to nho hon "+n+" la :");
        for(int i =1; i<n; i++){
            int count==0;
            for(int j=1; j<i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println("" +i);
            }
        }

    }
}
