package com.cg.gs.pl;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter choice:\n1. Search by Player\n2. Search by day\n3. Search by game");
		int i = sc.nextInt();
		switch(i) {
		case 1:
			System.out.println("Enter name of player: ");
			String name = sc.nextLine();
			break;
		case 2:
			System.out.println("Enter day name: ");
			String day = sc.nextLine();
			
		}

	}

}
