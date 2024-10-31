import java.util.Scanner;
public class If05 {
	
	public static void main(String[] args) {
		
		//输入保国同志的芝麻信用分
		//如果：
		//1.信用分为100，输出 信用极好；
		//2.信用分为（80，99），输出 信用优秀；
		//3.信用分为（60，80），输出 信用一般；
		//4.其他情况，输出 信用不及格；
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入您的信用分");
		
		int credit = myScanner.nextInt();
	if(credit >=1 && credit <= 100) {
		if(credit == 100) {
			System.out.println("您的信用分为100，信用极好");
			
		} else if(credit >= 80 && credit <= 99) {
			System.out.println("信用优秀");
			
		} else if(credit >= 60 && credit <= 80) {
			System.out.println("信用一般");
			
		} else {
			System.out.println("信用不及格");
			
		} 
	  
	} else { 
		System.out.println("信用分需要在1-100.请重新输入：");
	}
			
	}
}