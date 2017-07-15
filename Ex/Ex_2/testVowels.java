public class testVowels{
	public static void main(String[] args){
		String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int[] isVowel   = {1,0,0,0,1,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,1,0,
						   1,0,0,0,1,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,1,0};
						   
		Vowels x;
		
		for(int i = 0; i < alphabet.length(); i++){
			System.out.print(alphabet.charAt(i));
			x = new Vowels(alphabet.charAt(i));
			System.out.println(", should be: " + (isVowel[i] == 1) + ", is: " + x.isVowel()
			+ "\t which is: " + ((isVowel[i] == 1) == x.isVowel()));
		}
	}	
}