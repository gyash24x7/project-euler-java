package dev.yashgupta.eulerproject;

public class PythagoreanTriplet {
	public static void main( String[] args ) {
		int i = 1;
		int n = 1000;
		int j = 1;
		int k = n - i - j;

		outer:
		for ( i = 1; i <= n / 3; i++ ) {
			for ( j = i + 1; j <= n / 2; j++ ) {
				k = n - i - j;
				if ( i * i + j * j == k * k ) {
					break outer;
				}
			}
		}

		System.out.println( "a: " + i + ", b: " + j + ", c: " + k + "\tProduct: " + i * j * k );
	}

}
