package baithi;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String args[]) {
        ArrayList<Hotel> hotels = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            hotels.add(new Hotel());
        }

        int j = 1;
        for (Hotel ht : hotels) {
            System.out.println("nhap hotel " + j + ":");
            ht.inputInfo();
        }

        System.out.println("tim ten: ");
        Scanner search = new Scanner(System.in);
        String str = search.nextLine();
        for (Hotel ht : hotels) {
            if (ht.getOwnerName().equalsIgnoreCase(str)) {
                ht.showInfo();
            }
        }
    }
}