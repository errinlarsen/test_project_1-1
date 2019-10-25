import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;

public class FoodProductType {
  public static void main(String[] args) {
	Scanner keyboard = new Scanner(in);
	
	FoodProduct peaches = new FoodProduct();
	FoodProduct apples = new FoodProduct();
	
	peaches.foodType = "peaches";
	peaches.foodCost = 1.83;
	peaches.foodCalories = 70;
	peaches.foodWeight = 500;
	peaches.foodServings = 4;
	
	apples.foodType = "apples";
	apples.foodCost = 1.94;
	apples.foodCalories = 65;
	apples.foodWeight = 650;
	apples.foodServings = 3;
	
	
	out.println("Which food are you buying?");
	String foodBought = keyboard.next();
	
	
	
	  if (foodBought == "apples" || foodBought == "Apples") {
		  out.println("You are buying " + foodBought +":");
		  out.println("");
		  out.println(foodBought + "has " + apples.foodCalories +
				      " calories and weighs " + apples.foodWeight 
				      + " grams");
		  out.println("for a total cost of $" + apples.foodCost + " for "
				      + apples.foodServings + " servings");
		  
	  }if (foodBought == "peaches" || foodBought == "Peaches") {
		  out.println("You are buying " + foodBought +":");
		  out.println("");
		  out.println(foodBought + "has " + peaches.foodCalories +
				      " calories and weighs " + peaches.foodWeight 
				      + " grams");
		  out.println("for a total cost of $" + peaches.foodCost + " for "
				      + peaches.foodServings + " servings");
	     
		  
		 
	  }
		
}

}
