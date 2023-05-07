class bookingTicket
{
    public static char[][] balcony = new char[8][25];
    public static char[][] SecondClass = new char[24][25];
    public static final String ANSI_RESET = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    
    public static void main(String[] args)
    {
        PrintSeats(8 , 25 , balcony, "\u001B[31m");
        System.out.println("secound class");
        PrintSeats(24 , 25 , SecondClass, "\u001B[33m");
        System.out.println(isTicketAvailable(2 , 6 , balcony,'E'));
        
        //buy seats 50,51 100,109
        SecondClass[0][0] = 'F';
        SecondClass[1][0] = 'F';
        SecondClass[2][0] = 'F';
        SecondClass[3][0] = 'F';
        SecondClass[4][0] = 'F';
        SecondClass[5][0] = 'F';
        SecondClass[6][0] = 'F';
        SecondClass[7][0] = 'F';
        SecondClass[8][0] = 'F';
        SecondClass[9][10] = 'F';
        
	newPrintSeats(24 , 25 , SecondClass, "\u001B[31m");
       
        
        contiguousSeats(24, 25);
        
    }
   public static void PrintSeats(int rows , int col , char[][] seats , String ANSI_COLOR){
       
       for(int i = 0 ; i < rows ; i++)
       {
           for(int j = 0 ; j < col ; j++)
           {
              seats[i][j] = 'E';
           } 
       }
      // System.out.println(seats);
       
       for(int i = 0 ; i < rows ; i++)
       {
          for(int j = 0 ; j < col ; j++) 
          { 
              System.out.print(ANSI_COLOR + seats[i][j]+" ");
              
          }
          System.out.println(" ");
       }
   }
   
   public static void newPrintSeats(int rows , int col , char[][] seats , String ANSI_COLOR){
        
       for(int i = 0 ; i < rows ; i++)
       {
          for(int j = 0 ; j < col ; j++) 
          { 
              System.out.print(ANSI_COLOR + seats[i][j]+" ");
              
          }
          System.out.println(" ");
       }
   }
 
   public static boolean isTicketAvailable(int rows , int col ,char[][] balcony,char seat)
	{
		//public static char[][] balcony = new char[8][25];
		
		for(int i=0; i < rows;i++)
		{
			for(int j =0; j < col; j++)
			{
				if(balcony[i][j]==seat)
				{
					return true;
				}
			}	
		}
		return false;
	}
	
	
	public static boolean contiguousSeats(int rows, int cols)
	{
	     int empty=0;
	     int totalSeats = rows * cols; 
	     System.out.println(totalSeats);
	     int contiguous[] = new int[totalSeats];
	     
	     for(int i=0;i<rows;i++)
	     {
	         for(int j=0;j<cols;j++)
	         {
	            if(SecondClass[i][j] == 'E')
	            {
	                 empty++;
	                 
	                 // If last seat is empty
	                 if(i == (rows-1) && (j == cols-1))
	                 {
	                 	contiguous[empty-1]++;
	                 }
	 	    } 
	            else
	            { 
			    if(empty!=0)
			    {
			       System.out.println("I was here");
			       contiguous[empty-1]++;
			       empty=0;
			    }
	            }
	         }
	     }
	     
	     for(int i=0;i<totalSeats;i++)
	     {
	     	if(contiguous[i] > 0)
	     	{
	     		System.out.print((i+1) + " : "  + contiguous[i] + ",");
	     	}
	     }
	     
	     System.out.println(); 
	      
	     return true;  	  
	}
	
}
