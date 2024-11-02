public class ForExercise {
	
	public static void main(String[] args) {
		//打印1-100直接所有9的倍数，统计个数 及 总和
		System.out.println("1-100 9的倍数如下");
		int count = 0;
		int sum = 0;
		for(int a = 9; a <= 100; a++) {
			if(a % 9 == 0) {
			   System.out.println(a);
			   count++;
			   sum += a;
			}
		}
		System.out.println("count=" + count);
		System.out.println("sum=" + sum);
	}
}