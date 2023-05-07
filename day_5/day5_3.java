/*Write a program to print all the substrings of a string whose length is equal to K value?
Input : String  = “jtdfoundation”     K = 3;

*/

class day5_3
{
	public static void main(String[]args)
	{
		int[] arr={1,4,20,3,10,5};
		int m=27;
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				String substr="";
				for(int k=i;k<=j;k++)
				{
					substr+=arr[k]+" ";
				}
				/*if(substr.length()==m)
				{
					System.out.println(substr);
				}*/
				System.out.println(substr);
				for(int i=0;i<substr.length();i++)
				{
					sum+=substr[i];
					if(sum==m)
					{
						System.out.println(i);
					}
				}
			
			}
			
		
		}
	
	
	}
}
// https://github.com/bhavanakoguru/DSA-jtd
