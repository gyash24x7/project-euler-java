package dev.yashgupta.eulerproject;

import java.util.ArrayList;

public class Team< T extends Player & Member > {
	private ArrayList< T > members;

	public Team( ArrayList< T > members ) {
		this.members = members;
	}

	public ArrayList< T > getMembers() {
		return members;
	}

	public void setMembers( ArrayList< T > members ) {
		this.members = members;
	}

	public void addPlayer( T player ) {
		boolean playerExists = this.members.indexOf( player ) >= 0;
		if ( playerExists ) {
			System.out.println( "Player Already Exists! Skipping." );
		} else {
			this.members.add( player );
			System.out.println( "Player added!" );
		}
	}
}
