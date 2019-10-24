package com.quest.chief.run;
import com.quest.chief.action.*;
import com.quest.chief.core.Salad;

public class Runner {

	public static void main(String[] args) {
		Salad s = SaladAction.makeSalad();
		
		System.out.println(s);
		s.sortSalad();
		System.out.println(s);
	}

}
