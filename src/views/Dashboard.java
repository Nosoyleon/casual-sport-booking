package views;

import java.util.Scanner;
import controllers.UserActions;

public class Dashboard {

	public static void main(String[] args) {
		mainMenu();
	}

	private static void mainMenu() {
		Scanner scanner = new Scanner(System.in);
		byte userInput;

		do {
			System.out.println("############### Welcome! ###############");
			System.out.println("");
			System.out.println("Que deses hacer hoy?");
			System.out.println("");
			System.out.println("(1) - Agregar un usuario.");
			System.out.println("(2) - Listar usuarios.");
			System.out.println("(3) - Crear un evento Nuevo.");
			System.out.println("(4) - Listar los eventos.");
			System.out.println("(0) - Salir :(.");

			userInput = (byte) scanner.nextInt();

			System.out.println("");

			switch (userInput) {
			case 0:
				System.out.println("Adios!");
				break;
			case 1:
				UserActions.addUser(scanner);
				break;
				
			case 2:
				UserActions.listUsers();
				break;
			default:
				System.out.println("Opción no válida.");
				System.out.println("");
				break;
			}

		} while (userInput != 0);
		scanner.close();

	}

}
