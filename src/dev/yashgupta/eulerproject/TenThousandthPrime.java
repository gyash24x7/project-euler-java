package dev.yashgupta.eulerproject;

public class TenThousandthPrime {
	public static void main( String[] args ) {
		int i = 1;
		int primeCount = 1;
		while ( primeCount < 10001 ) {
			i += 2;
			if ( isPrime( i ) ) {
				primeCount++;
			}
		}

		System.out.println( "10001 prime is: " + i );
	}

	public static boolean isPrime( int n ) {
		for ( int i = 2; i < n / 2; i++ ) {
			if ( n % i == 0 ) {
				return false;
			}
		}
		return true;
	}
}
