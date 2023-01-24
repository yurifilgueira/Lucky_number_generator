package entities;

import java.util.ArrayList;
import java.util.List;

public  class NumberGenerator {
	 
	public static List<Integer> generateLuckyNumbers(){
		List<Integer> luckyNumbers = new ArrayList<>();
		
		Long numb;
		
		for (int i = 0; i < 6; i++) {
			numb = Math.round(Math.random() * 59 + 1);
			
			if (!luckyNumbers.contains(numb.intValue())) {
				luckyNumbers.add(numb.intValue());
			}
			else {
				i--;
			}
		}
		return luckyNumbers;
	}	
}