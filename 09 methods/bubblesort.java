class bubblesort
{
	static int[] bubblesort(int []inputArray)
	{
		int n = inputArray.length;
		int temp = 0;
		for (int i = 0; i < n; i++)
		{
			for (int j = 1;j < (n-1); j++)
			{
				if (inputArray[j-1] > inputArray[j])
				{
					temp = inputArray[j-1];
					inputArray[j-1] = inputArray[j];
					inputArray[j] = temp;
				}
			}
		}
		return inputArray;
	}
	public static void main(String args[])
	{
		int z[] = {95,55,75,65,25}
		System.out.println("Display of input array");
		for (int i = 0;i< z.length ;i++ )
		{
			System.out.println("z[" + i +"] = "+z[i]);
		}
		int res[] = bubblesort(z);
	}
}