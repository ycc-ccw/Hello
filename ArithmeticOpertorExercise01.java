public class ArithmeticOpertorExercise01 {
	
	public static void main(String[] args) {
		
		int i = 1;
		i = i++;
		System.out.println(i);
		
		int u = 1;
		u = ++u;
		System.out.println(u);
		
		int c1 = 10;
		int c2 = 20;
		int c = c1++;
		System.out.print("c=" + c);//10
		System.out.println("c2=" + c2);//20
		c = --c2;
		System.out.print("c=" +c);//19
		System.out.println("c2=" + c2);//19 
		
	}
 	
}