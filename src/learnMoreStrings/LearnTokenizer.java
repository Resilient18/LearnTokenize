package learnMoreStrings;

import java.util.Scanner;
import java.util.StringTokenizer;

public class LearnTokenizer {

	public static void main(String[] args) {
		
		
		System.out.println("Type your sentence.");
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();
		
		StringTokenizer word = new StringTokenizer(sentence, " ");
		int count = 0; 
		while (word.hasMoreTokens()) { 
			
			System.out.println(word.nextToken());
			count++;
		}
		System.out.println(count++);
			

	}

}
