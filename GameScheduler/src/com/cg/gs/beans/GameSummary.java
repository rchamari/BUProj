package com.cg.gs.beans;

import java.util.*;

public class GameSummary {

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	Game game;
	List<Player> players = new ArrayList<Player>();
	List<Day> days = new ArrayList<Day>();

	public void setGame(Game game) {
		this.game = game;
	}
	
	public void addPlayer(Player p) {
		players.add(p);
	}

	public void addDay(Day d) {
		days.add(d);
	}
	
	public boolean hasPlayer(Player p) {
		for(Player pi:players) {
			if(pi.getName() == p.getName())
				return true;
		}
		return false;
	}
	
	public boolean hasDay(Day d) {
		for(Day di:days) {
			if(di.getName() == d.getName())
				return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "GameSummary [game=" + game + ", players=" + players + ", days=" + days + "]";
	}

	public List<Day> getDays() {
		return days;
	}

	public void setDays(List<Day> days) {
		this.days = days;
	}

}
