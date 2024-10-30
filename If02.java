import java.util.Scanner;
public class If02 {
	
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		//接受用户信息
		System.out.println("请输入您的年龄");
		int age = myScanner.nextInt();
		//
		if(age > 18)  {
			System.out.println("你的年龄大于18要对自己的行为负责，送入监狱");
			
		} else {
			System.out.println("你的年龄不大这次就放过你了");
		}
		
		System.out.println("程序继续执行");
	}
}