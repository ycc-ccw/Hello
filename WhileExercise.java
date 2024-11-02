public class WhileExercise {
	
	public static void main(String[] agrs) {
		System.out.println("打印1-100之间所有能被3整除的数");
		int num1 = 1;
		int end = 100;
		int sum = 0;
		int count = 0;
		while(num1 <= end) {
			if(num1 % 3 == 0) {
				System.out.println(num1);
				count++;
				sum += num1;
			}
			num1++;
		}
		
		System.out.println("count=" +count);
		System.out.println("sum=" + sum);
		System.out.println("\n\n打印40-200之间所有的偶数");
		int num2 = 40;
		int endNum = 200;
		while(num2 <= endNum) {
			if(num2 % 2 == 0) {
				System.out.println(num2);
			}
			num2++;
		}
	}
}