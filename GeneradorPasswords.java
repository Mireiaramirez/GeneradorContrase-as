package generadorPasswords;

import java.util.Scanner;

public class GeneradorPasswords {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Dime la medida de la contraseña: ");

		int mida = sc.nextInt();

		sc.nextLine();

		String alfabeto = "abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ1234567890!@#$%&*,(){}[]=<>";

		int n = alfabeto.length() + 1;

		String contraseña = "";

		for (int i = 0; i <= mida; i++) {

			int numero = (int) (Math.random() * n);
			char random = alfabeto.charAt(numero);

			contraseña += random;

			if (contraseña.length() == mida) {
				System.out.println("Tu contraseña es :" + contraseña);
			}

		}

	}

}
