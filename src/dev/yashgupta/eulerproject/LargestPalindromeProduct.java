package dev.yashgupta.eulerproject;

public class LargestPalindromeProduct {
	public static void main( String[] args ) {
		int palProduct = 100 * 100;
		for ( int i = 100; i < 1000; i++ ) {
			for ( int j = 100; j < 1000; j++ ) {
				if ( isPalindrome( i * j ) && i * j > palProduct ) {
					palProduct = i * j;
				}
			}
		}

		System.out.println( "Largest Palindrome from Product of 3 digit numbers: " + palProduct );
	}

	static boolean isPalindrome( int n ) {
		String s = Integer.toString( n );
		String s2 = "";
		for ( char c : s.toCharArray() ) {
			s2 = Character.toString( c ).concat( s2 );
		}

		return s2.compareTo( s ) == 0;
	}

}
