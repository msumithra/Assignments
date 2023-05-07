class elementTarget
{
	public static void main(String[] args)
	{
		int[] array = {1,1,1,1,1};
		int target = 13;
		System.out.println(arraytarget(array, target));
	}	
		
		public static String arraytarget(int[] array, int target)
		{
			String flag = "No :"+ "sum is not equal to target";
		    	for(int i=0;i<array.length-1;i++)
		    	{
		    		for(int j=i+1;j<array.length-1;j++)
		    		{
		    			for(int k = j+1;k<array.length-1;k++)
		    			{
			       			if(array[i]+array[j] + array[k]==target)
			       			{
							flag = "the index values of "+ i+ "," + j+ "," + k + "=" +target ;
							break;
			       			}
			       		}	
		    		}
		  
		    	}
    			return flag;
		}
	
}
