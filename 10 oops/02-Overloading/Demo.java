class Math
{
	void add()
	{
		System.out.println("Please provide the numbers");
	}
	void add(int a,int b)
	{
		System.out.println("Sum of two integers is="+(a + b));
	}
	void add(double a,double b)
	{
		System.out.println("Sum of two double precision floating point is ="+ (a + b));
	}
	void add(long a,long b)
	{
		System.out.println("Sum of two long numbers is =" +(a+b));
	}
}
class Demo
{
	public static void main(String args[])
	{
		Math m = new Math();
		m.add();
		m.add(5,6);
		m.add(22.18,3.94);
		m.add(7795L,8576L);
	}
}