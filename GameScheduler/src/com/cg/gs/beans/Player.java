package com.cg.gs.beans;

import java.util.*;

public class Player {
	
	String name;
	List<Game> games = new ArrayList<Game>();
	
	public Player(String name, List<Game> games) {
		this.name = name;
		this.games = games;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Game> getGames() {
		return games;
	}
	public void setGames(List<Game> games) {
		this.games = games;
	}
	public boolean playsGame(Game g) {
		for(Game gi:games) {
			if(gi.getName() == g.getName())
				return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Player [name=" + name + "]";
	}

}
