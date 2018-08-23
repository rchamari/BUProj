package com.cg.gs.beans;

import java.util.*;

public class PlayerSummary {
	Player name;
	Map<Game, List<Day>> summ = new HashMap<Game, List<Day>>();

	public Player getName() {
		return name;
	}

	public void setName(Player name) {
		this.name = name;
	}
	
	public void addSumm(Game g, List<Day> ls) {
		summ.put(g, ls);
	}
	
	@Override
	public String toString() {
		return "PlayerSummary [name=" + name + ", summ=" + summ + "]";
	}

}
