/*
* Use case 2 : User Guess Submission
*
*This class is responsible for comparing the user's guess with target number.
* It does not handle input or output
*/

class GuessValidator{
	public static String validateGuess(int guess, int target){
	
		if(guess == target){
			return "CORRECT";
		} else if(guess < target){
			return "LOW" ;
		}
		return "HIGH";
	}
}