public class For01 {
	
	public static void main(String[] args) {
		
		//打印10句“再见嘴唇”
		for(int i =1; i <= 10; i++) {
			System.out.println("再见嘴唇" + i);
		}
		
		int n1 = 3;
		for(; n1 <= 10 ;) {
			System.out.println("再见" + n1);
			n1++;
		}
		
		int count = 8;
		for(int i = 0,j = 0; i < count && j <= 10; i++, j+= 2) {
			System.out.println("i=" +i + "j=" + j);
		}
	}
}