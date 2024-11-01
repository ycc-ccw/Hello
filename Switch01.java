import java.util.Scanner;
public class Switch01 {
	
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入一个字符（a - b）");
		char c1 = myScanner.next().charAt(0);
		
		switch(c1) {
		case 'a' :
			System.out.println("今日は火曜日です");
			//break;
		case 'b' :
			System.out.println("世界は今から君のもの");
			break;
		case 'c' :
			System.out.println("良くできました");
			break;
		default :
			System.out.println("入力ミスです");
			
		}
		
		System.out.println("switchが終わり、引き続き実行します");
		
	}
 
}