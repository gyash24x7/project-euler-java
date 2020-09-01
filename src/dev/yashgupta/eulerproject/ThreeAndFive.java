package dev.yashgupta.eulerproject;

import java.util.ArrayList;

public class ThreeAndFive {

	public static void main( String[] args ) {
		int n = 1000;
		int sum = 0;
		ArrayList< Integer > numbers = new ArrayList<>();

		for ( int i = 1; i < n; i++ ) {
			if ( i % 3 == 0 || i % 5 == 0 ) {
				sum += i;
				numbers.add( i );
			}
		}

		for ( int x : numbers ) {
			System.out.print( x + ", " );
		}
		System.out.println( "\nSum: " + sum );
	}
}
