public class BubbleSort {
	
	public static void main(String[] args) {
		//冒泡排序
		int[] arr = {24, 90, 80, 57, 13, 200 , -1, -22};
		int temp = 0;
		for(int i = 0; i < arr.length - 1; i++) {
		    for(int j = 0; j < arr.length - 1 - i; j++) {
		    	if(arr[j] > arr[j + 1]) {
			    	temp = arr[j];
			    	arr[j] = arr[j + 1];
			    	arr[j + 1] = temp;
			     }
		    }
		        System.out.println("\n==第" + (i + 1) + "轮===");
		    for(int j = 0; j < arr.length; j++)  {
		    	System.out.print(arr[j] + "\t");
		    }
		
		}
	}
}