//演示逻辑运算符的使用
public class LogicOperator {
	
	public static void main(String[] args) {
		//&&短路与使用
		int age = 50;
		if(age > 20 && age < 600) {
			System.out.println("ok100");
		}
		
		//&逻辑与使用
		if(age > 20 & age < 40) {
			System.out.println("ok200");
		}
		
		//区别
		int a = 4;
		int b = 9;
		//对于&&短路与而言，如果第一个条件为false，后面的条件不再判断
		if(a < 1 && ++b < 50) {
			System.out.println("ok300");
		}
		System.out.println("a=" + a + " b=" + b);
		//-----------------------------
		////对于&逻辑与与而言，如果第一个条件为false，后面的条件继续判断
		if(a < 1 & ++b < 50) {
			System.out.println("ok300");
		}
		System.out.println("a=" + a + " b=" + b);
	}
}
	
	