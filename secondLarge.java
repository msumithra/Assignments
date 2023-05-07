class main{
    public static void main(String[] args){
        int[] arr={2,-2,12,1,14,1,9,7};
        int max=0;
        int secondMax=0;
        int thirdMax=0;
        int min= arr[0];
        int secondMin=arr[0];
        int thirdMin=arr[0];
        //int thirdMin=arr[0];
        
      
        
        
        System.out.println(findThirdMax(arr,max, secondMax, thirdMax));
        System.out.println(findSecondSmallest(arr,min,secondMin,thirdMin));
        }
        
       //Finding third maximum element
        public static int findThirdMax(int[] arr ,int max,int secondMax,int thirdMax)
        {
        	for(int i=0;i<arr.length;i++)
        	{
            		if(arr[i]>max)
            		{
                		secondMax=max;
                		max=arr[i];
            		}
            		else if(arr[i]>secondMax)
            		{
            			thirdMax=secondMax;
                		secondMax=arr[i];
            		}
       	 	}
       	 	return thirdMax;
    	}
    	
    	public static int findSecondSmallest(int[] arr ,int min,int secondMin,int thirdMin)
    	
    	{
    		int bag=0;
    		for(int i=0;i<arr.length;i++)
    		{
    	
    			if(arr[i]<min && arr[i]!=min)
    			{
    				secondMin=min;
    				min=arr[i];	
    			}
    			
    		        // else if(arr[i]< secondMin)
    			//{
    				//secondMin=arr[i];
    				//thirdMin=secondMin;
    		           
    						
    			//}
    			//else if(secondMin<=thirdMin && secondMin!=thirdMin)
    			//{
    				//bag=bag+secondMin;
    				//return bag;
    			//}
    			//else if(secondMin>=thirdMin && (secondMin!=thirdMin))
    			//{
    				//thirdMin=arr[i];
    				//return thirdMin;	
    			//}
    			if(arr[i]<secondMin && min<secondMin && arr[i]!=secondMin)
    			{
    				secondMin=arr[i];
    				}
    		        }if(arr[i]<thirdMin && secondMin<=thirdMin && arr[i]!=thirdMin)
    		        {
    		              thirdMin=arr[i];
    		        }
    		     return min;   
    		
    		}
    		//return fourthMin;
    		
}
}
     
