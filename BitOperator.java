public class BitOperator {
	
	public static void main(String[] args) {
		
		//按位与演示
		//2的源码 00000000 00000000 00000000 00000010
		//2的补码 00000000 00000000 00000000 00000010
		//3的源码 00000000 00000000 00000000 00000011
		//3的补码 00000000 00000000 00000000 00000011
		//运算&
		//00000000 00000000 00000000 00000010
		//00000000 00000000 00000000 00000011
		//00000000 00000000 00000000 00000010 & 运算后的补码
		
		System.out.println(2 & 3);//2
		//-2的源码 10000000 00000000 00000000 00000010
		//-2的反码 11111111 11111111 11111111 11111101
		//-2的补码 11111111 11111111 11111111 11111110
		//～-2的操作 00000000 00000000 00000000 00000001
		System.out.println(~-2);//1
		//2的补码   00000000 00000000 00000000 00000010
		//～2的操作 11111111 11111111 11111111 11111101 运算后的补码
		//运算后的反码 11111111 11111111 11111111 11111100
		//运算后的源码 10000000 00000000 00000000 00000011 
		System.out.println(~2);//- 3
		//2的补码 00000000 00000000 00000000 00000010
		//3的补码 00000000 00000000 00000000 00000011
		//运算   00000000 00000000 00000000 00000011
		System.out.println(2 | 3);//3
		//2的补码 00000000 00000000 00000000 00000010
		//3的补码 00000000 00000000 00000000 00000011
		//运算   00000000 00000000 00000000 00000001
		System.out.println(2 ^ 3);//1
		//-5的源码 10000000 00000000 00000000 00000101
		//-5的反码 11111111 11111111 11111111 11111010
		//-5的补码 11111111 11111111 11111111 11111011
	    //～-5的操作 00000000 00000000 00000000 00000100
		System.out.println(~-5);//4
		//13的源码 00000000 00000000 00000000 00001101
		//13的补码 00000000 00000000 00000000 00001101
		//7的源码  00000000 00000000 00000000 00000111
		//7的补码  00000000 00000000 00000000 00000111
		//运算 00000000 00000000 00000000 00001101
		//运算 00000000 00000000 00000000 00000111
		//结果 00000000 00000000 00000000 00000101
		System.out.println(13 & 7);//5
		//5的补码 00000000 00000000 00000000 00000101
		//4的补码 00000000 00000000 00000000 00000100
		//结果   00000000 00000000 00000000 00000101
		System.out.println(5 | 4);//5
		//-3的源码 10000000 00000000 00000000 00000011
		//-3的反码 11111111 11111111 11111111 11111100
		//-3的补码 11111111 11111111 11111111 11111101
		//3的补码  00000000 00000000 00000000 00000011
		//运算结果 11111111 11111111 11111111 11111110
		System.out.println(-3 ^ 3);
		
		
		
		
		
	}
}