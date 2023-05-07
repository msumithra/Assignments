/* Write a program to print below pattern

		*
		*_ *
		*_*_*
		*_*_*_*

*/

class day5_9
{
	public static void main(String[] args)
	{
		int n=6;
		String ans="";
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i==j)
				{			
		 			System.out.print("*");
		 		}
				else
				{
					System.out.print("*_");

				}
				
			}
			System.out.println();
		}
	}
}




