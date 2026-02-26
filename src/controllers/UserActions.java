package controllers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import models.User;

public class UserActions {
	public static void addUser(Scanner scanner) {

		User newUser = new User(Enums.UserRole.PLAYER);

		System.out.println("Ingrese el número de identificación");
		newUser.setId(scanner.nextInt());
		scanner.nextLine();
		System.out.println("Ingrese el nombre");
		newUser.setName(scanner.nextLine());

		try (FileWriter fw = new FileWriter("users.txt", true); PrintWriter pw = new PrintWriter(fw)) {

			pw.println(newUser.getId() + "," + newUser.getName() + "," + newUser.getStatus() + ","
					+ newUser.getIsInDebt() + "," + newUser.getRole());

			System.out.println("Usuario guardado correctamente en archivo.");

		} catch (IOException e) {
			System.out.println("Error al guardar el usuario.");
			e.printStackTrace();
		}
	}

	public static void listUsers() {

	    try (BufferedReader br = new BufferedReader(new FileReader("users.txt"))) {

	        String line;

	        System.out.println("\n==================== LISTA DE USUARIOS ====================");
	        System.out.println("");

	        // Encabezado
	        System.out.printf("%-10s %-20s %-12s %-10s %-12s%n",
	                "ID", "NOMBRE", "STATUS", "DEUDA", "ROL");

	        System.out.println("------------------------------------------------------------");

	        while ((line = br.readLine()) != null) {

	            String[] data = line.split(",");

	            System.out.printf("%-10s %-20s %-12s %-10s %-12s%n",
	                    data[0],  // id
	                    data[1],  // nombre
	                    data[2],  // status
	                    data[3],  // deuda
	                    data[4]   // rol
	            );
	        }

	        System.out.println("============================================================\n");

	    } catch (IOException e) {
	        System.out.println("No hay usuarios registrados o ocurrió un error.");
	    }
	}
}
