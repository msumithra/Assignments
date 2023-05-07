class main{
    public static void main(String[] args){
        int n=4;
        for(int i=1;i<=n;i++){
            String bag="";
            for(int j=1;j<=n;j++){
                if(j%2==0){
                    if(i%2==1){
                        bag=bag+"*"+"  ";
                    }
                }
                    else if(j%2==1){
                        if(i%2==0){
                            bag=bag+"  "+"*";
                        }
                    }
                }
            
            System.out.println(bag);
        }
    }
}
     
