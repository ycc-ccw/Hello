public class continueDetail {
	
	public static void main(String[] args) {
		abs1:
		for(int i = 0;i <= 3;i++) {
			abs2:
			for(int j = 0;j <= 20;j++) {
				if(j == 3) {
					
					continue abs1;
				}
				System.out.println("yyy=" + j);
			}
		}	
	}
}