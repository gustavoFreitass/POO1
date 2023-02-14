package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle rec = new Rectangle();

		System.out
				.println("Digite dois lados de um retângulo para se descobrir a área, o perímetro e a sua diagonal: ");
		rec.width = sc.nextDouble();
		rec.heigth = sc.nextDouble();

		System.out.printf("AREA: %.2f%n", rec.area());
		System.out.printf("PERIMETER: %.2f%n", rec.perimeter());
		System.out.printf("DIAGONAL: %.2f%n", rec.diagonal());

		sc.close();
	}

}
