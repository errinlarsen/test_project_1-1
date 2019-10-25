import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;


public class GuessAgain {
  public static void main(String[] args) {
	Scanner keyboard = new Scanner(in);
	
	int numGuesses = 0;
	int randomNumber = new Random().nextInt(100) + 1;
	out.println("Welcome to the guessing game!");
	out.println();
	
	out.print("Enter an int from 1 to 100");
	int inputNumber = keyboard.nextInt();
	numGuesses++;
	
do {
	out.println();
	out.println("Try again...");
	out.print("Enter an int from 1 to 10: ");
	inputNumber = keyboard.nextInt();
	numGuesses++;
} while (inputNumber != randomNumber);

    out.print("You win after ");
    out.println(numGuesses + "guesses");
    
    keyboard.close();
}
}


