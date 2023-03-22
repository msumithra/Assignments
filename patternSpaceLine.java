class main{
    public static void main(String[] args){
        int n=4;
        for(int i=0;i<n-1;i++){
            String bag="";
            for(int j=0;j<=n-1;j++){
                if(j%2==0){
                    if(i%2==0){
                        bag=bag+"*"+"_";
                    }
                }
        
                    else if(j%2==1){
                        if(i%2==1){
                            bag=bag+"_"+"*";
                        }
                    }
                
                }
            
            System.out.println(bag);
        }
    }
}
     
