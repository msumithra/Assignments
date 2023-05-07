class day11_4
{
	public static void main(String[] args)
	{
		int[][] arr={{1,2,3,4,5,6,7,8,},{9,10,9,5,5,0,8,8},{7,5,2,0,9,6,0,3},{0,9,2,9,5,9,9,3},{8,1,4,1,9,1,3,1},		
		{9,1,3,3,0,8,6,1},{0,7,9,3,8,9,4,6},{5,7,5,9,1,4,3,7}};
		int n=8;
		int t=0;  int b=n;  int l=0; int r=n;
		String left="";
		String right="";
		while(t<=b && l<=r)
		{
			for(int i=t;i<b;i++)
			{
				if(i==t || i==b-1)
				{
				
				    if(i%2==1)
				    {
				       
				       if(isPrime(arr[i][i]))
				       {
				           left+=arr[i][i]+" ";
				       }
				    }
				}
			}
			int m=t;
			for(int i=r-1; i>=l; i--)
			{
				if(i==t || i==b-1)
				{
					
					if(i%2==0)
					{
					   if(isPrime(arr[i][m]))
				       {
				           right+=arr[i][m]+" ";
				       }
					}
				}
				m++;
			}
		
		
		t++;
		b--;
		l++;
		r--;
		}
		System.out.println("left:"+left);
		System.out.println("right:"+right);
	}
	
	
    public static boolean isPrime(int n) 
    {  
       if (n <= 1) {  
           return false;  
       }  
       int c=0;
       for (int i = 2; i < n; i++) 
       {  
           if (n % i == 0) 
           {   
              c++;
           }  
       }  
       if(c==0)
       {
           return true;
       }
        return false; 
   }  
}  
