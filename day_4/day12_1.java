/*Write a program to implement a stack  and its operations like push, pop, top of the stack using arrays?
Example : Array = [2,3,4,5,6]
*/
import java.util.Scanner;

class day12_1
{
	public static void main(String[] args)
	{
		
		Scanner input=new Scanner(System.in);
		
		int[] res=new int[100];
		
		int peak=-1;
		System.out.print("number of operations : ");
		
		int num=input.nextInt();
		
		//System.out.println(num);
		
		
		
		
		for(int i=0;i<num;i++)
		{
			System.out.print("Enter Type of operation ->"+(i+1)+":");
		        String operation=input.next();	
			
			if(operation.equals("push"))
			{
				if(peak<=100)
				{
					
					
					System.out.print("Enter value to push :  ");
					int value=input.nextInt();
				        peak++;
				       
				        res[peak]=value;
				}
				else
				{
					System.out.println("Stack overFlow");
				}
			}
			else if(operation.equals("pop"))
			{
				if(peak==-1)
				{
					
					System.out.println("Stack underFlow");
					
				}
				else
				{
					System.out.print(res[peak]);
					peak--;
				}
			
			}
			else if(operation.equals("peak"))
			{
					System.out.println(res[peak]+" ");
			}
			//System.out.println();
			
		}
		
		for(int i=0;i<=peak;i++)
		{
			System.out.println(res[i]+" ");
		}
		
	}
}
