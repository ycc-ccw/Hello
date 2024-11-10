public class HomeWorkWhile01 {
	
	public static void main(String[] args) {
		
		//实现判断一个整数，属于哪个范围：大于0 小于0 等于0
		int num1 = -100;
		if(num1 > 0) {
			System.out.println("num1大于0");
		} else if(num1 == 0) {
			System.out.println("num1等于0");
		} else if(num1 < 0) {
			System.out.println("num1小于0");
		}
	}
}