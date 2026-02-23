import java.util.Random;
import java.util.Scanner;


public class Guessing {
	public static void main(String[] args)
	{
		System.out.println("Welcome to the Guessing App");
		GameConfig gameConfig = new GameConfig();
		gameConfig.showRules();
		
		Scanner scanner = new Scanner(System.in);
		int attempts = 0;
		int hintCount = 0;
		
		while(attempts<gameConfig.getMaxAttempts()){
			System.out.println("Enter your guess: ");
			int guess = scanner.nextInt();
			attempts++;
			
			String result = GuessValidator.validateGuess(guess, gameConfig.getTargetNumber());
			
			System.out.println(result);
			
			if ("CORRECT".equals(result)){
				break;
			}
			
			if(hintCount < gameConfig.getMaxHints()){
				hintCount++;
				String hint = HintService.generateHint(gameConfig.getTargetNumber(), hintCount);
	
			System.out.println(hint);
		}
	}
}
}