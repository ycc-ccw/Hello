//演示转义字符的使用
public class ChangeCharYCW {
	//编写一个main方法
	public static void main(String[] args) {
		
		//\t :一个制表位，实现对齐的功能
		System.out.println("东京\t横滨\t大阪\t京都");
		//\n :换行符
		System.out.println("日本\n中国\n韩国");
		// \\ :一个\
		System.out.println("上海\\北京\\浙江\\");
		// \"
		System.out.println("老韩说：\"要好好学习java，有前途\"");
		// \' :一个'
		System.out.println("老韩说：\'要好好学习java，有前途\'");
		// \r : 一个回车
		System.out.println("日本和北京\r\n大家都想去");
		
		System.out.println("书名\t作者\t价格\t销量\n三国\t罗贯中\t120\t1000");
	}
}