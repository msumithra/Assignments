/*Write a program to print bellow pattern
 * * * *
 *     *
 *     *
 * * * *    */
 
 
 class day5_8
 {
 	public static void main(String[] args)
 	{
 		 int n = 5; 
		String string = "";
        
       		for(int i = 0; i < n; i++)
       		 { 
  			for(int j = 0; j < n; j++)
  			 { 
    				if(i == 0 || i == n - 1)
    				 {
     					 string += "*"+" ";
   				 }
   				 else
   				 {
      					if(j == 0 || j == n - 1) 
      					{
        					string += "*"+"    ";
     					}
      					else
      					{
        					string += " ";
					}
				}
			}
							
   			string += "\n";
		}
	
		System.out.println(string);
 	}
 }
