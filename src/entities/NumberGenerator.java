package entities;

import java.util.ArrayList;
import java.util.List;

public  class NumberGenerator {
	 
	public static List<Integer> generateLuckyNumbers(){
		List<Integer> luckyNumbers = new ArrayList<>();
		
		for (int i = 0; i < 6; i++) {
			Long numb = Math.round(Math.random() * 60);
			luckyNumbers.add(numb.intValue());
		}
		
		return luckyNumbers;
	}	
}