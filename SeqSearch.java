import java.util.Scanner;
public class SeqSearch {
	
	public static void main(String[] args) {
		
		String[] names = {"你好", "我不好", "門脇麦", "我很好"};
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("请输入你要寻找的对象");
		String findName = myScanner.next();
		int num1 = -1;
		for(int i = 0; i < names.length; i++) {
			if(findName.equals(names[i])) {
				System.out.println("找到了" + findName);
				System.out.println("当前下标为" + i);
				num1 = i;
				break;
			}
		}
		if(num1 == -1) {
			System.out.println("私密马森，找不到");
		}
	}
}