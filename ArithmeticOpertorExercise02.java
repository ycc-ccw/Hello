public class ArithmeticOpertorExercise02 {
	
	public static void main(String[] args) {
		
		//问题1 假如还有59天放假，问：合xx个星期零xx天
		int days = 529;
		int weeks = days / 7;
		int leftDays  = days%7;
		System.out.println("合" + weeks + "个星期" + "零" + leftDays + "天");
		
		//问题2 定义一个变量保存华氏温度
		//华氏温度转换摄氏温度的公式为：5/9*（华氏温度-100）
		//请求出华氏温度对应的摄氏温度
		double b = 234.5;
		double n = 5.0 / 9 * (b - 100);
		System.out.println("摄氏温度是" + n);
	}
}