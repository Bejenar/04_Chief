package com.quest.chief.core;

public enum Vegetable {
	TOMATO("Tomato", 19),
	ONION("Onion", 43),
	WHITE_CABBAGE("White Cabbage", 28),
	CUCUMBER("Cucumber", 15);
	
	private String name;
	private int nutrition;
	
	private Vegetable(String name, int nutrition) {
		this.name = name;
		this.nutrition = nutrition;
	}

	public String getName() {
		return name;
	}

	public int getNutrition() {
		return nutrition;
	}
	
	@Override
	public String toString() {
		return name + ", " + nutrition + " κκΰλ/100γ";
	}
}
