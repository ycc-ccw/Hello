public class Stars {
	
	public static void main(String[] args) {
		
		int totalLevel = 6;//设置层数
		for(int a = 1;a <= totalLevel;a++) {
			
			for(int k = 1;k <= totalLevel - a;k++) {
				System.out.print(" ");
			}
			
		    for(int j = 1;j <= 2 * a - 1;j++) {
		    	
		    	//if(j == 1 || j == 2 * a - 1 || a == totalLevel) {
			        System.out.print("*");
		    	//} else {
		    	//	System.out.print(" ");
		    	//}
		    }
		   System.out.println("\t");
		}
	}
}