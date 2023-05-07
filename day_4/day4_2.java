/*Write a program to sort an array in the descending order without an inbuilt sort method?
Example : input : [2,8,6,5,9,4,7]
                 Output : [9,8,7,6,5,4,2]
*/

class day4_2
{
	public static void main(String[] args)
	{
		int[] arr={2,8,6,5,9,4,7};
		//int i=0;
		//int j=0;
		String bag="";

		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					//bag+=arr[i]+" ";
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		//System.out.println(bag);
	}
}
