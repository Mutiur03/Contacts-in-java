import java.util.ArrayList;
import java.util.List;

public class Contacts {
    String name;
    String phone;
    String Email;
    List<String> msg = new ArrayList();

    public Contacts(String name, String phone, String email, List<String>msg) {
        this.name = name;
        this.phone = phone;
        this.Email = email;
        this.msg.add(String.valueOf(msg));
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
        if(msg.isEmpty()){
            return;
        }
        System.out.println("Name :" + this.name);
        System.out.print("Message :");
        for (int i = 0; i < msg.size(); i++) {
            String cleanString = msg.get(i).replace("[", "").replace("]", "");
            System.out.println(cleanString);
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
        for (int i = 0; i < msg.size(); i++) {
            String cleanString = msg.get(i).replace("[", "").replace("]", "");
            System.out.println(cleanString);
        }

    }
}
