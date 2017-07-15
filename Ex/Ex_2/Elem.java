public class Elem{
	public static void main(String[] args){
		int[] a = {1,2,4,3}; // 2
		int[] b = {7,7,7,7}; // 0
		int[] c = null;
		int[] d = {};
		
		System.out.println(indexOfMaxElem(a));
		System.out.println(maxElem(d));
		
	}
	
	
	public static int indexOfMaxElem(int[] e){
		int index = 0;
		
		if((e != null) && (e.length > 0)) {
			int max = e[0];
			
			for (int i = 0; i < e.length; i++) {
				if (e[i] > max){
					max = e[i];
					index = i;
				}
			}
			
		} else {
			throw new IllegalArgumentException
				("Array must have a length greater than 0 and must not be null");
		}
		
		return index;
	}
	
	
	public static int maxElem(int[] e) {
		return e[indexOfMaxElem(e)];
	}
}