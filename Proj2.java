/**
 * <Proj2.java>
 * < Preston Rottinghaus / Section: 02B/ Day: Thursday/ Time: 3:30-5:20pm>
 * "EXTRA CREDIT INCLUEDED"
 * <The program is designed to take the users input of gross income.
 *  Remove standard tax deduction and output taxable income.
 *  Then calculate what tax bracket the user is in and calculate what they owe in taxes. 
 *  Finally it prints out taxable income, what they owe in taxes and effective tax rate>
 */

import java.util.Scanner;
import java.text.DecimalFormat;
public class Proj2 {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		final int SING = 13850;
		final int MARSEP = 13850;
		final int MARJOINT = 27700;
		final int HOH = 20800;
		int filStat;
		char closer = 'Y';
		double effectTaxRatio;
		double tax;
		double totTax = 0.0;
		int grossInc;
		double taxInc = 0.0;
		double[] taxPer = { 0.37 , 0.35 , 0.32, 0.24, 0.22, 0.12, 0.1};
		int[] taxBrakSing = {578125, 231250, 182100, 95375, 44725, 11000, 0};
		int[] taxBrakMar = {693750, 462500, 364200, 190750, 89450, 22000, 0};
		int[] taxBrakHoh = {578100, 231250, 182100, 95350, 59850, 15700, 0};
		
		
		while((closer == 'Y')||(closer == 'y')) {
			totTax = 0.0;
			grossInc = 0;
			tax = 0.0;
			System.out.println("Choose a filing status:");
				System.out.println("\t(1) Single");
				System.out.println("\t(2) Head of household");
				System.out.println("\t(3) Married filing jointly");
				System.out.println("\t(4) Married filing separately");
			System.out.print("Enter an option, 1-4:");
			filStat = scnr.nextInt();
			while(!(filStat>0 && filStat<=4)) {
				System.out.println("**Invalid value entered. Enter 1-4 only.");
				System.out.print("Enter an option, 1-4:");
				filStat = scnr.nextInt();
			}
			System.out.print("Enter your gross income from 2023: ");
			grossInc = scnr.nextInt();
			System.out.println();
			if((filStat == 1)) {
				taxInc = grossInc - SING;
				if(taxInc>taxBrakSing[0]) {
					tax = taxPer[0] * (taxInc - taxBrakSing[0]); 
					totTax = totTax + tax;
					tax = taxPer[1] * (taxBrakSing[0] -taxBrakSing[1]);
					totTax = totTax + tax;
					tax = taxPer[2] * (taxBrakSing[1] - taxBrakSing[2]);
					totTax = totTax + tax;
					tax = taxPer[3] * (taxBrakSing[2] - taxBrakSing[3]);
					totTax = totTax + tax;
					tax = taxPer[4] * (taxBrakSing[3] - taxBrakSing[4]);
					totTax = totTax + tax;
					tax = taxPer[5] * (taxBrakSing[4] - taxBrakSing[5]);
					totTax = totTax + tax;
					tax = taxPer[6] * (taxBrakSing[5] - taxBrakSing[6]);
					totTax = totTax + tax;
				}
				else if (taxInc>taxBrakSing[1] && taxInc<=taxBrakSing[0]) {
					tax = taxPer[1] * (taxInc - taxBrakSing[1]); 
					totTax = totTax + tax;
					tax = taxPer[2] * (taxBrakSing[1] - taxBrakSing[2]);
					totTax = totTax + tax;
					tax = taxPer[3] * (taxBrakSing[2] - taxBrakSing[3]);
					totTax = totTax + tax;
					tax = taxPer[4] * (taxBrakSing[3] - taxBrakSing[4]);
					totTax = totTax + tax;
					tax = taxPer[5] * (taxBrakSing[4] - taxBrakSing[5]);
					totTax = totTax + tax;
					tax = taxPer[6] * (taxBrakSing[5] - taxBrakSing[6]);
					totTax = totTax + tax;
				}
				else if ( taxInc>taxBrakSing[2] && taxInc<=taxBrakSing[1]) {
					tax = taxPer[2] * (taxInc - taxBrakSing[2]);
					totTax = totTax + tax;
					tax = taxPer[3] * (taxBrakSing[2] - taxBrakSing[3]);
					totTax = totTax + tax;
					tax = taxPer[4] * (taxBrakSing[3] - taxBrakSing[4]);
					totTax = totTax + tax;
					tax = taxPer[5] * (taxBrakSing[4] - taxBrakSing[5]);
					totTax = totTax + tax;
					tax = taxPer[6] * (taxBrakSing[5] - taxBrakSing[6]);
					totTax = totTax + tax;
				}
				else if ( taxInc>taxBrakSing[3] && taxInc<=taxBrakSing[2]) {
					tax = taxPer[3] * (taxInc - taxBrakSing[3]);
					totTax = totTax + tax;
					tax = taxPer[4] * (taxBrakSing[3] - taxBrakSing[4]);
					totTax = totTax + tax;
					tax = taxPer[5] * (taxBrakSing[4] - taxBrakSing[5]);
					totTax = totTax + tax;
					tax = taxPer[6] * (taxBrakSing[5] - taxBrakSing[6]);
					totTax = totTax + tax;
				}
				else if ( taxInc>taxBrakSing[4] && taxInc<=taxBrakSing[3]) {
					tax = taxPer[4] * (taxInc - taxBrakSing[4]);
					totTax = totTax + tax;
					tax = taxPer[5] * (taxBrakSing[4] - taxBrakSing[5]);
					totTax = totTax + tax;
					tax = taxPer[6] * (taxBrakSing[5] - taxBrakSing[6]);
					totTax = totTax + tax;
				}
				else if ( taxInc>taxBrakSing[5] && taxInc<=taxBrakSing[4]) {
					tax = taxPer[5] * (taxInc - taxBrakSing[5]);
					totTax = totTax + tax;
					tax = taxPer[6] * (taxBrakSing[5] - taxBrakSing[6]);
					totTax = totTax + tax;
				}
				else if (taxInc>taxBrakSing[6] && taxInc<=taxBrakSing[5]) {
					tax = taxPer[6] * taxInc;
				}
				else {
					taxInc = grossInc - SING;
				}
			}
			
			else if(filStat == 2) {
				taxInc = grossInc - HOH;
				if(taxInc>taxBrakHoh[0]) {
					tax = taxPer[0] * (taxInc - taxBrakHoh[0]); 
					totTax = totTax + tax;
					tax = taxPer[1] * (taxBrakHoh[0] -taxBrakHoh[1]);
					totTax = totTax + tax;
					tax = taxPer[2] * (taxBrakHoh[1] - taxBrakHoh[2]);
					totTax = totTax + tax;
					tax = taxPer[3] * (taxBrakHoh[2] - taxBrakHoh[3]);
					totTax = totTax + tax;
					tax = taxPer[4] * (taxBrakHoh[3] - taxBrakHoh[4]);
					totTax = totTax + tax;
					tax = taxPer[5] * (taxBrakHoh[4] - taxBrakHoh[5]);
					totTax = totTax + tax;
					tax = taxPer[6] * (taxBrakHoh[5] - taxBrakHoh[6]);
					totTax = totTax + tax;
				}
				else if (taxInc>taxBrakHoh[1] && taxInc<=taxBrakHoh[0]) {
					tax = taxPer[1] * (taxInc - taxBrakHoh[1]); 
					totTax = totTax + tax;
					tax = taxPer[2] * (taxBrakHoh[1] - taxBrakHoh[2]);
					totTax = totTax + tax;
					tax = taxPer[3] * (taxBrakHoh[2] - taxBrakHoh[3]);
					totTax = totTax + tax;
					tax = taxPer[4] * (taxBrakHoh[3] - taxBrakHoh[4]);
					totTax = totTax + tax;
					tax = taxPer[5] * (taxBrakHoh[4] - taxBrakHoh[5]);
					totTax = totTax + tax;
					tax = taxPer[6] * (taxBrakHoh[5] - taxBrakHoh[6]);
					totTax = totTax + tax;
				}
				else if ( taxInc>taxBrakHoh[2] && taxInc<=taxBrakHoh[1]) {
					tax = taxPer[2] * (taxInc - taxBrakHoh[2]);
					totTax = totTax + tax;
					tax = taxPer[3] * (taxBrakHoh[2] - taxBrakHoh[3]);
					totTax = totTax + tax;
					tax = taxPer[4] * (taxBrakHoh[3] - taxBrakHoh[4]);
					totTax = totTax + tax;
					tax = taxPer[5] * (taxBrakHoh[4] - taxBrakHoh[5]);
					totTax = totTax + tax;
					tax = taxPer[6] * (taxBrakHoh[5] - taxBrakHoh[6]);
					totTax = totTax + tax;
				}
				else if ( taxInc>taxBrakHoh[3] && taxInc<=taxBrakHoh[2]) {
					tax = taxPer[3] * (taxInc - taxBrakSing[3]);
					totTax = totTax + tax;
					tax = taxPer[4] * (taxBrakHoh[3] - taxBrakHoh[4]);
					totTax = totTax + tax;
					tax = taxPer[5] * (taxBrakHoh[4] - taxBrakHoh[5]);
					totTax = totTax + tax;
					tax = taxPer[6] * (taxBrakHoh[5] - taxBrakHoh[6]);
					totTax = totTax + tax;
				}
				else if ( taxInc>taxBrakHoh[4] && taxInc<=taxBrakHoh[3]) {
					tax = taxPer[4] * (taxInc - taxBrakHoh[4]);
					totTax = totTax + tax;
					tax = taxPer[5] * (taxBrakHoh[4] - taxBrakHoh[5]);
					totTax = totTax + tax;
					tax = taxPer[6] * (taxBrakHoh[5] - taxBrakHoh[6]);
					totTax = totTax + tax;
				}
				else if ( taxInc>taxBrakHoh[5] && taxInc<=taxBrakHoh[4]) {
					tax = taxPer[5] * (taxInc - taxBrakHoh[5]);
					totTax = totTax + tax;
					tax = taxPer[6] * (taxBrakHoh[5] - taxBrakHoh[6]);
					totTax = totTax + tax;
				}
				else if (taxInc>taxBrakHoh[6] && taxInc<=taxBrakHoh[5]) {
					tax = taxPer[6] * taxInc;
					totTax = totTax + tax;
				}
				else {
					taxInc = grossInc - HOH ;
				}
			
			}
			else if(filStat == 3) {
				taxInc = grossInc - MARJOINT;
				if(taxInc > taxBrakMar[0]) {
					tax = taxPer[0] * (taxInc - taxBrakMar[0]);
					totTax = totTax + tax;
					tax = taxPer[1] * (taxBrakMar[0] - taxBrakMar[1]);
					totTax = totTax + tax;
					tax = taxPer[2] * (taxBrakMar[1] - taxBrakMar[2]);
					totTax = totTax + tax;
					tax = taxPer[3] * (taxBrakMar[2] - taxBrakMar[3]);
					totTax = totTax + tax;
					tax = taxPer[4] * (taxBrakMar[3] - taxBrakMar[4]);
					totTax = totTax + tax;
					tax = taxPer[5] * (taxBrakMar[4] - taxBrakMar[5]);
					totTax = totTax + tax;
					tax = taxPer[6] * (taxBrakMar[5] - taxBrakMar[6]);
					totTax =totTax + tax;
			}
				else if( taxInc> taxBrakMar[1] && taxInc<taxBrakMar[0]) {
					tax = taxPer[1] * (taxInc - taxBrakMar[1]);
					totTax = totTax + tax;
					tax = taxPer[2] * (taxBrakMar[1] - taxBrakMar[2]);
					totTax = totTax + tax;
					tax = taxPer[3] * (taxBrakMar[2] - taxBrakMar[3]);
					totTax = totTax + tax;
					tax = taxPer[4] * (taxBrakMar[3] - taxBrakMar[4]);
					totTax = totTax + tax;
					tax = taxPer[5] * (taxBrakMar[4] - taxBrakMar[5]);
					totTax = totTax + tax;
					tax = taxPer[6] * (taxBrakMar[5] - taxBrakMar[6]);
					totTax =totTax + tax;
				}
				else if ( taxInc > taxBrakMar[2] && taxInc< taxBrakMar[1]) {
					tax = taxPer[2] * (taxInc - taxBrakMar[2]);
					totTax = totTax + tax;
					tax = taxPer[3] * (taxBrakMar[2] - taxBrakMar[3]);
					totTax = totTax + tax;
					tax = taxPer[4] * (taxBrakMar[3] - taxBrakMar[4]);
					totTax = totTax + tax;
					tax = taxPer[5] * (taxBrakMar[4] - taxBrakMar[5]);
					totTax = totTax + tax;
					tax = taxPer[6] * (taxBrakMar[5] - taxBrakMar[6]);
					totTax =totTax + tax;
				}
				else if ( taxInc > taxBrakMar[3] && taxInc< taxBrakMar[2]) {
					tax = taxPer[3] * (taxInc - taxBrakMar[3]);
					totTax = totTax + tax;
					tax = taxPer[4] * (taxBrakMar[3] - taxBrakMar[4]);
					totTax = totTax + tax;
					tax = taxPer[5] * (taxBrakMar[4] - taxBrakMar[5]);
					totTax = totTax + tax;
					tax = taxPer[6] * (taxBrakMar[5] - taxBrakMar[6]);
					totTax =totTax + tax;
				}
				else if ( taxInc > taxBrakMar[4] && taxInc< taxBrakMar[3]) {
					tax = taxPer[4] * (taxInc - taxBrakMar[4]);
					totTax = totTax + tax;
					tax = taxPer[5] * (taxBrakMar[4] - taxBrakMar[5]);
					totTax = totTax + tax;
					tax = taxPer[6] * (taxBrakMar[5] - taxBrakMar[6]);
					totTax =totTax + tax;
				}
				else if ( taxInc > taxBrakMar[5] && taxInc< taxBrakMar[4]) {
					tax = taxPer[5] * (taxInc - taxBrakMar[5]);
					totTax = totTax + tax;
					tax = taxPer[6] * (taxBrakMar[5] - taxBrakMar[6]);
					totTax =totTax + tax;
				}
				else if ( taxInc > taxBrakMar[6] && taxInc< taxBrakMar[5]) {
					tax = taxPer[6] * taxInc ;
					totTax = totTax + tax;
				}
				else {
					taxInc = grossInc - MARJOINT;
					
				}
			}
			else if((filStat ==4)) {
				taxInc = grossInc - MARSEP;
				if(taxInc>taxBrakSing[0]) {
					tax = taxPer[0] * (taxInc - taxBrakSing[0]); 
					totTax = totTax + tax;
					tax = taxPer[1] * (taxBrakSing[0] -taxBrakSing[1]);
					totTax = totTax + tax;
					tax = taxPer[2] * (taxBrakSing[1] - taxBrakSing[2]);
					totTax = totTax + tax;
					tax = taxPer[3] * (taxBrakSing[2] - taxBrakSing[3]);
					totTax = totTax + tax;
					tax = taxPer[4] * (taxBrakSing[3] - taxBrakSing[4]);
					totTax = totTax + tax;
					tax = taxPer[5] * (taxBrakSing[4] - taxBrakSing[5]);
					totTax = totTax + tax;
					tax = taxPer[6] * (taxBrakSing[5] - taxBrakSing[6]);
					totTax = totTax + tax;
				}
				else if (taxInc>taxBrakSing[1] && taxInc<=taxBrakSing[0]) {
					tax = taxPer[1] * (taxInc - taxBrakSing[1]); 
					totTax = totTax + tax;
					tax = taxPer[2] * (taxBrakSing[1] - taxBrakSing[2]);
					totTax = totTax + tax;
					tax = taxPer[3] * (taxBrakSing[2] - taxBrakSing[3]);
					totTax = totTax + tax;
					tax = taxPer[4] * (taxBrakSing[3] - taxBrakSing[4]);
					totTax = totTax + tax;
					tax = taxPer[5] * (taxBrakSing[4] - taxBrakSing[5]);
					totTax = totTax + tax;
					tax = taxPer[6] * (taxBrakSing[5] - taxBrakSing[6]);
					totTax = totTax + tax;
				}
				else if ( taxInc>taxBrakSing[2] && taxInc<=taxBrakSing[1]) {
					tax = taxPer[2] * (taxInc - taxBrakSing[2]);
					totTax = totTax + tax;
					tax = taxPer[3] * (taxBrakSing[2] - taxBrakSing[3]);
					totTax = totTax + tax;
					tax = taxPer[4] * (taxBrakSing[3] - taxBrakSing[4]);
					totTax = totTax + tax;
					tax = taxPer[5] * (taxBrakSing[4] - taxBrakSing[5]);
					totTax = totTax + tax;
					tax = taxPer[6] * (taxBrakSing[5] - taxBrakSing[6]);
					totTax = totTax + tax;
				}
				else if ( taxInc>taxBrakSing[3] && taxInc<=taxBrakSing[2]) {
					tax = taxPer[3] * (taxInc - taxBrakSing[3]);
					totTax = totTax + tax;
					tax = taxPer[4] * (taxBrakSing[3] - taxBrakSing[4]);
					totTax = totTax + tax;
					tax = taxPer[5] * (taxBrakSing[4] - taxBrakSing[5]);
					totTax = totTax + tax;
					tax = taxPer[6] * (taxBrakSing[5] - taxBrakSing[6]);
					totTax = totTax + tax;
				}
				else if ( taxInc>taxBrakSing[4] && taxInc<=taxBrakSing[3]) {
					tax = taxPer[4] * (taxInc - taxBrakSing[4]);
					totTax = totTax + tax;
					tax = taxPer[5] * (taxBrakSing[4] - taxBrakSing[5]);
					totTax = totTax + tax;
					tax = taxPer[6] * (taxBrakSing[5] - taxBrakSing[6]);
					totTax = totTax + tax;
				}
				else if ( taxInc>taxBrakSing[5] && taxInc<=taxBrakSing[4]) {
					tax = taxPer[5] * (taxInc - taxBrakSing[5]);
					totTax = totTax + tax;
					tax = taxPer[6] * (taxBrakSing[5] - taxBrakSing[6]);
					totTax = totTax + tax;
				}
				else if (taxInc>taxBrakSing[6] && taxInc<=taxBrakSing[5]) {
					tax = taxPer[6] * taxInc;
				}
				else {
					taxInc = grossInc - MARSEP;
				}
			}
			DecimalFormat dollarFormat;
			dollarFormat = new DecimalFormat("$###,###,###");
			System.out.println("Your taxable income for 2023: " + dollarFormat.format(taxInc));
			System.out.println("Taxes owed: " + dollarFormat.format(totTax));
			effectTaxRatio = (totTax / taxInc) * 100;
			if(totTax != 0) {
			System.out.printf("Your Effective Tax Rate is %.2f%%",effectTaxRatio);
			System.out.println();
			}
			else {
				
			}
			
			System.out.print("Do you wish to run again: ");
			closer = scnr.next().charAt(0);
			
		}
		scnr.close();
		}
		
		
	}


