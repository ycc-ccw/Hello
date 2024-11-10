public class HomeWorkWhile05 {
	
	public static void main(String[] args) {
		
		
		int count = 0;
		//System.out.println(num1);
		for(char num1 = 'a';num1 <= 'z';num1++) {
			System.out.print(num1 + "\t");
			count++;
			if(count % 6 == 0) {
				System.out.println();
			}
		}
		
		System.out.println();
		System.out.println();
		
		for(char num3 = 'Z';num3 >= 'A';num3--) {
			System.out.print(num3 + "\t");
			count++;
			if(count % 6 == 0) { 
				System.out.println();
			}
		}
	}
}