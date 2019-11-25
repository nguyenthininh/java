package bai_thi_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    static int identity = 1;

    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        boolean p= true;
        Scanner sc = new Scanner(System.in);
        while(p){
            System.out.println("1. Add Student");
            System.out.println("2. Display student");
            System.out.println("3. Save");
            System.out.println("4. Exit");

            int opt = sc.hasNextInt()?sc.nextInt():4;
            switch (opt){
                case 1: studentList.add(Program.addStudent()); break;
                case 2:
                    for (Student s:studentList){
                        System.out.println(s.getId()+ "--"+s.getName()+ "--"+s.getAddress()+"--"+s.getPhone());
                    }
                    break;
                //case 3: studentList.save(Program.saveStudent()); break;
                case 4: p=false;break;
            }



        }

    }

    public static Student  addStudent(){
        Scanner sc = new Scanner(System.in);
        int id = identity++;
        System.out.println("Nhap ten:");
        String name = sc.nextLine();
        System.out.println("Nhap dia chi:");
        String address = sc.nextLine();
        System.out.println("nhap phone");
        int phone = sc.nextInt();

        return new Student(id,name,address,phone);

    }

//    public stattic show() {
//        for (Student s : addStudent()) {
//            System.out.format("%5d | ", s.getName());
//            System.out.format("%20s | ", s.getAddress());
//            System.out.format("%20s | ", s.getPhone());
//        }
//    }

//    public static Student saveStudent(){
//
//    }




}
