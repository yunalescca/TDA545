import java.util.Scanner;
/**
*Write a piece of code that, with user input n <= 9, prints the multiplication
*table for n
*@author Josefin Ulfenborg
*/

public class forloop_2{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter a number between 1-9: ");
		int n = s.nextInt();
		
		//Two seperate for-loops. This will be the header of the table
		for (int k = 1; k <= n; k++){
			System.out.print(k + " ");
		}
		System.out.println();
		 
		for (int i = 1; i <= n; i++){
			System.out.print(i + " ");
			for (int j = 1; j <= n; j++){
				System.out.print(j*i+ " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}

/*
n = 3

	1 2 3
  1 1 2 3
  2 2 4 6
  3 3 6 9

*/
