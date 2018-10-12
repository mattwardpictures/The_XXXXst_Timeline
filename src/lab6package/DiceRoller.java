package lab6package;

import java.util.Random;
import java.util.Scanner;

public class DiceRoller {

	public static int rollDice(int n) {

		Random randGen = new Random();
		int side = randGen.nextInt(n);
		return side;

	}

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int diceSide;
		String continueProgram;

		System.out.println("================================");
		System.out.println("Welcome to the XXXXX'st Timeline");
		System.out.println("================================");
		System.out.println(" ");
		System.out.println("The Universe is controlled by myriad random events,");
		System.out.println("and the World is threatened by CHAOS.");
		System.out.println(" ");
		System.out.println("Choose the number of sides for your dice,");
		System.out.println("and do so wisely.");

		do { // Execute this at least once, and then thereafter...
			System.out.println(" ");
			System.out.println("Enter number of sides and press Enter to toss!");
			diceSide = scnr.nextInt();
			System.out.println(" ");
			System.out.println("Toss 1:");
			System.out.println(rollDice(diceSide));
			System.out.println(" ");
			System.out.println("Toss 2:");
			System.out.println(rollDice(diceSide));

			System.out.println(" ");
			System.out.println("Toss again? (y/n)");
			continueProgram = scnr.next();
		} while (continueProgram.charAt(0) == 'y'); // ...as long as this condition is met!

		System.out.println(" ");
		System.out.println("Very well.");
		System.out.println("I have been your game-master, and this has been the BEST timeline.");
		System.out.println("EXCELSIOR!");

		scnr.close();

		// THE END! Until the next timeline...

	}

}
