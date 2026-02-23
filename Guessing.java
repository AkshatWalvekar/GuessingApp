import java.util.Random;
import java.util.Scanner;


public class Guessing {
	public static void main(String[] args) throws InvalidInputException{
		int hintsUsed = 0;
		int attempts = 0;
		int hintCount = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the Guessing App");
		
		System.out.println("Enter Player Name: ");
		String player = scanner.nextLine();
		
		GameConfig gameConfig = new GameConfig();
		gameConfig.showRules();
		
		boolean win = false;
		
	
	
		
		while(attempts<gameConfig.getMaxAttempts()){
			System.out.println("Enter your guess: ");
			//int guess = scanner.nextInt();
			int guess = ValidationService.validateInput(scanner.nextLine());
			attempts++;
			
			String result = GuessValidator.validateGuess(guess, gameConfig.getTargetNumber());
			
			if(!"CORRECT".equals(result) && hintsUsed < gameConfig.getMaxHints()){
				hintsUsed++;
				System.out.println(HintService.generateHint(gameConfig.getTargetNumber(), hintsUsed));
		    }
			
			System.out.println(result);
			
			if ("CORRECT".equals(result)){
				win = true;
				break;
			}
			
			if(hintCount < gameConfig.getMaxHints()){
				hintCount++;
				String hint = HintService.generateHint(gameConfig.getTargetNumber(), hintCount);
	
			System.out.println(hint);
		}
	}
	StorageService.saveResult(player, attempts, win);
}
}
