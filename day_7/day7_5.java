/*Write a program to find union of two sorted arrays
Input: arr1[] = {1, 3, 4, 5, 7}
        arr2[] = {2, 3, 5, 6} 
Output: Union : {1, 2, 3, 4, 5, 6, 7} 
*/

class day7_5 
{
	
	public static void main(String args[])
	{
		int arr1[] = {1, 3, 4, 5, 7};
		int arr2[] = {2, 3, 5, 6};
	        int i = 0, j = 0;
	        String ans="";
	        
		while (i < arr1.length && j < arr2.length) 
		{
			if (arr1[i] < arr2[j])
			{
				ans+=arr1[i]+" ";
				i++;
			}
			else if (arr2[j] < arr1[i])
			{
				ans+=arr2[j]+" ";
				j++;
			}
			else 
			{
				ans+=arr2[j]+" ";
				j++;
				i++;
			}
		}
		
		while(i<arr1.length)
		{	
			ans+=arr1[i]+" ";
			i++;
		}
		
		while(i<arr2.length)
		{
			ans+=arr2[j]+" ";
			j++;
		}
		System.out.println(ans);
	}
}


