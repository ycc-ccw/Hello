import java.util.Scanner;
public class DoWhileExercise02 {
	
	public static void main(String[] agrs) {
		//如果李三不还钱，则老韩将一直使出五连鞭，直到李三说还钱为止
		//[System.out.println("老韩问：还钱吗？y/n")] do...while ..
		//DoWhileExercise02.java
		
		Scanner myScanner = new Scanner(System.in);
		char answer = ' ';
		do {
			System.out.println("打死你");
			System.out.println("老韩问：还钱吗");
			answer = myScanner.next().charAt(0);
			System.out.println("他的回答是" + answer);
		}while(answer != 'A');
		System.out.println("只要还钱就还是一个好孩子");
		
		System.out.println("---------------\n---------------");
		
		Scanner myScanner1 = new Scanner(System.in);
		char answer1 = ' ';
		do {
			System.out.println("你在干什么");
			answer1 = myScanner1.next().charAt(0);
			System.out.println("他的回答是" + answer1);
		}while(answer1 != 'B');
		System.out.println("就知道玩游戏");
	}
}