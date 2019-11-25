package bai_thi_2;

public class Student {
    public Integer Id;
    public String Name;
    public String Address;
    public int Phone;

    public Student(){

    }

    public Student(Integer id, String name, String address, int phone) {
        Id = id;
        Name = name;
        Address = address;
        Phone = phone;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int phone) {
        Phone = phone;
    }
}
