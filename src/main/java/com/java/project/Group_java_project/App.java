package com.java.project.Group_java_project;

import java.util.*;

import com.java.project.Group_java_project.Restaurant_details.Customer_Login;
import com.java.project.Group_java_project.Restaurant_details.Login;
import com.java.project.Group_java_project.Restaurant_details.ManagerLogin;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("------ Welcome ------");
        System.out.println("1. Admin Login");
        System.out.println("2. Restaurant Manager Login");
        System.out.println("Choose your role : ");

        int choice = sc.nextInt();
        sc.nextLine();

        switch(choice) {

            case 1:

                System.out.println("Enter Admin Name : ");
                String adminUser = sc.nextLine();

                System.out.println("Enter Admin Password : ");
                String adminPass = sc.nextLine();

                Login adminLogin = new Login();

                boolean adminOk = adminLogin.auth(adminUser, adminPass);

                break;


            case 2:

                System.out.println("Enter Manager Name : ");
                String managerUser = sc.nextLine();

                System.out.println("Enter Manager Password : ");
                String managerPass = sc.nextLine();

                ManagerLogin managerLogin = new ManagerLogin();

                boolean managerOk = managerLogin.auth(managerUser, managerPass);

                break;
                
                
            
            case 3:

                System.out.println("Enter Customer Name : ");
                String customerUser = sc.nextLine();

                System.out.println("Enter Customer Password : ");
                String customerPass = sc.nextLine();

                Customer_Login customerLogin = new Customer_Login();

                boolean customerOk = customerLogin.auth(customerUser, customerPass);

                break;


            default:
                System.out.println("Invalid Option Selected");
                
                


        }

        sc.close();
    }
}