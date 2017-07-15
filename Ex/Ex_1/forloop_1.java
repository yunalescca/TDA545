import java.util.Scanner;
/**
*A loop to take a user input r, and to print
*1
*12
*12..r
*@author Josefin Ulfenborg
*/
public class forloop_1{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter a number greater than 1: ");
		int r = s.nextInt();
		System.out.println();
		
		//I need a variable that doesn't change its value throughout the 
		//for-loops, so that I always start with '1'. 
		int k = 1;
		for(int i = 1; i <= r; i++){
			System.out.print(k);
			
			//the j-loop has to start at 2 to make the first print solely be 1.
			for (int j = 2; j <= i; j++){ 
				System.out.print(j);
			}
			System.out.println(); //to make the print look like it should
		}
	}
}