package com.cg.gs.dao;

import java.util.*;
import com.cg.gs.beans.*;


public class SchedulerDAOImp implements SchedulerDAO {
	Map<Day, DaySummary> days = new HashMap<Day, DaySummary>();
	Map<Game, GameSummary> games = new HashMap<Game, GameSummary>();
	Map<Player, PlayerSummary> players = new HashMap<Player, PlayerSummary>();
	
	public SchedulerDAOImp() {
		addGame(new Game("Cricket"));
		addGame(new Game("Football"));
		addGame(new Game("Basketball"));
		
		List<Game> gmls = new ArrayList<Game>();
		
		gmls.add(new Game("Cricket"));
		gmls.add(new Game("Football"));
		gmls.add(new Game("Basketball"));
		addPlayer(new Player("Raju", gmls));
		gmls.clear();
		
		gmls.add(new Game("Cricket"));
		gmls.add(new Game("Football"));
		addPlayer(new Player("Milaan", gmls));
		gmls.clear();
		
		gmls.add(new Game("Football"));
		gmls.add(new Game("Basketball"));
		addPlayer(new Player("Srishti", gmls));
		gmls.clear();
		
		gmls.add(new Game("Cricket"));
		gmls.add(new Game("Basketball"));
		addDay(new Day("Day1", gmls));
		gmls.clear();
		
		gmls.add(new Game("Cricket"));
		gmls.add(new Game("Football"));
		gmls.add(new Game("Basketball"));
		addDay(new Day("Day2", gmls));
		gmls.clear();
		
		gmls.add(new Game("Basketball"));
		addDay(new Day("Day3", gmls));
		gmls.clear();
	}
	
	/* (non-Javadoc)
	 * @see com.cg.gs.dao.SchedulerDAO#addPlayer(com.cg.gs.beans.Player)
	 */
	@Override
	public Player addPlayer(Player p) {
		PlayerSummary ps = new PlayerSummary();
		ps.setName(p);
		for(Map.Entry<Game, GameSummary> entry : games.entrySet()) {
			if(entry.getValue().hasPlayer(p))
				ps.addSumm(entry.getKey(), entry.getValue().getDays());
		}
		players.put(p, ps);
		return p;
	}
	/* (non-Javadoc)
	 * @see com.cg.gs.dao.SchedulerDAO#addGame(com.cg.gs.beans.Game)
	 */
	@Override
	public Game addGame(Game g) {
		GameSummary gs = new GameSummary();
		gs.setGame(g);
		for(Map.Entry<Player, PlayerSummary> entry : players.entrySet()) {
			if(entry.getKey().playsGame(g))
				gs.addPlayer(entry.getKey());
		}
		for(Map.Entry<Day, DaySummary> entry : days.entrySet()) {
			if(entry.getKey().hasGame(g))
				gs.addDay(entry.getKey());
		}
		games.put(g, gs);
		return g;
	}
	/* (non-Javadoc)
	 * @see com.cg.gs.dao.SchedulerDAO#addDay(com.cg.gs.beans.Day)
	 */
	@Override
	public Day addDay(Day d) {
		DaySummary ds = new DaySummary();
		ds.setD(d);
		for(Map.Entry<Game, GameSummary> entry : games.entrySet()) {
			if(entry.getValue().hasDay(d))
				ds.addSumm(entry.getKey(), entry.getValue().getPlayers());
		}
		days.put(d, ds);
		return d;
	}
	/* (non-Javadoc)
	 * @see com.cg.gs.dao.SchedulerDAO#findPlayerInfo(java.lang.String)
	 */
	@Override
	public PlayerSummary findPlayerInfo(String name) {
		for(Map.Entry<Player, PlayerSummary> entry : players.entrySet()) {
			if(entry.getKey().getName() == name)
				return entry.getValue();
		}
		return null;
	}
	/* (non-Javadoc)
	 * @see com.cg.gs.dao.SchedulerDAO#findDayInfo(java.lang.String)
	 */
	@Override
	public DaySummary findDayInfo(String name) {
		for(Map.Entry<Day, DaySummary> entry : days.entrySet()) {
			if(entry.getKey().getName() == name)
				return entry.getValue();
		}
		return null;
	}
	/* (non-Javadoc)
	 * @see com.cg.gs.dao.SchedulerDAO#findGameInfo(java.lang.String)
	 */
	@Override
	public GameSummary findGameInfo(String name) {
		for(Map.Entry<Game, GameSummary> entry : games.entrySet()) {
			if(entry.getKey().getName() == name)
				return entry.getValue();
		}
		return null;
	}
}
