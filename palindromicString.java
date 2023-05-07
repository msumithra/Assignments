class HelloWorld {
    public static String str= "madam racecar wow";
  
    
    public static char[] strArray;
   
   
    public static void main(String[] args) {
    
  	if (str == null)
 	{
		System.out.println("Sumithra is a drama queen");    		
    		System.exit(0);
    	}
    
    	strArray=str.toCharArray();
    	
    	int count = 0;
       
       
       /*if(findPalindomicString(0, strArray.length-1, strArray))
       {
           count += 1;
       }*/
       
        
        System.out.println(count);
        
        int wordStart = 0;
        int wordEnd = 0;
        
        while((wordEnd=functionWordEnd(wordStart, strArray)) != -1)
        
        {
                if(findPalindomicString(wordStart, wordEnd-1, strArray)){
                    count += 1;
                }
                
                wordStart = wordEnd +1;
        }
       
        System.out.println(count);
        
    }
       
      
    
    
    
    //Finding the word end 
    
    public static int functionWordEnd(int start,char[] strArray)
    
    {
        

        if(start >= strArray.length)
        {
            return -1;
            
        }
        
        int wordEnd = start;
        
        while(wordEnd < strArray.length && strArray[wordEnd]!= ' ')
        {
            wordEnd++;
        }

        return wordEnd;
    }
    
    
   //finding the palindromic string 
   
   
     public static boolean findPalindomicString(int start,int end, char[] strArray)
    	{
        
        if(strArray==null)
        {
            return false;
        }

	if(start >= end)
	{
		return false;
	}
        
        
        while(start<=end)
        {
            if(strArray[start] != strArray[end])
            {
                return false;
            }
            
            start++;
            end--;
        }

        return true;
    }
}
