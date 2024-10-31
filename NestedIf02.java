import java.util.Scanner;
public class NestedIf02 {
	
	public static void main(String[] args) {
		/*
		 旺季 ：
		 成人（18 - 60）：60
		 儿童 （<18):半价
		 老人（>60）:1/3
		 淡季：
		 成人 ：40
		 其他 ：20
		 */
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请先输入月份");
		
		int month = myScanner.nextInt();
		if(month > 4 && month < 10) {
			System.out.println("请输入您的年龄");
			int age = myScanner.nextInt();
			if(age < 18) {
				System.out.println("30");
			}else if(age >= 18 && age <= 60) {
				System.out.println("60");
			}else if(age > 60) {
				System.out.println("20");
			}else { 
				System.out.println("您的年龄有误，请重新输入");
		}
			
		}else  {
			System.out.println("请输入年龄");
		}
		int age1 = myScanner.nextInt();
		if(age1 >=18 && age1 <=60) {
			System.out.println("价格为40");
		}else {
			System.out.println("价格为20");
		}
		
	}
}