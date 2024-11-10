public class HomeWorkWhile04 {
	
	public static void main(String[] args) {
		
		//输出1-100之间不能被5整除的数，每5个一行
		int count = 0;
		for(int num1 = 1;num1 <= 100;num1++) {
			if(num1 % 5 != 0 ) {
				count++;
				System.out.print(num1 + "\t");
				if(count % 5 == 0) {
					System.out.println("\n");
				}
			}
		}
		
	}
}