class day7_10
{
	public static void main(String[] args)
	{
		int[] arr={3, 3, 4, 2, 4, 4, 2, 4, 4};
		int n=arr.length;
		int maxCount=0;
		int freq=0;
		for(int i=0;i<n;i++)
		{
			int count=0;
			for(int j=0;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			if(count>maxCount)
			{
				maxCount=count;
				freq=arr[i];
			}
			
		}
		if(maxCount>n/2)
			{
				System.out.println(freq);	
			}
	}
}



