/**
*A program to print a table with Celcius and Fahrenheit values
*@author Josefin Ulfenborg
*/

public class CtoF{
	public static void main(String[] args){
		System.out.println("Celcius \t Farhenheit");
		
		//Will print the Celcius values between 40 and 31
		for (double c = 40; c > 30; c--){
			System.out.println(c + " \t \t " + (((9*c)/5)+32));
		}
	}
}