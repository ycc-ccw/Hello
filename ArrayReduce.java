import java.util.Scanner;
public class ArrayReduce {
	
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		int[] arr = {1, 2, 3, 4, 5};
	do {
		int[] arrNew = new int[arr.length - 1];
		//遍历arr
		for(int i = 0; i < arr.length -1; i++) {
			arrNew[i] = arr[i];
		}
		arr = arrNew;
		//打印 arr
		for(int i = 0; i < arr.length; i++) {	
		System.out.print(arr[i] + "\t");
	    }
		System.out.println("是否继续缩减 y/n");
		char key = myScanner.next().charAt(0);
        if(key == 'n' || arr.length == 1) {
			break;
		}
       
	  }while(true);
		System.out.println("结束");
	}
}