import java.util.Scanner;
public class BreakExercise02 {
	
	public static void main(String[] args) {
		//实现登陆验证，有三次机会，如果用户名为“丁真” 密码“666”提示登陆成功
		//否则提示还有几次机会，请使用for+break完成
		
		Scanner myScanner = new Scanner(System.in);
		int chance = 3;
		String name = "";
		String password = "";
		for(int i = 1; i <= chance; i++) {
			System.out.println("请登陆您的姓名");
			name = myScanner.next();
			System.out.println("请输入您的密码");
			password = myScanner.next();
			if("門脇麦".equals(name) && "666".equals(password)) {
				System.out.println("登陆成功");
				break;
			}
			System.out.println("登陆失败" + "您还有还有" + (3 - i) + "机会");
		}
		
		
	}
}