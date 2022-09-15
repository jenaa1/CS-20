/*
 CH3 Digits
 Jena A. September 15 22
 */

package SkillBuilding;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n,j,y;
		
		System.out.println("Enter a 2 digit number.");
		n =sc.nextInt();
		
		j=n%10;
		y=n%100/10;
		sc.close();
		
		System.out.println("The ones place is:" +j);
		System.out.println("The tens place is:" +y);
	}

}
