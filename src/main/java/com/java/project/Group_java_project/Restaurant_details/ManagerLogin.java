package com.java.project.Group_java_project.Restaurant_details;

// login authentication for restaurant manager
public class ManagerLogin {

    final String manager_name = "manager";
    final String manager_password = "manager1";

    // method to check manager credentials
    public boolean auth(String username, String password) {

        if(manager_name.equals(username) && manager_password.equals(password)) {
            System.out.println("Restaurant Manager Logged in Successfully");
            return true;
        }
        else {
            System.out.println("Manager Login Failed\nTry again with valid credentials");
            return false;
        }
    }
}