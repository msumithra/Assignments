/*Write a program to print the occurrence of every element present in an array?
 Example : input : [2,5,6,5,6,9,9,7,2,9]
                  Output : 2 : 2, 5 : 2, 6 : 2, 9 : 3, 7 : 1
*/

class day4_3
{
	public static void main(String[] args)
	{
		int[] arr={2,5,6,5,6,9,9,7,2,9};
		int n=arr.length;
		int[] target=new int[10];
		for(int i=0;i<n;i++)
		{
			target[arr[i]]+=1;
		}
		for(int j=0;j<target.length;j++)
		{
			if(target[j]>0)
			{
				System.out.println(j+":"+target[j]);
			}
		}
		
	
	}
}
