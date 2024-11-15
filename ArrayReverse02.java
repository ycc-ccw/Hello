public class ArrayReverse02 {
	
	public static void main(String[] agrs) {
		
		int arr1[] = {11, 22, 33, 44, 55, 66};
		int arr2[] = new int[arr1.length];
		for(int i = arr1.length - 1; i >= 0; i--) {
			arr2[arr1.length - i -1] = arr1[i];
		}
		System.out.println("＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝");
		arr1 = arr2;
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(arr2[i]);
		}
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}

		
	}
}