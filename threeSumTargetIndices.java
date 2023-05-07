/*Write a program to check to print indices of three numbers present in an array, whose sum is equal to target value ?
            Example : input  : Array = [2,3,4,6,8,1];     Target : 13

Output = 1,2,3  */

class threeSum
{
	public static void main(String[] args)
	{
		int[] arr = {2,3,4,6,8,1};
		int target = 13;
		System.out.println(threeNumEqToTarget(arr,target));
	}
	public static String threeNumEqToTarget(int[] arr , int target)
	{
		String bag = "No The sum is not equal to target";
		for(int i = 0; i < arr.length-1; i++ )
		{
			for(int j = i+1; j < arr.length-1 ; j++)
			{
				for(int k = j+1 ;j < arr.length-1 ; k++ )
				{
					if(arr[i] + arr[j] + arr[k] == target)
					{
						bag = i + "," + j + "," + k +"," +"are the indices which is equal to target" + target ;
						break;		
					}
					
				}
			}
		}
		return bag;
	}
}
                 
