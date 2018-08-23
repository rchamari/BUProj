package com.cg.gs.beans;

import java.util.*;

public class DaySummary {
	Day d;
	Map<Game, List<Player>> summ = new HashMap<Game, List<Player>>();
	
	public Day getD() {
		return d;
	}

	public void setD(Day d) {
		this.d = d;
	}
	
	public void addSumm(Game g, List<Player> ls) {
		summ.put(g, ls);
	}

	@Override
	public String toString() {
		return "DaySummary [d=" + d + ", summ=" + summ + "]";
	}

}
