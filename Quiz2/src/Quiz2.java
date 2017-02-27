import java.util.*;
public class Quiz2 {

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int currentTuition = 12342;
		double percentage = 0;
		double total = 0;
		for (int i = 0; i<=3; i++){
			System.out.println("Year " + ++i + ":");
			i--;
			System.out.println("What is your initial tuition cost?");
			double initialTuitionCost = scan.nextDouble();

			System.out.println("What is the percentage increase or decrease? (remember 1. for first time percentage is at 0     2. for decrease you must put a negative sign)");
			double percentageIncrease = scan.nextDouble();
			percentage += percentageIncrease;

			double totalOwed = currentTuition - initialTuitionCost;



			total += Math.pow(totalOwed*(1+percentage/100/1),4*(4-i));
		}
	
		System.out.println("You owe....$" + total + "!!!!");
	}

	

}


