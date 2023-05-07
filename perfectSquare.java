public class Check{  
public static void main(String[] args){    
int number=90;
if (checkPerfectSquare(number))   
System.out.print("Yes,it is perfect square");   
else  
System.out.print("No,it is not perfect square ");   
}

static boolean checkPerfectSquare(double number)    
{   
double sqrt=Math.sqrt(number);   
return ((sqrt - Math.floor(sqrt)) == 0);   
} 
}

