public class If04 {
	
	public static void main(String[] args) {
		//声明两个double类型的变量并赋值，判断一个数大于10.0并且第二个数小于20.0，打印两个数之和
		double a = 11;
		double b = 19;
		if(a > 10 && b < 20) {
			System.out.println(a + b);
			
		}
		//定义两个变量int，判断两者的和，是否能被3又能被5整除，打印信息
		int num1 = 12;
		int num2 = 8;
		int sum = num1 + num2;
		if(sum % 3 == 0 && sum % 5 ==0) {
			System.out.println("できます");
			
		}else {
			System.out.println("できません");
		}
		//判断一个年份能否是闰年，条件是符和下面二者之一
		//（1）年份能被4整除但不能被100整除；（2）能被400整除
		int year = 2001;
		if((year % 4 ==0 && year % 100 != 0) || year % 400 ==0) {
			System.out.println(year +"是闰年");
		}else { 
			System.out.println(year +"不是闰年");
		}
		
	}
}