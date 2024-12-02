public class TwoDimensionalArray {
	
	public static void main(String[] args) {
		
		int[][] arr = {{0, 0, 0, 0, 0, 0}, 
				       {0, 0, 1, 0, 0, 0},
				       {0, 2, 0, 3, 0, 0},
				       {0, 0, 0, 0, 0, 0},};
		//打印二维数组有多少元素
		System.out.println("二维数组有多少元素=" + arr.length);
		//查找第二行第三个数值
		System.out.println(arr[2][3]);
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j< arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
				
			}
			System.out.println(" ");
		}
	}
}