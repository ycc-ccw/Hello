public class ArrayExercise02 {
	
	public static void main(String[] args) {		
		int arr[] = {4,-1,9,10,23,20,88,99,77,66};
		int max = arr[0];
		int maxIndex = 0;
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
				maxIndex = i;		
			}
		}
		
		System.out.println("max=" + max + "最大值第下标是第" + maxIndex + "个");
		
	}
} 