class fast
{
	public static void main(String[] args)
	{
		int x=2;
		int[] arr={1,1,2,2,2,2,3};
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==x)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
