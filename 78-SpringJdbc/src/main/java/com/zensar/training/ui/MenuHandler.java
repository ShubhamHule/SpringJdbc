package com.zensar.training.ui;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

public class MenuHandler {
	int choice;

	UIModule module = new UIModule();

	public void displayMenu() {
		String[] menuItems = { "Add New Employee", "Edit Employee Info", "Search Employee Info",
				"List All Employee Info", "Delete Employee Info", "Exit" };
		for (int i = 0; i < menuItems.length; i++) {
			System.out.println("\t\t\t " + (i + 1) + "." + menuItems[i]);
		}
		System.out.println();
		promptChoiceInput();
	}

	public void promptChoiceInput() {
		System.out.print("\t\t\t Enter Your choice : ");
		Scanner scanner = new Scanner(System.in);
		this.choice = scanner.nextInt();
		dispatch();
	}

	public void dispatch() {
		switch (this.choice) {
		case 1:
			module.addInfo();
			break;
		case 2:
			module.updateInfo();
			break;
		case 3:
			module.searchInfo();
			break;
		case 4:
			module.listInfo();
			break;
		case 5:
			module.deleteInfo();
			break;
		case 6:
			System.out.println("\t\t\t Thank you");
			System.exit(0);

		}
	}
}
