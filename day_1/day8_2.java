/*Write a program to find the k largest missing number present in the array
Input: arr[] = {2, 8, 7,3 , 5, 9, 11}   K = 3
Output: 8
*/

import java.util.*;
class day8_2
{
	public static void main(String[] args)
	{
		int[] arr={2, 8, 7,3 , 5, 9, 11};
		int k=3;
		Arrays.sort(arr);

		int n=arr.length;

		int ans=n-k;

		System.out.println("Third Largest : "+arr[ans]);
		//System.out.println("Second Minimum : "+arr[2-1]);
	}
}
