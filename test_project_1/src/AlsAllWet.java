import static java.lang.System.out;

public class AlsAllWet {
  public static void main(String[] args) {
	
    for (int verse = 1; verse <=3; verse++) { 
	   out.print("Al's all wet ");
       out.println("Oh, why is Al all wet? Oh,");
       out.print("Al's all wet 'cause ");
       out.println("he's standing in the rain.");
       out.println("Why is Al out in the rain?");
       
       switch (verse) {
       case 1:
         out.println("That's becuse he has no brain.");
         break;
       case 2:
         out.println("That's because he is a pain.");
         break;
       case 3: 
    	   out.println("Cause this is the last refrain");
    	   break;
       }
       
       switch (verse) {
       case 1: 
    	   out.println("No brain, no brain");
       case 2: 
    	   out.println("He's a  pain, he's a pain");
       case 3:
    	   out.println("Has no brain, has no brain");
       }
       
       out.println("In the rain, in the rain.");
       out.println("Ohhhhhhhhh...");
       out.println();
    }
       out.print("Al's all wet.");
       out.println("Oh, why is Al all wet? Oh,");
       out.print("Al's all wet 'cause ");
       out.println("he's standing in the rain.");
  }
}
       
       
