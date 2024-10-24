public class TernaryOperator {
	
	public static void main(String[] args) {
		
		int n1 = 553;
		int n2 = 33;
		int n3 = 123;
		//思路
		//1.先得到n1 和 n2 中最大数 保存到 max1
		//2. 然后求出max1 和 n3中的最大数 保存到max2
		int max1 = n1 > n2 ? n1 : n2;
		int max2 = max1 > n3 ? max1 : n3;
		System.out.println("三个数最大的是=" + max2);
	}
}