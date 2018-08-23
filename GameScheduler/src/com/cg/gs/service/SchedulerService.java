package com.cg.gs.service;

import com.cg.gs.beans.Day;
import com.cg.gs.beans.DaySummary;
import com.cg.gs.beans.Game;
import com.cg.gs.beans.GameSummary;
import com.cg.gs.beans.Player;
import com.cg.gs.beans.PlayerSummary;

public interface SchedulerService {
	Player addPlayer(Player p);
	Game addGame(Game g);
	Day addDay(Day d);
	PlayerSummary findPlayerInfo(String name);
	DaySummary findDayInfo(String name);
	GameSummary findGameInfo(String name);
}