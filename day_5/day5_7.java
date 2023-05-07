/*Write a program to print indices of 2 elements in an array, Whose difference is equal to target value
Input : [1,8,2,3,9,4,5];   Target Value : 8
Output : 0 4
*/

class day5_7
{
	public static void main(String[] args)
	{
		int[] arr={1,8,2,3,9,4,5};
		//int arr=Arrays.sort(arr1);
		int target=8;
		String ans="";
		for(int i=0;i<arr.length;i++)
		{
		
			for(int j=i+1;j<arr.length;j++)
			{
				if(Math.abs(arr[i]-arr[j]) == target)
				{
					ans+=i+" "+j;
				}
			}
		
		}
			
		System.out.println(ans);
	}
}
