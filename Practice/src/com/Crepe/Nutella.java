package com.Crepe;

import java.util.Scanner;

public class Nutella {

	static double costNutella = .50;

	static double nutellaBase = 1;

	public static double totalNutella;

	public static int nutellaScoops = 0;
	static double extraNutellaScoops;

	public static void extraNutella() {

		Scanner moreNutella = new Scanner(System.in);

		System.out.println("Would you like to add nutella for extra $1.00 ?");
		String extraNutella = moreNutella.nextLine();
		if (extraNutella.equalsIgnoreCase("yes")) {
			totalNutella = nutellaBase;

			System.out.println("How many extra scoops of nuttella would you like?");
			nutellaScoops = moreNutella.nextInt();

			// extraNutellaScoops=(nutellaScoops*costNutella);
		}

		if (extraNutella.equals("yes")) {
			double n = (nutellaBase + extraNutellaScoops) - costNutella;
		} else if (extraNutella.equals("no")) {
			totalNutella = 0;
		}

	}

}
