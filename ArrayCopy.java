public class ArrayCopy {
	
	public static void main(String[] args) {
		
		int arr1[] = {10, 20, 30};
		int arr2[] = new int[arr1.length];
		for(int i = 0; i < arr1.length; i++ ) {
			arr2[i] = arr1[i];
		}
		
		arr2[1] = 100;
		arr2[2] = 9000;
		System.out.println("arr1的元素为");
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("arr2的元素为");
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	} 
}