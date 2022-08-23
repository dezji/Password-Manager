// Project completed by Deziallia Morris

package com.dezji.passwordmanager;
import java.util.Scanner;

public class UserApplication {

	public static void main(String[] args) {
		
		final int MAX_USERS = 100;
		
		Scanner scanner = new Scanner(System.in);
		String strUserInput = null;
		int intUserInput = 0;
		int index = 0;
		int location = -1;
		User[] userArray = new User[MAX_USERS];

		do {
			System.out.println("\nEnter your choice: ");
			System.out.println("1. Add User");
			System.out.println("2. Find User By Last Name");
			System.out.println("3. List All Users");
			System.out.println("4. Exit");
			strUserInput = scanner.nextLine();
			intUserInput = Integer.parseInt(strUserInput);
					
			switch (intUserInput) {
				case 1:
					if (index == MAX_USERS) {
						System.out.println("Array is full. No more users can be added.");
						}
					else {
						System.out.print("Enter the first name: ");
						String firstName = scanner.nextLine();
						
						
						System.out.print("Enter the last name: ");
						String lastName = scanner.nextLine();;
						
						User user = new User(firstName, lastName);
						
						userArray[index] = user;
						System.out.println("\nUser Added!");
						index++;
					}
					break;
					
				case 2:
					System.out.println("Enter a user's last name: ");
					String lastName = scanner.nextLine();
					
					for (int i = 0; i < userArray.length; i++) {
						if (userArray[i] == null) {
							break;
						}
						else {
							String searchItem = userArray[i].getLastName();
							if (searchItem.equalsIgnoreCase(lastName)) {
								location = i;
								break;
							}
						}
					}
					if (location < 0) {
						System.out.println("User cannot be found");
					}
					else {
						System.out.println(userArray[location].toString());
					}
					location = -1;
					break;
					
				case 3:
					for (int i = 0; i < userArray.length; i++) {
						if (userArray[i] == null)
							break;
						System.out.println(userArray[i].toString());
					}
					break;
					
				case 4:
					System.out.println("Exiting Application...");
					scanner.close();
					break;
				default:
					System.out.println("Invalid menu option entered. Try again.");
			}
		} while (intUserInput != 4);

	}

}
