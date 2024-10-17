public class ForceConvert {
	
	public static void main(String[] args) {
		
		//演示强制类型转换
		int n1 = (int)1.9;
		System.out.println("n1=" + n1);
		
		int n2 = 2000;
		byte b1 = (byte)n2;
		System.out.println("b1=" + b1);
		
		int x = (int)(10*3.5+6*1.5);
		System.out.println(x);
		
		char c1 = 100;
		int m = 100;
		//char c2 = m ;错误
		char c3 = (char)m;
		System.out.println(c3);
	}
}