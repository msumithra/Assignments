import java.util.Scanner;
class day7_1
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Array Length:");
		int n=obj.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter Array elements:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=obj.nextInt();
		}
		
		String bag="";
		
		//System.out.println("o's:");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				bag+=arr[i]+" ";
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==1)
			{
				bag+=arr[i]+" ";
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==2)
			{
				bag+=arr[i]+" ";
			}
		}
		
		System.out.println(bag);
		
	}
}
