package dev.yashgupta.eulerproject;

public class SumOfPrimes {
	public static void main( String[] args ) {
		int n = 2_000_000;
		long sum = 2;

		for ( int i = 3; i < n; i += 2 ) {
			if ( isPrime( i ) ) {
				sum += i;
			}
		}

		System.out.println( "Sum of Primes: " + sum );
	}

	public static boolean isPrime( int n ) {
		for ( int i = 2; i < ( int ) Math.sqrt( n ) + 1; i++ ) {
			if ( n % i == 0 ) {
				return false;
			}
		}
		return true;
	}
}
