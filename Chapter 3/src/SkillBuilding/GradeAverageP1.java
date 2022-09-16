package SkillBuilding;

import java.util.Scanner;

public class GradeAverageP1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);	
		int num6 = 5;
		
		System.out.println("Enter first grade: ");
		int num1 = input.nextInt();
		
		System.out.println("Enter second grade: ");
		int num2 = input.nextInt();
		
		System.out.println("Enter third grade: ");
		int num3 = input.nextInt();
		
		System.out.println("Enter fourth grade: ");
		int num4 = input.nextInt();
		
		System.out.println("Enter fifth grade: ");
		int num5 = input.nextInt();
		input.close();
		
		int result = num1 + num2 + num3 + num4 + num5;
		
		
		System.out.println("Your grade average is: " + result / num6 + "%");
		

	}

}
