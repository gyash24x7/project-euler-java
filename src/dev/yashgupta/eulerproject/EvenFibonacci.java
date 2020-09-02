package dev.yashgupta.eulerproject;

public class EvenFibonacci {
	public static void main( String[] args ) {
		int x = 1;
		int y = 2;
		int z = 0;
		int sum = 2;
		while ( z < 4_000_000 ) {
			z = x + y;
			x = y;
			y = z;
			if ( z % 2 == 0 ) {
				sum += z;
			}
		}

		System.out.println( "Sum: " + sum );
	}
}
