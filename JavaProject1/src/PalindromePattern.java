
public class PalindromePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		
		for(int i=1;i<=n;i++) {
			//for printing spaces
			int spaces = n-i;
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
			
			//1st half of printing numbers(L.H.S)
			
			for(int j=i; j>=1; j--) {
				System.out.print(j);
			}
			
			
			//2nd half of printing numbers(R.H.S)
			for(int j=2; j<=i ; j++) {
				System.out.print(j);
			}
			
			System.out.println();
		}

	}

}
