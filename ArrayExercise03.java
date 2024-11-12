public class ArrayExercise03 {
	
	public static void main(String[] args) {
		
		double num[] = {1,2.8,3.6,4};
		double sum = 0;
		for(int i = 0; i < num.length; i++) {
			sum += num[i];
			
		}
		System.out.println("sum=" + sum + "平均值为=" + sum / 4);
	}
}