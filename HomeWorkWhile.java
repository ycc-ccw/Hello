public class HomeWorkWhile {
	
	public static void main(String[] agrs) {
		
		//1.实现如下功能
		//某人有100000元，每经过一次路口，需要缴费，规则如下
		//（1）当现金 >= 50000时，每次缴费5%
		//（2）当现金 <= 50000时，每次缴费1000
		//编程计算该人可以经过多少次路口，要求while break方式完成；
		int count = 0;
		double money = 100000;//余额
		while(true) {
			if(money >= 50000) {
			   money = money - (money * 0.05);
			} else if(money >= 1000 && money <= 50000) {
			    money = money - 1000;
		    } else if( money < 1000) {
				break;
			}
			count++;
		}
		System.out.println("该人可以经过" + count + "次路口");
		
	}
}