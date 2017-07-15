/**
*Write a program that will check if an input is a vowel, and also how many vowels
*are contained in a string.
*@author Josefin Ulfenborg
*/
import java.util.Scanner;

public class Vowels{
	private char ch;
	private String str;
	private static String allVowels = "AEIOUYaeiouy";
	
	public static void main(String[] args){
		
		System.out.println("Please enter a string: ");
		Scanner ss = new Scanner(System.in);
		String s = ss.next();
		
		Vowels vs = new Vowels(s);
		System.out.println("Number of vowels: " + vs.nbrOfVowels());
	}
	
	
	public Vowels(char ch){
		this.ch = ch;
	}
	
	public Vowels(String str){
		this.str = str;
	}
	
	public boolean isVowel(){
		for (int i = 0; i < allVowels.length(); i++){
			if (this.ch == allVowels.charAt(i)){
				return true;
			}
		}
		return false;
	}
	
	//indexOf returns the index of the character in a String, and if it is not present
	//-1 will be returned, hence >= 0
	public int nbrOfVowels(){
		int nbr = 0;
		for (int i = 0; i < (this.str).length(); i++){
			if(allVowels.indexOf(this.str.charAt(i)) >= 0){
				nbr++;
			}
		}
		return nbr;
	}
}

