package application;

import java.util.List;

import entities.NumberGenerator;

public class Program {

	public static void main(String[] args) {
		
		List<Integer> luckyNumbers = NumberGenerator.generateLuckyNumbers();
		
		System.out.println("Welcome! Your lucky numbers will be generated.\n");
		
		System.out.print("Here are your lucky numbers: ");
		
		for(int i = 0; i < luckyNumbers.size(); i++) {
			System.out.print(luckyNumbers.get(i));
			if (i < 5) System.out.print("-");
		}
		
		System.out.println();
		System.out.println("\nGood luck and bet in moderation.");

	}
}