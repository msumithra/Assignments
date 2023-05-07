/*
Write a program to check to print indices of three numbers present in an array, whose sum is equal to target value ?
            Example : input  : Array = [2,3,4,6,8,1];     Target : 13
                 Output = 1,2,3

*/


public class day3_6
{
	public static void main(String[] args)
	{
		int arr[] = {2,3,4,6,8,1};
		 	int sum = 13;
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i; j < arr.length; j++)
			{
				int subarrsum = 0;
				String subarr =   "";
				for(int f = i; f <= j; f++)
				{
					subarrsum += arr[f];
					subarr+=f+" ";
				}
				if(subarrsum == sum)
				{
					System.out.println(subarr);
				}	
				
				
			
			}
		
		}
	
	}
}
