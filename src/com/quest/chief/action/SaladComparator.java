package com.quest.chief.action;
import java.util.Comparator;

import com.quest.chief.core.Vegetable;;

public class SaladComparator implements Comparator<Vegetable> {

	@Override
	public int compare(Vegetable o1, Vegetable o2) {
		return o1.getNutrition() - o2.getNutrition();
	}

	
}
