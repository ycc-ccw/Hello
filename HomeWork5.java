public class HomeWork5 {
	
	public static void main(String[] args) {
		
		int x = 5;
		int y = 5;
		if(x++ == 6 & ++y ==6) {
			x = 11;
			
		}
			System.out.println("x=" + x + "y=" + y);
			
		int x2 = 5;
		int y2 = 5;
		if(x2++ == 6 && ++y2 == 6) {
			x2 = 11;
		}
		System.out.println("x2=" + x2 + "y2=" + y2);
		
		int x3 = 5,y3 = 5;
		if(x3++ == 5 | ++y3 == 5) {
			x3 = 11;
		}
		System.out.println("x3=" + x3 + "y3=" + y3);
		
		int x4 = 5, y4 = 5;
		if(x4++ == 5 || ++y4 == 5) {
			x4 = 11;
		}
		System.out.println("x4=" + x4 + "y4=" + y4);
	}
}