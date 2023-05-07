/*Write a program to print the next greater element present in an array?
Example : Input: arr[] = [ 4 , 5 , 2 , 25 ]
                Output:  4      –>   5
                              5      –>   25
                               2      –>   25
                               25     –>   -1
*/

/*class day12_2
{
	public static void main(String[] args)
	{
		int[] arr={4,2,2,25};
		
		int s=0;
		int e=1;
		
		while(s<arr.length && e<arr.length)
		{
		
			while(s<e)
			{
				if(arr[s]<arr[e])
				{
					System.out.println(arr[s]+"->"+arr[e]);
					s++;
					e++;
					
				}
				if(arr[s]>=arr[e])
				{
					e++;
				}
				
			}
			s++;
		}
		s++;
		e++;
		
		
	}
}*/

    public class day12_2
    {    
	    public static void main(String argvs[])  
	    {  

		  
		    int[] arr={4,6,2,25};
		      
		    int size = arr.length; 
		     
		    for(int i = 0; i < size; i++)  
		    {  
		    		int temp = -1;  
		    		
		    	for(int j = i + 1; j < size; j++)  
		    	{  
				if(arr[j] > arr[i])  
				{  
				   temp = arr[j]; 
				   break   ;
				}  
			  
			}  
			if(temp != -1)  
			{  
			    System.out.println( arr[i] + " ->  " + temp);  
			}  
			    else  
			{  
			    System.out.println( arr[i] + "->  -1 ");  
			}  
		    }  
	    }  
    }  
