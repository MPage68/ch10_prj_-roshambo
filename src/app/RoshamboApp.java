package app;

import java.util.Scanner;

import business.Bart;
import business.Lisa;
import business.Player;
import business.Player1;
import db.Roshambo;
import presentation.Console;

public class RoshamboApp {

	public static void main(String[] args) {
		
		// Scanner/console
		Console c = new Console();
		Scanner sc = new Scanner(System.in);
		
		// variables
		String choice = "y";
		Player1 p1 = new Player1();
		Player p2 = null;
		String gameResult = "";
		
		//user prompt
		System.out.println("Welcome to the game of Roshambo");
		System.out.println("Enter your name:  ");
		p1.setName(sc.next());
		
		//while loop
		while (choice.equalsIgnoreCase("y")) {

			System.out.println("Would you like to play Bart or Lisa?  (B/L): ");
			String player = sc.next();

			if (player.equalsIgnoreCase("b")) {
				p2 = new Bart();
				p2.setValue(p2.generateRoshambo());
				
			} else if (player.equalsIgnoreCase("l")) {
				p2 = new Lisa();
				p2.setValue(p2.generateRoshambo());
			}

			System.out.println("Rock, Paper, or Scissors? (r/p/s) :");
			String roshambo = sc.next();

			if (roshambo.equalsIgnoreCase("r")) {
				p1.setValue(Roshambo.ROCK);
				
				switch (p2.getValue()) {
				case ROCK:
					gameResult = "Draw";
					break;
				case PAPER:
					gameResult = "Paper covers Rock. You lose!";
					break;
				case SCISSORS:
					gameResult = "Rock breaks Scissors. You win!";
					break;
				}
				if (roshambo.equalsIgnoreCase("p")) {
					p1.setValue(Roshambo.PAPER);
					
					switch (p2.getValue()) {
					
					case ROCK:
						gameResult = "Paper covers Rock. You lose!";
						break;
					case PAPER:
						gameResult = "Draw";
						break;
					case SCISSORS:
						gameResult = "Scissors cut paper. You lose!";
						break;
					}
					if (roshambo.equalsIgnoreCase("s")) {
						p1.setValue(Roshambo.SCISSORS);
						
						switch (p2.getValue()) {
						
						case ROCK:
							gameResult = "Rock breaks scissors. You lose!";
							break;
						case PAPER:
							gameResult = "Scissors cut paper. You lose!";
							break;
						case SCISSORS:
							gameResult = "Draw";
							break;
						}
						System.out.println(p1.getName() + p1.getValue() + ":\n" + p2.getName() + p2.getValue() + ":\n"
								+ gameResult);

						System.out.println("Play again?:  ");
						choice = Console.getString("Continue? (y/n)");
						System.out.println("Bye"); // sc.close();

					}
				}
			}
		}
	}
}
