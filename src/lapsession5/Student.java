package lapsession5;

import java.time.LocalDate;

public class Student extends Person{
    public void checkAge(){
        int year = 2019;
        String[] arr = this.getNgaysinh().split("-");
        int age = year  - Integer.parseInt(arr[0]);
        if( age >=18){
            System.out.println("đã dủ 18 tuoi");
        }else{
            System.out.println("chua du 18 tuoi");
        }
    }
}
