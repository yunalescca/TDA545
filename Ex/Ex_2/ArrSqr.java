/**
*A program that, with an array, creates a new array with the square numbers of the original one
*@author Josefin Ulfenborg
*/

public class ArrSqr{
	public static void main(String[] args){
		int[] a = {-1, 0, 1, 2, 3, 4, 5};
		
		System.out.print("{ ");
		//A for-loop is needed to print an array
		for (int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
		System.out.println("}");
		a = arraySqr(a);
		System.out.print("{ ");
		
		for (int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
		System.out.println("}");
	}
	
	
	public static int[] arraySqr(int[] arr){
		//How to create a new array for the program to fill (cannot write int[] b = {})
		int[] b = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++){
			b[i] = arr[i]*arr[i];
		}
		
		return b;
	}
}