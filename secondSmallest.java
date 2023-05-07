
package arrayprograms;
public class secondSmallest extends Thread
{
	public static void main(String[] args)
	{
		int arr[] = {8,2,3,4,6,1,5};
		int n = arr.length;
		int newArr[] = new int [n+1];
		
		//int arrWithoutDuplicates = {8,2,3,4,6,1,5};
		
		int temp,size;
		size=arr.length;
		System.out.println("array is" + size);
		
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]= arr[j];
					arr[j] =temp;
				}
			}
		}
			
		System.out.println();
		//System.out.println("Elements of array are:  ");
		for(int i=0 ;i<size-1;i++)
		{
			System.out.println( arr[i]+" ");
			
			if(arr[i]==arr[i+1])
			{
				newArr[i]=arr[i];
				//return newArr;
				System.exit(0);
				
			}
			//newArr[n] = value;
		}
		System.out.println(newArr);
		System.out.println("The SecondSmallest element is:"+arr[size-2]);
	}
}

		
