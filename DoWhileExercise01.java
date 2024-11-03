public class DoWhileExercise01 {
	
	public static void main(String[] args) {
		
		//1) 打印 1—100 [学生做]
		//2) 计算 1—100 的和 [学生做]
		int num1 = 1;
		int num2 = 0;
		do {
			System.out.println(num1);
			num1++;
			num2 = num2 + num1;
		}while(num1 <= 100);
		System.out.println(num2);
		//3) 统计 1---200 之间能被 5 整除但不能被 3 整除的个数 
		System.out.println("-----------------------");
		int num3 = 1;
		int count = 0;
		do {
			if(num3 % 5 == 0 && num3 % 3 != 0) {
			    System.out.println(num3);
			    count++;
			}
		    num3++;
			    
		}while(num3 <= 200);
		System.out.println("能被5但不能被3整除的个数是" + count);
	}
}