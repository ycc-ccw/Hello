public class Return01 {
	
	public static void main(String[] args) {
		
		for(int i = 1;i <= 5;i++) {
			if(i == 3) {
				System.out.println("門脇" + i);
				return;
			}
			System.out.println("門脇麦");
		}
		System.out.println("門脇麦さん");
	}
}