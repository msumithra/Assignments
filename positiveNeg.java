// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        int[] posNeg = {-1,2,-3,3,6,9,8,-11};
        
        int pos = 0;
        int neg = posNeg.length - 1;
        
        while(pos < neg)
        {
            // traverse until you find a +ve number
            if(posNeg[pos] < 0)
            {
                pos++;
                System.out.println("pos " + pos);
            }
            
            //traverse until you find a -ve number
            
            if(posNeg[neg] > 0)
            {
                neg--;
                System.out.println("neg " + neg);

            }
            
            if(pos < neg)
            {
                int temporary=posNeg[pos];
                posNeg[pos]=posNeg[neg];
                posNeg[neg]=temporary;
                neg--;
                pos++;
            }
        }
       
        for (int i = 0; i < posNeg.length; i++)
        {
            System.out.print(posNeg[i]+ ", ");
        }
    }
}
