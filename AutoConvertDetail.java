public class AutoConvertDetail {
	
	public static void main(String[] args) {
		
		int n1 = 10;
		//double d1 = n1 + 1.1;//对 n1 + 1.1 => 结果类型是double
		//float d1 = n1 + 1.1;// 错 n1 + 1.1 => 结果类型是double
		float d1 = n1 + 1.1F;
		
		//int n2 = 1.1;错 
		//当把数赋给 byte 时，先判断该数是否在byte范围内，如果是就可以
		byte b1 = 10;
		int n2 = 1;
		//byte b2 = n2//错误，原因：如果变量赋值，判断类型
		//char c1 = b1;错，byte 不能转成 char
		
		byte b2 = 1;
		byte b3 = 2;
		short s1 = 1;
		//Short s2 = b2 + s1;错误，b2 + s1 = int
		int s2 = s1 + b2;
		
		//byte b4 = b2 + b3;//错误 b2 + b3 = int
		
		boolean pass = true;
		//int = num100 = pass// bolean 不参与类型对自动转换
		
		byte b4 = 1;
		short s3 = 100;
		int num200 = 1;
		double num300 = 1.1;
		double num500 = b4 + s3 + num200 +num300;
		
		
		
		
		
	}
}