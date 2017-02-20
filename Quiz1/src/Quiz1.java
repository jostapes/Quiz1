import java.util.Scanner;
public class Quiz1 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is your number of touchdowns?");
		int TD = scan.nextInt();
		
		System.out.println("What is your total yards thrown?");
		int yards = scan.nextInt();
		
		System.out.println("How many interceptions did you throw?");
		int INT = scan.nextInt();
		
		System.out.println("How many completions do you have?");
		int comp = scan.nextInt();
		
		System.out.println("What is the number of passes attempted for you?");
		int ATT = scan.nextInt();
		
		double a = (comp/ATT-.3)*5;
		double b = (yards/ATT-3)*.25;
		double c = (TD/ATT)*20;
		double d = 2.375-(INT/ATT*25);
		
		if (a>2.375)
			a=2.375;
		else if (a<0)
			a=0;
		
		if (b>2.375)
			b=2.375;
		else if (b<0)
			b=0;
		
		if (c>2.375)
			c=2.375;
		else if (c<0)
			c=0;
		
		if (d>2.375)
			d=2.375;
		else if (d<0)
			d=0;
		
		double passerRating = ((a+b+c+d)/6)*100;
		double passerRatingNCAA = (8.4*yards + 330*TD + 100*comp - 200*INT)/ATT;
		
		if (passerRating>158.3)
			passerRating = 158.3;
		else if (passerRating<0)
			passerRating=0;
		
		if (passerRatingNCAA>1261.6)
			passerRatingNCAA = 1261.6;
		else if (passerRatingNCAA<-731.6)
			passerRatingNCAA=-731.6;
		
		
		System.out.printf("Passer Rating: %.1f \nPasser Rating NCAA: %.1f",passerRating, passerRatingNCAA);
		
		
	}
}
