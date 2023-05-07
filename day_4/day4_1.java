class day4_1
{
	public static void main(String[] args)
	{
		int[] arr={1,3,2,4,6,5};
		int min=arr[0];
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}System.out.println(min+max);
		
		if((min+max)%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("odd");
		}
		
	}
}
