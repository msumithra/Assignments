/*Write a program to check if a given year is a leap year or not?
 Example : input : 2004
                  Output : Leap Year
*/


class day3_3
{
    public static void main(String[] args) 
    {
        int num=2036;
        if(num<=100)
        {
            if(num%4==0)
            {
                System.out.println("Leap year");
            }
        }
        else if(num>100)
        {
            if((num%100!=0) && (num%400!=0) && (num%4==0))
            {
                System.out.println("leap year");
            }else{
                System.out.println("Not a Leap Year");
            }
        }
    }
}

//1900 was not leap year
