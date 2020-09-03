package dev.yashgupta.eulerproject;

public class SumSquareDiff {
	public static void main( String[] args ) {
		int sumOfSquares = 0;
		int sum = 0;
		for ( int i = 1; i <= 100; i++ ) {
			sumOfSquares += i * i;
			sum += i;
		}

		System.out.println( "Square of Sum - Sum of Squares : " + ( sum * sum - sumOfSquares ) );
	}
}
