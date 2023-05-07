/*Write a program for 90 degrees  rotation of  all elements present in a 2d array?
Example : Input 1 : [[1 3  4]
                                 [6 3 2]
                                  [9 2 10]]                          
                                        Output1 :  [[9 ,6, 1],[2,3,3],[10,2,4]]  
*/

class day4_7
{
	public static void main(String[] args)
	{
		int[][] arr={{1,3,4},{6,3,2},{9,2,10}};
		int r=3;
		int c=3;
		String bag="";
		
		
		for(int j=0;j<c;j++){
		for(int i=r-1;i>=0;i--)
		{
			bag+=arr[i][j]+" ";
		}
		}
		
		
		
		System.out.println(bag);
		
		
	}
}
