import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class loopexercise {
  public static void main(String[] args) {
	

  Scanner keyboard = new Scanner(in);
  
  out.print("Enter a number (non-positive to quit)");
  int inputNumber = keyboard.nextInt();
  
  int largest = inputNumber;
  
while (inputNumber > 0) {
  if (inputNumber > largest) {
	  largest = inputNumber;
  }
   inputNumber = keyboard.nextInt();
}
  if (largest > 0) {
    out.println("The largest number is " + largest) ;
} else {
	out.println("You didn't enter any positive numbers");
}
  keyboard.close();

}
  
}


