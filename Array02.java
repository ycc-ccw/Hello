import java.util.Scanner;
public class Array02 {
	
	public static void main(String[] args) {
		
		double scores[] = new double[5];
		
		Scanner myScanner = new Scanner(System.in);
		for(int i = 0; i < 5; i++) {
			System.out.println("请输入第" + (i + 1) + "个元素第值");
			scores[i] = myScanner.nextDouble();
			
		}
		for(int i = 0; i < 5; i++) { 
			System.out.println("第" + (i + 1) + "的元素值为" + scores[i]);
		}
	}
}