//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;

public class Contacts {
    String name;
    String phone;
    String Email;
    ArrayList<String> msg = new ArrayList();

    public Contacts(String name, String phone, String email, String msg) {
        this.name = name;
        this.phone = phone;
        this.Email = email;
        this.msg.add(msg);
    }

    public Contacts() {
    }

    public String getName() {
        return this.name;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getEmail() {
        return this.Email;
    }

    void getContact() {
        System.out.println("Name :" + this.name);
        System.out.println("Phone :" + this.phone);
        System.out.println("Email :" + this.Email);
    }

    void GetMsg() {
        if(this.msg.isEmpty()){
            return;
        }
        System.out.println("Name :" + this.name);
        System.out.print("Message :");

        for(String s : this.msg) {
            System.out.println(s);
        }

    }

    public void setMsg(String mg) {
        this.msg.add(mg);
    }

    public void Get() {
        System.out.println("Name :" + this.name);
        System.out.println("Phone :" + this.phone);
        System.out.println("Email :" + this.Email);
        if(this.msg.isEmpty()){
            return;
        }
        System.out.print("Message :");

        for(String s : this.msg) {
            System.out.println(s);
        }

    }
}
