package dev.yashgupta.eulerproject;

import java.util.Scanner;

public class LargestProductSeries {
	public static void main( String[] args ) {
		Scanner sc = new Scanner( System.in );
		System.out.print( "Enter the large number: " );
		String n = sc.nextLine();

		long product = 1;
		for ( int i = 0; i < n.length() - 13; i++ ) {
			long prod = 1;
			for ( int j = i; j < i + 13; j++ ) {
				prod *= ( ( int ) n.charAt( j ) - 48 );
			}
			if ( prod > product ) {
				product = prod;
			}
		}

		System.out.println( "Largest 13 digit product: " + product );
	}
}
