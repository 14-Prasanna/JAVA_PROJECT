package com.java.project.Group_java_project.Restaurant_details;
import java.util.*;
//login authentication for admin
public class Login {
		final String admin_name = "admin";
		final String admin_password = "admin1";
		//method to check the name and password
		 public boolean auth(String ad_username,String ad_password) {
			if (admin_name.equals(ad_username) && 
					admin_password.equals(ad_password)) {
				System.out.println("Logged in successfully");
				return true;
			}
			else {
				System.out.println("Failed to Login\n Try "
						+ "again with valid credentials");
				return false;
			}
		}
}



