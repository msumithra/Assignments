/*Write a program to find the k largest missing number present in the array
Input: arr[] = {2, 8, 7,3 , 5, 9, 11}   K = 3
Output: 8
*/

class day9_2
{
	public static void main(String[] args)
	{
		int[] arr={2,8,7,3,5,9,11};
		int k=3;
		
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
				//System.out.println(i);
				
				//big=ans[i];
			}
		}
		System.out.println(big);
	}
}
