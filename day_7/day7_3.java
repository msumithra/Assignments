class day7_3
{
	public static void main(String[] args)
	{
		int[] arr={0,-10,8,-20,-1,3,-9};
		String bag="";
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				bag+=arr[i]+", ";
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				bag+=arr[i]+", ";
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0)
			{
				bag+=arr[i]+", ";
			}
		}
		
		System.out.println(bag);
	}
}
