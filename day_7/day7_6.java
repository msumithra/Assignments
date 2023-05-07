/*Write a program to find intersection of two sorted arrays
Input: arr1[] = {1, 3, 4, 5, 7}
        arr2[] = {2, 3, 5, 6} 
Output: Intersection : {3, 5}
*/

class day7_6
{
	public static void main(String[] args){
	
		int ar1[] = {1, 3, 4, 5, 7};
        	int ar2[] = {2, 3, 5, 6} ;
		String result = "";
		for(int i=0;i<ar1.length;i++)
		{
			for(int j=0;j<ar2.length;j++)
			{
				if(ar1[i]==ar2[j])
				{
					result += ar1[i]+" ";
				}
				
			}
		}
		System.out.println(result);
	}
}
