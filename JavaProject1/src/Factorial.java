import java.util.*;

public class Factorial {

	//n! = n * (n-1) * (n-2) * (n-3) .... * 1
	
	// 0! = 1, 1!=1, there is no factorial for negative numbers
	
	
	
	public static void printFactorial(int n) {
		if(n<0) {
			System.out.println("Invalid number");
			return;
		}
		
		int factorial = 1;
		
		for(int i=n; i>=1; i--) {
			factorial = factorial * i;
		}
		
		System.out.println(factorial);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of which you want to calculate the factorial : ");
		int n = sc.nextInt();
		
		printFactorial(n);

	}

}
