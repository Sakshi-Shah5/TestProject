
public class ReverseString {
	
	//reverse the string using StringBuilder
	//approach : consider/traverse half elements and send it to back and at the same time,  
	//the back elements will come at front
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder("hello");
		
		for(int i=0; i<sb.length()/2; i++) {
			//calculation of index(the index which we want to replace)
		  int front = i;
		  int back = sb.length() - 1 - i;//1st iteration eg: 5-1-0 ->4th position 
										//this implies that front string will go at 4th index
		  
		  
		  //calculation of character ->which one is front character, which one is back 
		  char frontChar = sb.charAt(front);
		  char backChar = sb.charAt(back);
		  
		
		  
		  
		  //replace front index with back character and vice versa
		  sb.setCharAt(front, backChar);
		  sb.setCharAt(back, frontChar);
		}
		
		System.out.println(sb);

	}

}
