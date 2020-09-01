package dev.yashgupta.eulerproject;

import java.util.ArrayList;

public class Main {
	public static void main( String[] args ) {
		ArrayList< CricketPlayer > cricketPlayers = new ArrayList<>();
		ArrayList< FootballPlayer > footballPlayers = new ArrayList<>();
		Team< CricketPlayer > cricketPlayerTeam = new Team< CricketPlayer >( cricketPlayers );
	}
}
