/*
Write a program to move all non zeros values to the left side of an array and zero values to the right side of an array?
Input : Array = [1,1,0,1,0,1,0,1,1];
Output : [1,1,1,1,1,1,0,0,0]
*/

class day5_2
{

	public static void main(String[] args)
	{
		int[] arr={1,1,0,1,0,1,0,1,1};
		String ans="";
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==1)
			{
				ans+=arr[i]+" ";
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				ans+=arr[i]+" ";
			}
		}
		System.out.println(ans);
	}
}
