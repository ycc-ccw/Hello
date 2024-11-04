import java.util.Scanner;
public class MuForExercise01 {
    //1) 统计 3 个班成绩情况，每个班有 5 名同学，
	//)  求出各个班的平均分和所有班级的平均分[学生的成绩从键盘输入]。
    //2) 统计三个班及格人数，每个班有 5 名同学。
	
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int passNum = 0;
		double sum = 0;
		for(int i = 1;i <= 3;i++) {
			double sum1 = 0;
			for(int num = 1;num <= 5;num++) {
				System.out.println("第" + i + "个班的第" + num + "个学生的成绩");
				double score = myScanner.nextDouble();
				if(score >= 60) {
					passNum++;
				}
				System.out.println("成绩为" + score);
				sum1 += score;
				sum += score;
			   }
			System.out.println("sum1=" + sum1 + "第" + i + "个班的平均分为" + (sum1 / 5));
			
		   }
		System.out.println("总分是" + sum +"所有班级的平均分为" +(sum / 15));
		System.out.println("合格人数为" + passNum);
	
	}
}