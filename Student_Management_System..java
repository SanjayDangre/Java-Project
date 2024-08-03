import com.sun.jdi.ArrayReference;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class project1 {
    static boolean e = true;
    public static ArrayList<List<String>> primary = new ArrayList();

    public static void register(Scanner sc) {
        List<String> secondary = new ArrayList();
        System.out.println("Enter Student Name: ");
        String name = sc.next();
        sc.nextLine();
        secondary.add(name);
        System.out.println("Enter Student Roll no: ");
        String rollno = sc.next();
        secondary.add(rollno);
        System.out.println("Enter Student Mobile no: ");
        String mobno = sc.next();
        secondary.add(mobno);
        System.out.println("Enter Stuednt Branch Name: ");
        String branch = sc.next();
        secondary.add(branch);
        System.out.println("Enter Student Address: ");
        String address = sc.next();
        sc.nextLine();
        secondary.add(address);
        System.out.println("Create a strong password: ");
        String pass = sc.next();
        System.out.println("Re-type password: ");
        String rpass = sc.next();
        if (pass.equals(rpass)) {
            System.out.println("Password create successfully");
            System.out.println("Student Registered Successfully");
        } else {
            System.out.println("Incorrect password");
            System.out.println("Student Registration Failed");
        }
        secondary.add(pass);
        primary.add(secondary);
    }

    public static boolean login(Scanner sc) {
        boolean e = false;
        System.out.println("Enter Roll no: ");
        String r = sc.next();
        System.out.println("Enter your password: ");
        String p = sc.next();
        for (int i = 0; i < primary.size(); i++) {
            if (primary.get(i).get(1).equals(r) && primary.get(i).get(5).equals(p)) {
                e = true;
                System.out.println("Student Name: "+primary.get(i).get(0));
                System.out.println("Student Roll no.: "+primary.get(i).get(1));
                System.out.println("Student Mobile no.: "+primary.get(i).get(2));
                System.out.println("Student Branch Name: "+primary.get(i).get(3));
                System.out.println("Student Address: "+primary.get(i).get(4));
            }
        }
        return e;
    }


    public static void update(Scanner sc) {
        System.out.println("Enter Your Roll no: ");
        String r = sc.next();
        for (int i = 0; i < primary.size(); i++) {
            if (primary.get(i).get(1).equals(r)) {
                while (true) {
                    System.out.println("1-Name: ");
                    System.out.println("2-Roll No.: ");
                    System.out.println("3-Mobile No.: ");
                    System.out.println("4-Branch: ");
                    System.out.println("5-Address");
                    System.out.println("6-Password");
                    System.out.println("7-Exit");
                    System.out.println("Enter your choice: ");
                    int choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("Enter new name of student: ");
                            String b = sc.next();
                            System.out.println("Student Name Update Successfully");
                            primary.get(i).set(0, b);
                            break;

                        case 2:
                            System.out.println("Enter new roll no: ");
                            String m = sc.next();
                            System.out.println("Roll No. Update Successfully");
                            primary.get(i).set(1, m);
                            break;

                        case 3:
                            System.out.println("Enter new mobile number: ");
                            String p = sc.next();
                            System.out.println("Mobile No. Update Successfully");
                            primary.get(i).set(2, p);
                            break;

                        case 4:
                            System.out.println("Enter new Branch: ");
                            String j = sc.next();
                            System.out.println("Branch Update Successfully");
                            primary.get(i).set(3, j);
                            break;

                        case 5:
                            System.out.println("Enter new Address: ");
                            String l = sc.next();
                            primary.get(i).set(4, l);
                            System.out.println("Address Update Successfully");
                            break;

                        case 6:
                            System.out.println("Enter new Password: ");
                            String q = sc.next();
                            System.out.println("Re-type password: ");
                            String t = sc.next();
                            if (q == t) {
                                primary.get(i).set(1, t);
                            }
                            System.out.println("Password Update Successfully");
                            break;

                        case 7 :
                            System.out.println("Exit");
                            return;
                        default:
                            break;
                    }
                }
            }
        }
    }

     public static void remove(Scanner sc){
         System.out.println("Enter Your Roll no: ");
         String r= sc.next();
         for (int i = 0; i < primary.size(); i++) {
             if (primary.get(i).get(1).equals(r)) {
                 primary.remove(i);
             }
         }
     }
     public static void showList(List<String> sec){
        for(Object v : sec){
            System.out.println(v);
        }
     }
     public static void showAllStudents(){
        for(List<String> s : primary){
            showList(s);
            System.out.println("--------------");
        }
     }

    public static void main(String[] args) {
        System.out.println("\t\t\tWELCOME TO STUDENT MANAGEMENT SYSTEM");
        System.out.println();
        while(e){
            System.out.println("1) Register Student Account");
            System.out.println("2) Login Account");
            System.out.println("3) Update Account");
            System.out.println("4) Delete Account");
            System.out.println("5) Show All Student Account: ");
            System.out.println("Enter Your Choice : ");
            Scanner sc = new Scanner(System.in);
            int s = sc.nextInt();
            switch(s){
                case 1 :
                    register(sc);
                    break;
                case 2 :
                    if(login(sc)){
                        System.out.println("Login Successfully");
                    }else{
                        System.out.println("Invalid roll no or password");
                    }
                    break;

                case 3 :
                    update(sc);
                    break;

                case 4 :
                    remove(sc);
                    break;
                case 5 :
                    showAllStudents();
                    break;
                case 6 :
                    System.exit(0);
            }
        }
    }
}
