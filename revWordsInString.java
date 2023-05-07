// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static String str="bangalore hosakote kolar mulabagal palamaner";
    
    
    public static char[] strArray=str.toCharArray();
    
    
    public static void main(String[] args) {
        
       System.out.println(strArray);
        
        functionReverseString(0, strArray.length-1, strArray);
        
        System.out.println(strArray);
        
        int wordStart = 0;
        int wordEnd = 0;
        
        while((wordEnd=functionWordEnd(wordStart, strArray)) != -1)
        
        {
                functionReverseString(wordStart, wordEnd-1, strArray);
                wordStart = wordEnd + 1;
        }
       
        System.out.println(strArray);

        
    }
    public static int functionWordEnd(int start,char[] strArray)
    {
        if(start >= strArray.length)
        {
            return -1;
            
        }
        
        int wordEnd = start;
        
        while(wordEnd < strArray.length && strArray[wordEnd]!= ' '){
            wordEnd++;
        }
        // ReverseWord(start, start+1,strArray);
        return wordEnd;
    }
    
    public static void functionReverseString(int start,int end, char[] strArray)
    {
        
        if(strArray==null)
        {
            return;
        }
        while(start<=end){
            char temp = strArray[start];
            strArray[start] = strArray[end];
            strArray[end] = temp;
            start++;
            end--;
        }
    }
    // public static void ReverseWord(int start, int end,char[] strArray){
    //     char temp = strArray[start];
    //     strArray[start] = strArray[end];
    //     strArray[end] = temp;
    // }
    
}
