
/**
*Handles game Lifecycle decisions.
*
*/
import java.util.Scanner;

class GameController{

	public static boolean restartGame(Scanner scanner){
		System.out.println("Do you want to play again? (yes/no): ");
		return scanner.nextLine().equalsIgnoreCase("yes");
	}
}