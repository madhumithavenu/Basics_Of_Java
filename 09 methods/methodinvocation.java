class methodinvocation
{
	static int add(int a, int b)
	{
		int c = a + b;
		return c;
	}
	public static void main(String args[])
	{
		int result = add(55,65);
		System.out.println("Sum is"+ result);
		System.out.println("sum of 10 & 15 is " +add(10,15));
	}
}