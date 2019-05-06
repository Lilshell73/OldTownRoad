
import java.util.Scanner;

public class RPS 
{	
	public static Scanner s = new Scanner(System.in);

	public static void main(String[] args) 
	{
		rockPaperScissorsGame();
	}	
	
	public static void rockPaperScissorsGame() 
	{	
		System.out.print("How many games would you like to play? ");
		int gamesCompleted = 0;
		int gamesRequested = s.nextInt();
		s.nextLine();
		while(gamesCompleted < gamesRequested)
		{
			String userChoice = promptUserChoice();
			String computerChoice = promptComputerChoice();
			printResults(userChoice, computerChoice);
//			
				gamesCompleted++;
			
		}
		System.out.println("Thanks for playing RPS!");			
	}
	
	
	private static void printResults(String userChoice, String computerChoice)
	{
		System.out.println("You chose     : " + userChoice);
		System.out.println("Computer chose: " + computerChoice);
		if (userChoice.equals(computerChoice))
		{
			System.out.println("You tied!");
		}
		else if(
				computerChoice.equals("Paper")&&userChoice.equals("Rock") ||
				computerChoice.equals("Rock")&&userChoice.equals("Scissors") ||
				computerChoice.equals("Scissors")&&userChoice.equals("Paper")
				)
		{
			System.out.println("Computer wins");

		}
		else
		{
			System.out.println("User wins");

		}
	}
	
	public static String promptComputerChoice()
	{
		int computerChoiceNum = (int)(3*Math.random());
		if(computerChoiceNum == 0)
		{
			return "Rock";
		}
		else if(computerChoiceNum == 1)
		{
			return "Paper";
		}
		else
		{
			return "Scissors";
		}
	}

		public static String promptUserChoice() 
		{
		System.out.println("Choose: 1-Rock 2-Paper 3-Scissors");
		int userChoiceNum = s.nextInt();
		if(userChoiceNum ==1)
		{
			return "Rock";
		}
		else if(userChoiceNum == 2) 
		{
			return "Paper";
		}
		else
		{
			return "Scissors";
		}
	}
	
}

