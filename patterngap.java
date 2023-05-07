class HelloWorld {
     public static void main(String[] args) {
         int n=4;
         for(int i=0;i<n;i++){
             String bag="";
             if(i==1){
                 System.out.println("*"+"  "+"*");
             }
             for(int j=i+1;j<n;j++){
                 bag=bag+"*"+" ";
             }
             System.out.println(bag);
         }
     }
}
