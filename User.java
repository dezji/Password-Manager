// Project completed by Deziallia Morris

package com.dezji.passwordmanager;
import java.lang.StringBuilder;

public class User {
	
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	public static final String COLLEGE_DOMAIN = "@farwestern.edu";
	
	
	
	public User(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		userName = createUserName(firstName, lastName, COLLEGE_DOMAIN);
		password = createdPassword(firstName, lastName);
		
	}
	
	
	
	private String createUserName(String firstName, String lastName, String COLLEGE_DOMAIN) {
		StringBuilder newUserName = new StringBuilder();
		
		char fName = firstName.toLowerCase().charAt(0);
		String lName = lastName.toLowerCase();
		String domain = COLLEGE_DOMAIN;
		
		newUserName.append(lName);
		newUserName.append(fName);
		newUserName.append(domain);
		
		return newUserName.toString();
		
	}
	
	
	private String createdPassword(String firstName, String lastName) {
		StringBuilder newPassword = new StringBuilder();
		
		String fName = firstName;
		String lName = lastName;
		
		int numberOfCharactersFirst = firstName.length();
		int numberOfCharactersLast = lastName.length();

		
		if (fName.length() > 3) {
			fName = fName.substring(0, 3);
		}
		
		if (lName.length() > 3) {
			lName = lName.substring(lName.length() - 3);
		}
		
		if (lName.contains("a") || lName.contains("o") || lName.contains("s")) {
			lName = lName.replaceFirst("a", "@");
			lName = lName.replaceFirst("o", "0");
			lName = lName.replaceFirst("s", "5");
			
		}
		
		if (fName.contains("a") || fName.contains("o") || fName.contains("s")) {
			fName = fName.replaceFirst("a", "@");
			fName = fName.replaceFirst("o", "0");
			fName = fName.replaceFirst("s", "5");
		}
		newPassword.append(lName);
		newPassword.append(fName);
		newPassword.toString().replaceFirst("a", "@").replaceFirst("o", "0").replaceFirst("s", "5");
		newPassword.append(numberOfCharactersFirst).append(numberOfCharactersLast);
		
		return newPassword.toString();
		
	}
	
	
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName +
				", password=" + password + "]";
	}

	
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	
	

}
