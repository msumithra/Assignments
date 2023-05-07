/*Write a program to calculate a  sum of left diagonal and right diagonal elements present in 2D arrays?
Example : Input  : [[1 3  4]
                                 [6 3 2]
                                  [9 2 10]]                          
                                         Output :  27
*/

class day3_8
{
	public static void main(String[] args)
	{
		int[][] mat={{1,3,4},{6,3,2},{9,2,10}};
		int r=3;
		int c=3;
		String bag="";
		int count=0;
		for(int i=0;i<r;i++)
		{
			for(int j=i;j<=i;j++)
			{
				bag+=mat[i][j]+" ";
				count+=mat[i][j];
				System.out.println("**********"+i+" "+j);
			}
		}
		int j=0;
		for(int i=r-1;i>=0;i--)
		{
				if(i!=j){
				bag+=mat[j][i]+" ";
				count+=mat[j][i];
				
				
				System.out.println("**********"+j+" "+i);
				
				
				}
				j++;
			
		}
		
		//System.out.println(bag);
		System.out.println("left and right diogonal sum: "+count);
		
	}
}
