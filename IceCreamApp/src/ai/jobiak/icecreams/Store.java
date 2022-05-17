package ai.jobiak.icecreams;

import java.util.Scanner;

public class Store {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the username:");
        String name=sc.nextLine();
        
        System.out.println("Enter the password");
        String pass=sc.nextLine();
        
        Admin obj=new Admin(name, pass);
        if(obj.validate())
        {
            System.out.println("Valid user");
        }
        else
        {
            System.out.println("Invalid user");
        }
    }

	}
