package com.cg.gs.beans;

import java.util.*;

public class Day {

	String name;
	List<Game> games = new ArrayList<Game>();
	
	public Day(String name, List<Game> games) {
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
	public boolean hasGame(Game g) {
		for(Game gi:games) {
			if(gi.getName() == g.getName())
				return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Day [name=" + name + "]";
	}

}
