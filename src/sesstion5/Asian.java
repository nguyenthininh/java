package sesstion5;

public class Asian extends Human{   // extends nghia la lop Asian ke thua lop Human

    public void sayHi(){

    }

    public  void showInfo(){  //ke thừa của lớp cha
        super.showInfo();  //muốn cho nó hiện ra cả ham showInfo của lớp human
        System.out.println("override");


    }  //thuc hiện ghi đè

    public void sayHello(){
        this.sayHi();
        System.out.println("Hello world");
    }

    public void sayHello(String msg){
        System.out.println(msg);
    }
    public void sayHello(int msg){

    }

    public void sayHello(String msg, int age){

    }
//    public void sayHello(String msg1, int age1){  //tham so truyen vao co khac nhau nhưng vẫn bị lỗi
//    }

    public void sayHello(int age, String msg){

    }

    //overload nghia la nap chong (cung ten ham nhuwng khac nhau ve tham so
    //overide nghia la ghi de  td la lop con ke thua lop cha
}
