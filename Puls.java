public class Puls {
	//输出一个main方法
	public static void main(String[]args) {
		//左右两边为数值型，则作加法运算
		int n1 = 100;
		int n2 = 200;
		System.out.println(100 + 98);
		System.out.println("100" + 98);
		System.out.println(n1 + n2);
		//左右两边有一方为字符串，则作拼接运算
		String name = "jjj";
		System.out.println(100 + 3 + "hello");
		System.out.println("hello + 100 + 3");
		System.out.println(n1 + name);
	}
}
