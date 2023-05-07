class HelloWorld {
     public static void main(String[] args) {
         int n=4;
         for(int i=0;i<n;i++){
             String bag="";
             for(int j=i;j<n;j++){
                 bag=bag+"*"+" ";
             }
             System.out.println(bag);
         }
     }
}
     
