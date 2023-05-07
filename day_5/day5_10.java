class day5_10
{
	public static void main(String[] args)
	{
		int n=10;
		int ans1=0;
		int ans2=0;
		for(int i=1;i<n;i++)
		{
			int count=0;
			
			for(int j=2;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;	
				}
			}
			if(count==1)
			{
				//System.out.println(i);
				if(i%2==0)
				{
					ans1++;
				}
				else
				{
					ans2++;
				}
			}
			
		}
		
		System.out.println("Even primes count : "+ans1);
	       System.out.println("odd primes count : "+ans2);
	}
}
