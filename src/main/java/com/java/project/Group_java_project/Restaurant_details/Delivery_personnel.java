package com.java.project.Group_java_project.Restaurant_details;

//login authentication for delivery personnel
public class Delivery_personnel {

 final String delivery_name = "delivery";
 final String delivery_password = "delivery1";

 // method to check delivery personnel credentials
 public boolean auth(String username, String password) {

     if(delivery_name.equals(username) && delivery_password.equals(password)) {
         System.out.println("Delivery Personnel Logged in Successfully");
         return true;
     }
     else {
         System.out.println("Delivery Login Failed\nTry again with valid credentials");
         return false;
     }
 }
}