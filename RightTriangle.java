class main{
    public static void main(String[] args){
    int side1=4;
    int side2=7;
    int side3=5;
    int res=0;
    int twoSide=side1*side1+ side2*side2;
    if( twoSide== side3*side3){
    res=res+twoSide;
    System.out.println("Yes,it is a Right angled Triangle:"+res);
    }
    else{
    System.out.println("No,it is not a Right angled Triangle:");
    }
}
}
