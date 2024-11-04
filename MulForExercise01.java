public class MulForExercise01 {
	
	public static void main(String[] args) {
		
		//打印99乘法表
		 int num1 = 1;
	     for(int a = num1;a <= 9;a++) {
		     for(int b = 1;b <= a;b++) {
			     System.out.print(b + " * " + a + " = " + (b * a) + "\t");
			     
		    }
		     System.out.println("\n");
		}
		     
	}
}