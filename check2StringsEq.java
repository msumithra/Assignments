class main{
    public static void main(String[] args){
    String s1="madam";
    String s2="madam";
    String bag="";
    for(int i=0;i<s1.length();i++){
    	bag=s1.charAt(i)+bag;
    }
    System.out.println("Reversed String:"+bag);
    
    if(s1==s2){
    	System.out.println("string1 is reverse of string2");
    }
    else{
    	System.out.println("string1 is not reverse of string2");
    }
}
}
