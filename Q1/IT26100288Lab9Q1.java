import java.util.Scanner;

public class IT26100288Lab9Q1 {
    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		
		System.out.print("Enter value a: ");
		double a = input.nextDouble();
		
		System.out.print("Enter value b: ");
		double b = input.nextDouble();
		
		System.out.print("Enter value c: ");
		double c = input.nextDouble();
		
		double d = Math.pow(b,2) - (4*a*c);
		
		if (d >= 0) {
		   double root1 = (-b + Math.sqrt(d)) / (2*a);
		   double root2 = (-b - Math.sqrt(d)) / (2*a);
		   
		   System.out.println("Roots are real and different: ");
		   System.out.println("Root 1: " + root1);
		   System.out.print("Root 2 : " + root2);
		}
		else {
			System.out.print("Roots are complex and imaginary.");
		}	
	}
}	
		   