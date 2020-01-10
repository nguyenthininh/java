package assignment;

public class Main {
    public static void main(String[] args) {

        Ticket t = new Ticket();
        Film a = new Film();
        Film b = new Film();
        //Film b = new Film("b", 20000);
        Film c = new Film();
        a.creatFilm();
        b.creatFilm();
        c.updateFilm();
        t.getListFilm().add(a);
        t.getListFilm().add(b);
        t.getListFilm().add(c);
        // b.deleteFilm();
        for(Film f : t.getListFilm()){
            f.readFilm();
        }
        t.bookTicket();
        t.showTicket();

    }
}
