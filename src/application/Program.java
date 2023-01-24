package application;

import java.util.List;

import entities.NumberGenerator;

public class Program {

	public static void main(String[] args) {
		
		List<Integer> luckyNumbers = NumberGenerator.generateLuckyNumbers();
		
		for(int i = 0; i < 6; i++) {
			System.out.print(luckyNumbers.get(i));
			if (i < 5) System.out.print("-");
		}

	}

}