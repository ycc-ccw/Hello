public class LogicOperator02 {
	
	public static void main(String[] args) {
		
		//||短路或使用
		int age = 50;
		if(age > 20 || age < 30) {
			System.out.println("ok100");
		}
				
		//｜逻辑或使用
		if(age > 20 | age < 40) {
			System.out.println("ok200");
		}
		//区别
		int a = 4;
		int b = 9;
		//对于？｜｜短路或而言，如果第一个条件为true，后面的条件不再判断
		if(a < 1 || ++b < 50) {
			System.out.println("300");
		}
		System.out.println("a=" + a + " b=" + b);
		//-----------------------------
		////对于|逻辑或而言，不管第一个条件是否为true，后面的条件继续判断
		if(a < 1 | ++b < 50) {
			System.out.println("400");
		}
		System.out.println("a=" + a + " b=" + b);

	}
}