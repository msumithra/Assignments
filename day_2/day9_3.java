/*
Write a program to find the all missing number prime numbers  present in an array
            Input: arr[] = {2, 8, 7,4 , 6, 9, 11} 3,5,8,10
            Output:   3, 5
*/

/*class day9_3
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
}*/

class day9_3
{
	public static void main(String[] args)
	{
		int[] arr={2, 8, 7,4 , 6, 9, 11};
		
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		
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
		}
		
		//System.out.println("min : "+min+" , "+"max : "+max);
		
		int[] ans=new int[1000];
		for(int i=0;i<arr.length;i++)
		{
			ans[arr[i]]+=1;
			
		}
		for(int i=min;i<=max;i++)
		{
			ans[i]+=1;
		}
		int big=0;
		for(int i=0;i<ans.length;i++)
		{
			if(ans[i]==1 && isprime(arr[i]))
			{
				
				System.out.println(i);
				
				
			}
		}
		System.out.println(big);
	}
	public static boolean isprime(int n)
	
	{
		
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				return true;
			}
		}
		return false;
	}
}
