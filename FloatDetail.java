public class FloatDetail {
	//编写一个main方法
	public static void main(String[] args) {
		double n1 = 1.1;
		float n2 = 1.1f;
		double n3 = 1.1f;
		
		//十进制数形式
		double n4 = .052;
		System.out.println(n4);
		
		double n5 = 1.1e2;
		double n6 = 1.1E-2;
		System.out.println(n5);
		System.out.println(n6);
		
		float n7 = 1.123456789f;
		double n8 = 1.123456789;
		System.out.println(n7);
		System.out.println(n8);
		
		 double n9 = 2.7;
		 double n10 = 8.1 / 3;
		 System.out.println(n9);
		 System.out.println(n10);
		 
		 if( n9 == n10) {
			 System.out.println("相等");
			  
		 }
		 
		 if(Math.abs(n10 - n9) < 0.000001) {
			 System.out.println("差值非常小，到我的规定精度，认为相等。。。");
			 System.out.println(Math.abs(n10 - n9));
		 }
	}
}