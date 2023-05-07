class main
{
	public static void main(String[] args)
	{
		int[] arr = {1, 1, 2, 2, 2, 2, 3};
		System.out.println(xOccurences(arr , 2));
	}
	public static int xOccurences(int[] arr,int x)
	{
		int count = 0;
		for(int i=0 ;i<arr.length;i++)
		{
			if(arr[i] == x)
			{
				count++;
			}
		}
		return count;
	}
}
