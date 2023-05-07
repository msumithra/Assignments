class main
{
	public static void main(String[] args)
	{ 
		int[] arr={1,2,3,6,7,8,9};
		int firstMax, secondMax,thirdMax;
		if(arr.length<3)
		{
			System.out.println("Array is less than three elements");
		}
		if(arr == null)
		{	
			System.out.println("array is empty"); 
		}
		 firstMax = secondMax = thirdMax = Integer.MIN_VALUE;
		for(int i=0 ; i < arr.length ;i++ )
		{
		 	if(arr[i]>firstMax &&arr[i]!=firstMax)
		 	{
		 		firstMax = arr[i];
		 	}
		 	else if(arr[i]>secondMax && (arr[i]!=secondMax && arr[i] !=firstMax))
		 	{
		 		secondMax = arr[i];
		 	}
		 	else if(arr[i] >thirdMax && (arr[i]!= thirdMax && arr[i] != secondMax && arr[i] != firstMax ))
		 	{
		 		thirdMax = arr[i];
                        }
		}
		/*if(firstMax != Integer.MIN_VALUE)
		{
			System.out.println(firstMax);
		}
		if(secondMax!=Integer.MIN_VALUE && secondMax != firstMax)
		{
			System.out.println(secondMax);
		}*/
		if(thirdMax != Integer.MIN_VALUE && thirdMax!= secondMax && thirdMax != firstMax)
		{
			System.out.println(thirdMax);
		}
		
	}
}

