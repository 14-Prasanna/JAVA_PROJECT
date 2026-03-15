package com.java.project.Group_java_project.Restaurant_details;

// login authentication for restaurant manager
public class Customer_Login {

    final String customer_name = "customer";
    final String customer_password = "customer1";

    // method to check manager credentials
    public boolean auth(String username, String password) {

        if(customer_name.equals(username) && customer_password.equals(password)) {
            System.out.println("Customer Logged in Successfully");
            return true;
        }
        else {
            System.out.println("Customer Login Failed\nTry again with valid credentials");
            return false;
        }
    }
}