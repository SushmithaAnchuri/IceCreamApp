package ai.jobiak.icecreams;

import java.io.*;
import java.util.Scanner;

public class Admin extends Store{
	
	private String userName,password;

	public Admin(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public boolean validate() {
		if((this.userName).equals("john") && (this.password).equals("123abc"))
        {
            return true;
        }
        
    return false;
	}
	
}
