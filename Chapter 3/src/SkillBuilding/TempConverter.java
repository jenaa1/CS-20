package SkillBuilding;

import java.util.Scanner;

public class TempConverter {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a temperature in Fahrenheit: ");
		double fahrenheit = input.nextDouble();
		
		double celsius =( 5 *(fahrenheit - 32.0));
		System.out.println("The temperature: " + fahrenheit "°F is equal to" + celsius + "°C");

	}

}
