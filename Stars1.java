public class Stars1 {
	
	public static void main(String[] agrs) {
		
		//打印菱形空边；
		int totalLevel = 4;
		for(int b = 1;b <= totalLevel;b++) {
			for(int j = 1;j <= totalLevel - b;j++) {
				System.out.print(" ");
			}
		    for(int i = 1;i <= b * 2 - 1;i++) {
		    	if(i == 1 || i == b * 2 - 1) {
			    System.out.print("*");
		    	}else {
		    		System.out.print(" ");
		    	}
		    }
		   System.out.println("");
		   
		}
		for(int b = totalLevel - 1;b <= totalLevel;b--) {
			if(b >= 1) {
			for(int j = 1;j <= totalLevel - b;j++) {
				System.out.print(" ");
			}
		    for(int i = 1;i <= b * 2 - 1;i++) {
		    	if(i == 1 || i == b * 2 - 1) {
		    	
			    System.out.print("*");
		    	}else {
		    	System.out.print(" ");
		    	}
		    }
		   System.out.println("");
			}else {
				
			}
		}
		
	}
 }