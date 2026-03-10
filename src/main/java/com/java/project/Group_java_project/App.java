package com.java.project.Group_java_project;
import java.util.*;
import com.java.project.Group_java_project.Restaurant_details.Login;

public class App {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//Gets the input for admin 
    System.out.println("-----Welcome!!-----");
    //from the login.java file
    System.out.println("Enter the name : ");
    String username = sc.nextLine();
    System.out.println("Enter the password");
    String password = sc.nextLine();
    //object for getting inpit from the login.java
    Login login = new Login();
    //checks the input and condition given in the login.java
	boolean ok = login.auth(username, password);
  }
}
