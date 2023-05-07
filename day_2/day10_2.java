/*Given an unsorted array arr[] with both positive and negative elements, the task is to find the largest positive number missing from the array.
Input:  arr[] = {2, 3, 7, 6, 8, -1, -10, 15}
Output: 14
*/

class day10_2
{
	public static void main(String[] args)
	{
		
		int[] arr={2, 3, 7, 6, 8,15};
		int min=Integer.MAX_VALUE;
		
		int max=Integer.MIN_VALUE;
		System.out.println(max+"  ***  "+min);
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
		
		int[] ans=new int[100];
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
			if(ans[i]==1)
			{
				if(i>big)
				{
					big=i;
				}
				
			}
		}
		System.out.println(big);

	}
}
