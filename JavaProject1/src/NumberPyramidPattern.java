
public class NumberPyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		
		for(int i = 1; i <= n; i++) {
			
			//for printing spaces
			int spaces = n - i;
			for(int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}
			
			//for printing numbers
			for(int j = 1; j<=i ; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

	}

}