// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) 
    {
        int[] arr = {1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,-3,-3,-3};
        int firstMin, secondMin, thirdMin;
        
        if(arr == null)
        {
            System.out.println("Array is null");
            return;
        }
        
        if(arr.length < 3)
        {
            System.out.println("Array is smaller than 3 elements");
            return;
        }
        
        firstMin = secondMin = thirdMin = Integer.MAX_VALUE;
        
        for (int i = 0; i < arr.length; i++)
        {
            int pFirstMin = firstMin;
            int pSecondMin = secondMin;
            
            //System.out.println(firstMin + ", " + secondMin + ", " + thirdMin + "; ");
            
            if(arr[i] < firstMin)
            {
                firstMin = arr[i];
                secondMin = pFirstMin;
                thirdMin = pSecondMin;
                
            }
            if(arr[i] < secondMin && (arr[i] != thirdMin && arr[i] != secondMin && arr[i] != firstMin))
            {
                secondMin = arr[i];
                thirdMin = pSecondMin;
            }
            if(arr[i] < thirdMin && (arr[i] != thirdMin && arr[i] != secondMin && arr[i] != firstMin))
            {
                thirdMin = arr[i];
            }
        }
        
        if(firstMin != Integer.MAX_VALUE)
        {
            System.out.println("First Min " + firstMin + ", ");
        }
        if(secondMin != Integer.MAX_VALUE)
        {
            System.out.println("Second Min " + secondMin + ", ");
        }
        if(thirdMin != Integer.MAX_VALUE)
        {
            System.out.println("Third Min " + thirdMin + ", ");
        }
    }
}


