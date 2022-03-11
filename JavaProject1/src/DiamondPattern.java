
public class DiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 4;
		
		//1st half(upper half stars)
		for(int i=1; i<=n; i++) {
			//for spaces:
			
			int spaces = n-i;
			
			for(int j=1; j<=spaces; j++) {
				System.out.print(" ");
			}
			
			
			//printing stars
			for(int j = 1; j<= 2*i-1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		
		
		//2nd half(lower half stars)
				for(int i=n; i>=1; i--) {
					//for spaces:
					
					int spaces = n-i;
					
					for(int j=1; j<=spaces; j++) {
						System.out.print(" ");
					}
					
					
					//printing stars
					for(int j = 1; j<= 2*i-1; j++) {
						System.out.print("*");
					}
					
					System.out.println();
				}
		
		
		
		
		
		
		
		

	}

}
