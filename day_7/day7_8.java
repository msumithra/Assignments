class day7_2 
{
   public static void main(String[] args) 
   {  
     int[] arr={1,2,4,5};
    int n=arr.length+1;
    int totalSum=(n*(n+1))/2;
    int count=0;
    
	    for(int i=0;i<n-1;i++)
	    {
	    	count+=arr[i];
	    }
	    System.out.println(totalSum-count);      
   }
}

