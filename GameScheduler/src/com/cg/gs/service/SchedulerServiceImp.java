package com.cg.gs.service;

import com.cg.gs.beans.*;
import com.cg.gs.dao.SchedulerDAO;
import com.cg.gs.dao.SchedulerDAOImp;

public class SchedulerServiceImp implements SchedulerService {
	SchedulerDAO scd = new SchedulerDAOImp();
	
	public Player addPlayer(Player p) {
		scd.addPlayer(p);
		return p;
	}
	public Game addGame(Game g) {
		scd.addGame(g);
		return g;
	}
	public Day addDay(Day d) {
		scd.addDay(d);
		return d;
	}
	public PlayerSummary findPlayerInfo(String name) {
		return scd.findPlayerInfo(name);
	}
	public DaySummary findDayInfo(String name) {
		return scd.findDayInfo(name);
	}
	public GameSummary findGameInfo(String name) {
		return scd.findGameInfo(name);
	}
}
