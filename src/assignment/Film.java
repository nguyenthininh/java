package assignment;

import java.util.Scanner;

public class Film {
    private int id;
    private String name;
    private double price;


    public Film() {

    }

    public Film(int id,String name, double price) {
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public void creatFilm(){
        System.out.println("Vui long Nhap thong tin:");
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap id:");
        setId(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap ten film:");
        setName(sc.nextLine());
        System.out.println("Nhap gia ve:");
        setPrice(sc.nextDouble());
    }

    public void readFilm(){
        if (getName() != null && getPrice() != 0){
            System.out.println("id:" +this.getId());
            System.out.println("ten phim: " +this.getName());
            System.out.println("gia ve:" +this.getPrice());
        }
    }

    public void updateFilm(){
        System.out.println("Nhap thong tin film moi");
        this.creatFilm();
    }

    public void deleteFilm(){
        this.setId(0);
        this.setName(null);
        this.setPrice(0);

    }



}


