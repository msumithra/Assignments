import java.util.*;
class day3_1
{
	public static void main(String[] args)
	{
		int[] arr={6,5,4,3,2,1};
		Arrays.sort(arr);
		
		int n=arr.length;
		
		int ans=n-3;
		
		System.out.println("Third Largest : "+arr[ans]);
		System.out.println("Second Minimum : "+arr[2-1]);
		
		
	}

}
