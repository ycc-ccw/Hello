public class HomeWorkWhile03 {
	
	public static void main(String[]args) {
		
		//判断一个整数是否为水仙花数，所谓的水仙花数是指一个3位数，其各个位上的数字立方和等于其本身。
		//例如：153 = 1*1*1 + 3*3*3 + 5*5*5
		int num1 = 153;
		int num2 = num1 / 100;//百位
		int num3 = num1 % 100 / 10;//十位
		int num4 = num1 % 10;//个位
		if(num1 == num2 * num2 * num2 + num3 * num3 * num3 + num4 * num4 * num4) {
			System.out.println(num1 + "该数字是水仙花数");
		} else {
			System.out.println(num1 + "该数字不是水仙花数");
		}
	}
}