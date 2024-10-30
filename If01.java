import java.util.Scanner;
public class If01 {
	
	public static void main(String[] args) {
		//编写一个程序，可以输入人的年龄，如果该同志的年龄大于18岁
		//则输出“你的年龄大于18要对自己的行为负责，送入监狱“
		Scanner myScanner = new Scanner(System.in);
		//接受用户信息
		System.out.println("请输入您的年龄");
		int age = myScanner.nextInt();
		//使用if 判断 输出对应信息
		if(age > 18) {
			System.out.println("你的年龄大于18要对自己的行为负责，送入监狱");
		}
		
		System.out.println("程序继续。。。");
		
	}
}