package com.quest.chief.core;

import java.util.Arrays;
import com.quest.chief.action.SaladComparator;

public class Salad {
	private Vegetable[] ingridients;
	
	public Salad() {
		
	}
	
	public Salad(Vegetable[] ingridients) {
		this.ingridients = ingridients;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(ingridients);
	}
	
	public void sortSalad() {
		Arrays.sort(this.ingridients, new SaladComparator());
	}
}
