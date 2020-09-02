package dev.yashgupta.eulerproject;

public class SmallestMultiple {
	public static void main( String[] args ) {
		int inc = 2 * 3 * 5 * 7 * 11 * 13 * 17 * 19;
		int i = inc;
		while ( true ) {
			if ( isDivisible( i ) ) {
				break;
			}
			i += inc;
		}

		System.out.println( "Smallest Multiple divisible by all numbers from 1-20: " + i );
	}

	public static boolean isDivisible( int n ) {
		for ( int i = 1; i <= 20; i++ ) {
			if ( n % i != 0 ) {
				return false;
			}
		}
		return true;
	}
}
