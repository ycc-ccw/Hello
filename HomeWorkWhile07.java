public class HomeWorkWhile07 {
	
	public static void main(String[] args) {
		//求1 + （1 + 2） + （1 + 2 + 3） + ..... + ( 1 + 2 + 3 + 4 + .....+ 100)的和
		int num1 = 100;
		int sum = 0;
		for(int i = 1; i <= num1; i++) {
			for(int j = 1; j <= i; j++) {
				sum += j;
				//第一次循环结果为1
				//第二次循环结果为1 
				//1
				System.out.print(j + " ");
			}
			System.out.println();
		
		}
		System.out.println("sum=" + sum);
	}
}