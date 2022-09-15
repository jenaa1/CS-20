/*
 CH3 DistanceP2
 Jena A. September 15 22
 */
package SkillBuilding;
import java.text.DecimalFormat;
import java.util.Scanner;

public class DistanceP2 {

	public static void main(String[] args) {
		
		int num1,num2,num3,result;
		Scanner input = new Scanner(System.in);
		DecimalFormat dc = new DecimalFormat("0.00");
		
		System.out.println("Enter distance of race 1");
		num1 = input.nextInt();
		
		System.out.println("Enter distance of race 2");
		num2 = input.nextInt();
		
		System.out.println("Enter distance of race 3");
		num3 = input.nextInt();
		input.close();
		
		result = num1 + num2 + num3;
		
		System.out.println("The total race distance in km is:" + dc.format(result));
		
	}

}
