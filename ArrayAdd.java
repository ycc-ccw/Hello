import java.util.Scanner;
public class ArrayAdd {
	
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		int[] arr = {1,2,3};
	do {
		int[] arrNew = new int[arr.length + 1];
		for(int i = 0; i < arr.length; i++) {
			arrNew[i] = arr[i];
		}
		System.out.println("请输入新的元素");
		int addNum = myScanner.nextInt();
		//把4赋给arrnew最后一个元素 
		arrNew[arrNew.length - 1] = addNum;
		//让 arr 指向 arrnew
		arr = arrNew;
		 
		System.out.println("是否继续添加 y/n");
		char key = myScanner.next().charAt(0);
		if( key == 'n') {
			break;
		 }
	  }while(true);
	   
	   System.out.println("结束");
	
   }
}