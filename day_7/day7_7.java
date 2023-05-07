/*Write a program to find a peak element, which is not smaller than its neighbors
Input : array[] = {5,10,20,15}
Output : 20
*/

class day7_7
{
	public static void main(String[] args)
	{
		int array[] = {5,10,20,150};
		int max=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i] > max)
			{
				max=array[i];
			
		        }
		}
		
		System.out.println(max);
	}
}


/*class day7_7
{
	public static void main(String[] args)
	{
		int array[] = {5,10,20,15,2,100};
		int n=array.length;
		int max=0;
		int ans=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i] > max)
			{
				max=array[i];
				if(max>array[i-1] && max>array[i+1] && max!=array[n-1])
				{
					ans=max;
					//break;
				}
				else
				{
					for(int j=0;j<array.length-1;j++)
					{
						max=array[j];
						ans=max;
					}
				}
			
		        }
		        else
		        {
		        	System.out.println("There is no any peak value");
		        }
		}
		
		System.out.println(ans);
		
		
	}
}*/

