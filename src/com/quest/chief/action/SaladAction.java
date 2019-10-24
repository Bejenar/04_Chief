package com.quest.chief.action;
import java.util.Scanner;

import com.quest.chief.core.*;

public class SaladAction {

	public static Scanner scan = new Scanner(System.in);
	public static Salad makeSalad() {
		
		Vegetable[] ingridients = new Vegetable[scan.nextInt()];
		for(int i = 0; i < ingridients.length; i++)
		{
			ingridients[i] = getVegetable();
		}
		
		return new Salad(ingridients);
			
	}
	
	public static Vegetable getVegetable() {
		System.out.println("TOMATO(\"Tomato\", 19),\r\n" + 
				"	ONION(\"Onion\", 43),\r\n" + 
				"	WHITE_CABBAGE(\"White Cabbage\", 28),\r\n" + 
				"	CUCUMBER(\"Cucumber\", 15);");
		
		Vegetable v = Vegetable.TOMATO;
		switch(scan.nextInt())
		{
		case 1: v = Vegetable.TOMATO; break;
		case 2: v = Vegetable.ONION; break;
		case 3: v = Vegetable.WHITE_CABBAGE; break;
		case 4: v = Vegetable.CUCUMBER; 
		}
		
		return v;
	}
	
}
