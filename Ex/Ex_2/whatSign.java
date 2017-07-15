/**
*Write a program that will ask for a number and then tell you what sign the
*number had. 1, 0, -1. 
*@author Josefin Ulfenborg
*/
import java.util.Scanner;

public class whatSign{
	private int a;

	public static void main(String[] args){
		System.out.println("Enter a number: ");
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		
		whatSign n = new whatSign(m);
		System.out.println(n.sign());
	}
	
	public whatSign(int a){
		this.a = a;
	}
	
	public int sign(){
		if(a < 0){
			return -1;
		}
		else if(a > 0){
			return 1;
		}
		return 0;
	}
	
}