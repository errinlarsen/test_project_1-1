import static java.lang.System.out;

public class Account {
  public String name;
  public String address;
  public double balance; 

public void display() {
  out.print(name);
  out.print(" (");
  out.print(address);
  out.print(") has $");
  out.print(balance);
	
  }

public double getInterest(double percentageRate) {
  return balance * percentageRate / 100.00;
  }

public static void main(String[] args) {
	git@github.com:donut211/test_project_1.git
}
}
