public class InverseOperator {
	
	public static void main(String[] args) {
		
		//!操作是取反，真变假，假变真
		System.out.println(60 > 20);
		System.out.println(!(60 > 20));
		
		//a^b: 叫逻辑异或，当a 和 b 不同时，则为true，否则为flase
		boolean b = (10 > 1) ^ (3 < 5);
		System.out.println("b=" + b);
		boolean c = (10 < 1) ^ (3 < 4);
		System.out.println("c=" + c);
		
	}
}