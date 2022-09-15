/*
 CH3 DistanceP1
 Jena A. September 14 22
 */package SkillBuilding;

import java.text.DecimalFormat;

public class DistanceP1 {

	public static void main(String[] args) 
	{
		DecimalFormat dc = new DecimalFormat("0.00");
		double r = 12.2;
		double t = 10.6;
		double u = 5.8;
		
		
		System.out.println("The total distance in km is:" + dc.format((r + t + u)));
			
	
	}

}
