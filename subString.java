class HelloWorld {
    public static void main(String[] args) {
       String str= "bootcamp";
       System.out.println(subString(str));
    }
    public static int subString(String str)
    {
    	int count = 0;
      for(int i = 0 ;i < str.length() ;i++)
      {
          String bag = "";
          for(int j= i ; j < str.length() ; j++)
          {
              bag += str.charAt(j);
              System.out.println(bag);
              count++;
              
          }
      }	
      return count;
    }
}
