package dev.yashgupta.eulerproject;

public class CricketPlayer extends Player implements Member {
	public CricketPlayer( String name ) {
		super( name );
	}

	@Override
	public void printName() {
		System.out.println( "Player Name: " + this.name );
	}
}
