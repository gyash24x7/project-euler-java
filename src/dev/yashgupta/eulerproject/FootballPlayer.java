package dev.yashgupta.eulerproject;

public class FootballPlayer extends Player implements Member {
	public FootballPlayer( String name ) {
		super( name );
	}

	@Override
	public void printName() {
		System.out.println( "Player Name: " + this.name );
	}
}
