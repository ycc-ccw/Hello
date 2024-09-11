public class puppy {
	int puppyAge;
	public puppy(String name) {
		System.out.println("小狗的名字是" + name);
		
	}
	
	public void setAge(int age) {
		puppyAge = age;
				
	}
	
	public int getAge() {
		System.out.println("小狗的年龄" + puppyAge);
		return puppyAge;
		
	}
	public static void main (String[] args ) {
		puppy mypuppy = new puppy("yiyayi");
		mypuppy.setAge(2);
		mypuppy.getAge();
		System.out.println("变量值" + mypuppy.puppyAge);
		
	}
}