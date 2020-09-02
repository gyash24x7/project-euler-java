package dev.yashgupta.eulerproject;

import java.util.Scanner;

public class LargestPrimeFactor {
	public static void main( String[] args ) {
		Scanner sc = new Scanner( System.in );
		System.out.print( "Enter the number: " );
		long n = sc.nextLong();

		System.out.println( "Largest Prime Factor: " + getLargestPrimeFactor( n ) );
	}

	public static long getLargestPrimeFactor( long n ) {
		while ( n % 2 == 0 ) {
			n /= 2;
		}

		for ( int i = 3; i < n; i += 2 ) {
			if ( n % i == 0 ) {
				n /= i;
			}
		}

		return n;
	}
}
