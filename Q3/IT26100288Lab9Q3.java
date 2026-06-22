public class IT26100288Lab9Q3 {
    public static void main (String [] args) {
	    
		int expr1 =square(add(multiply(3,4),multiply(5,7)));
		
		int expr2 = add(square(add(4,7)),square(add(8,3)));
		
		System.out.println("Result of (3 * 4 + 5 * 7)^2 : " + expr1);
		System.out.println("Result of (4 + 7)^2 + (8 + 3)^2 : " + expr2);
	}

    public static int add(int num1,int num2) {
        return num1 + num2;
    }

    public static int multiply(int num1,int num2) {
        return num1 * num2;
    }
   
    public static int square(int num) {
        return num * num;
    }
}	
		