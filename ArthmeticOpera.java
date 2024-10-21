public class ArthmeticOpera {
	
	public static void main(String[] args) {
		// /使用
		System.out.println(10.0 / 4);
		double d = 10.0 / 4;
		System.out.println(d);
		
        // %使用
		//看一个公式 a % b = a - a / b * b
		System.out.println(10 % 3);
		System.out.println(-10 % 3);
		System.out.println(10 % -3);
		System.out.println(-10 % -3);
		
		//++使用
		int i = 10;
		i++;
		++i;
		i++;
		System.out.println("i=" + i);
		
		int j = 8;
		int k = ++j;
		int c = j++;
		System.out.println("k=" + k + "\t" +"j=" + j + "\n" + "c=" + c);
		
		
	}
	
}