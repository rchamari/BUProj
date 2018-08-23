package com.cg.gs.beans;

public class Game {
	
	String name;
	
	public Game(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Game [name=" + name + "]";
	}

}
