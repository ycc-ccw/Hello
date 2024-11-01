import java.util.Scanner;
public class SwitchExercise {
	
	public static void main(String[] args) {
		//使用switch把小写类型的char转为答谢（键盘输入）。
		//只转换a，b，c，d，e。
		//其他的输出“other”
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入一个字符（ a - b ）");
		char c1 = myScanner.next().charAt(0);
		
		switch(c1) {
		case 'a' :
			System.out.println('A');
			break;
		case 'b' :
			System.out.println('B');
			break;
		case 'c' :
			System.out.println('C');
			break;
		case 'd' :
			System.out.println('D');
			break;
		case 'e' :
			System.out.println('E');
			break;
		default :
			System.out.println("other");
		}
		
		//对于学生成绩大于60分的，输出“合格”。
		//低于60分的输出“不合格”（输出的成绩不能大于100）提示 成绩/60
	
		System.out.println("请输入成绩");
		double score = 88.5;
		if(score >= 0 && score <= 100) {
			
		   switch((int)score / 60) {
		   case 0 :
			   System.out.println("不合格");
			break;
		   case 1 :
			   System.out.println("合格");
       
		   }
		   
		}else {
			System.out.println("您的成绩输入有误，请重新输入");
		}
		
		//根据用于指定月份，打印该月份所属的季节。3，4，5为春季，
		Scanner myScanner1 = new Scanner(System.in);
		System.out.println("请输入一个月份");

		int season =  myScanner1.nextInt();
		if(season >=1 && season <= 12 ) { 
		switch(season) {
		    case 3,4,5 :
			    System.out.println("春季");
		    break;
		    case 6,7,8 :
		  	    System.out.println("夏季");
		    break;
		    case 9,10,11 :
			    System.out.println("秋季");
		    break; 
		    case 12,1,2 :
		  	    System.out.println("冬季");
		    break;
		
		    }
		}else {
			System.out.println("您输入的数字有误，请重新输入");
			
		}
	}
}