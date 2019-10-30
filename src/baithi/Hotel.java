package baithi;

import java.util.ArrayList;
import java.util.Scanner;

public class Hotel {
        public String name;
        public String location;
        public String ownerName;


        public Hotel(){

        }

        public Hotel(String name, String location, String ownerName) {
            this.name = name;
            this.location = location;
            this.ownerName = ownerName;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getOwnerName() {
            return ownerName;
        }

        public void setOwnerName(String ownerName) {
            this.ownerName = ownerName;
        }


        public void inputInfo(){
//            System.out.println("nhap thong tin:");
            Scanner sc = new Scanner(System.in);
            System.out.println("nhap ten khach san:");
            setName(sc.nextLine());
            System.out.println("nhap vi tri:");
            setLocation(sc.nextLine());
            System.out.println("nhap chu so huu:");
            setOwnerName(sc.nextLine());

        }

        public void showInfo(){
            System.out.println("Thong tin chi tiet cua Hotel la: ");
            System.out.println("name: " +getName());
            System.out.println("vi tri: " +getLocation() );
            System.out.println("chu so huu la: " + getOwnerName());

        }






    }


