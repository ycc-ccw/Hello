import java.util.Scanner;//表示把java.util下的Scanner类导入
public class input {
	
	public static void main(String[] args) {
		//演示接受用户的输入
		//步骤
		//Scanner类 表示 简单的文本扫描器， 在java.util 包
		//1.引入 Scanner类所在的包
		//2.创建Scanner 对象 ， new 创建一个对象
		// myscanner 就是 Scanner类的对象
		Scanner myScanner = new Scanner(System.in);
		//接收用户输入， 使用相关方法
		System.out.println("请输入名字");
		String name = myScanner.next();
		System.out.println("请输入年龄");
		int age = myScanner.nextInt();
		System.out.println("请输入薪水");
		double sal = myScanner.nextDouble();//給料
		System.out.println("人的信息如下：");
		System.out.println("名字=" + name + 
				" 年龄=" + age + " 薪水=" + sal);
		
		 
	}
}