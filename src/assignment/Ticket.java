package assignment;


import java.util.ArrayList;
import java.util.Scanner;

public class Ticket {
    private String namePerson;
    private int phone;
    private  String nameFilm;
    private Film film;

    private ArrayList<Film> listFilm = new ArrayList<>();


    public Ticket() {    //cấp ô nhớ cho các thuộc tính

    }

    public Ticket(String namePerson, int phone, String nameFilm, Film film) {
        this.namePerson = namePerson;
        this.phone = phone;
        this.nameFilm = nameFilm;
        this.film = film;

    }

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getNameFilm() {
        return nameFilm;
    }

    public void setNameFilm(String nameFilm) {
        this.nameFilm = nameFilm;
    }


    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public ArrayList<Film> getListFilm() {
        return listFilm;
    }

    public void setListFilm(ArrayList<Film> listFilm) {
        this.listFilm = listFilm;
    }

    public void bookTicket(){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Nhap ten film muon dat: ");
            setNameFilm(sc.nextLine());
        }while (findFilm() == null);
        this.setFilm(findFilm());
        System.out.println("Nhap ten nguoi muon dat:");
        setNamePerson(sc.nextLine());
        System.out.println("Nhap so dien thoai:");
        setPhone(sc.nextInt());
    }

    public Film findFilm() {
        for(Film f : listFilm){
            if(nameFilm.equalsIgnoreCase(f.getName())) return f;  //tra về ko phân biệt chữ hoa &chữ thường
        }
        return null;
    }


    public void showTicket(){
        System.out.println("Ten phim: " + this.getNameFilm());
        System.out.println("Ten nguoi dat: " + this.getNamePerson());
        System.out.println("So dien thoai: " + this.getPhone());
    }



}
