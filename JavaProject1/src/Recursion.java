
public class Recursion {
	
	public static void towerOfHanoi(int n, String src, String helper, String dest) {
		//step 1: transfer n-1 disks from source to helper (so 1 disk remains on source)
		//in step1 ,you'll use destination as helper ,therefore helper becomes the destination
		
		
		if(n == 1) {
			System.out.println("transfer disk "+ n + " from "+src+" to "+dest);
			return;
		}
		
		towerOfHanoi(n-1, src, dest, helper);
		System.out.println("transfer disk "+ n + " from "+src+" to "+dest);
		towerOfHanoi(n-1,helper, src, dest); 
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		towerOfHanoi(n,"S","H","D");
		

	}

}
