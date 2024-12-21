//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static Scanner scanner;
    static ArrayList<Contacts> contact;
    static Map<String, Contacts> m;


    public static void main(String[] args) {
        label24:
        while(true) {
            BalChal.show();
            int c = scanner.nextInt();
            if (c == 4) {
                System.out.println("Quiting...");
                return;
            }

            switch (c) {
                case 1:
                    while(true) {
                        BalChal.showcontact();
                        System.out.println("Select");
                        int in = scanner.nextInt();
                        if (in == 5) {
                            continue label24;
                        }

                        manageContacts(in);
                    }
                case 2:
                    while(true) {
                        BalChal.showmsg();
                        System.out.println("Select");
                        int in = scanner.nextInt();
                        if (in == 3) {
                            continue label24;
                        }

                        manageMessage(in);
                    }
                case 3:
                    showAll();
                    break;
                default:
                    System.out.println("Invalid");
            }
        }
    }

    private static void manageMessage(int in) {
        switch (in) {
            case 1:
                showM();
                break;
            case 2:
                System.out.print("Enter contact name=");
                scanner.nextLine();
                String name = scanner.nextLine();
                System.out.print("Enter message=");
                String msg = scanner.nextLine();
                setMsg(name, msg);
                break;
            default:
                System.out.println("Invalid Input");
        }

    }

    private static void setMsg(String name, String msg) {
        if (m.containsKey(name)) {
            Contacts target = (Contacts)m.get(name);
            target.setMsg(msg);
        } else {
            set(name, msg);
        }

    }

    private static void showM() {
        for(Contacts c : contact) {
            c.GetMsg();
        }

    }

    private static void manageContacts(int c) {
        switch (c) {
            case 1:
                showC();
                break;
            case 2:
                System.out.print("Enter new contact name=");
                scanner.nextLine();
                String name = scanner.nextLine();
                System.out.print("Enter new contact number=");
                String phone = scanner.nextLine();
                System.out.print("Enter new Email=");
                String email = scanner.nextLine();
                setNumber(name, phone, email);
                break;
            case 3:
                System.out.println("What you want to search?");
                scanner.nextLine();
                String nam = scanner.nextLine();
                search(nam);
                break;
            case 4:
                System.out.println("Which contact do you want to remove?");
                scanner.nextLine();
                String na = scanner.nextLine();
                System.out.println();
                dlt(na);
                break;
            default:
                System.out.println("Invalid Input");
        }

    }

    private static void dlt(String name) {
        Contacts toRemove = null;

        for(Contacts c : contact) {
            if (c.getName().equals(name)) {
                toRemove = c;
                break;
            }
        }

        if (toRemove != null) {
            contact.remove(toRemove);
            m.remove(name);
        } else {
            System.out.println("Contact not found.");
        }

    }

    private static void search(String name) {
        boolean result = false;

        for(Contacts c : contact) {
            if (c.getName().equals(name)) {
                c.getContact();
                result = true;
            }
        }

        if (!result) {
            System.out.println("Not Found");
        }

    }

    private static void searchusingmap(String name) {
        boolean result = false;
        if (m.containsKey(name)) {
            m.get(name);
            result = true;
        }

        if (!result) {
            System.out.println("Not Found");
        }

    }

    private static void setNumber(String name, String phone, String email) {
        Contacts c = new Contacts(name, phone, email, "");
        contact.add(c);
        m.put(name, c);
        m.put(phone, c);
        m.put(email, c);
    }

    private static void set(String name, String msg) {
        System.out.println("Contact not found");
        Contacts c = new Contacts(name, "", "", msg);
        contact.add(c);
        m.put(name, c);
        m.put(msg, c);
        System.out.println("Saved as new");
    }

    private static void showC() {
        for(Contacts c : contact) {
            c.getContact();
        }

    }

    private static void showAll() {
        for(Contacts c : contact) {
            c.Get();
        }

    }

    static {
        scanner = new Scanner(System.in);
        contact = new ArrayList();
        m = new HashMap();
    }
}
