package com.Project_Pannonia.Main;

import com.Project_Pannonia.Sentences.Introduction;
import com.Project_Pannonia.Sentences.Preparation;
import com.Project_Pannonia.Sentences.Reason;

public class Main {

	public static void main(String[] args) {
		Introduction intro = new Introduction();
		Preparation prep = new Preparation();
		Reason reas = new Reason();
		
		String introduction = intro.getRandomSentence();
		String preparation = prep.getRandomSentence();
		String reason = reas.getRandomSentence();
		
		System.out.println(introduction + preparation + reason);
	}

}
