/*Write a program to cipher the string?
 Example : input : str = “aabccdddee”
                  Output : a2b1c2d3e2*/


public class day12_3 {
    public static void main(String[] args) {
       
       String str="aabccdddee";
        
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                for (int j = i+1; j < str.length(); j++) {
                    if (str.charAt(j) == str.charAt(i)) {
                        count++;
                    }
                }
                System.out.print(str.charAt(i) + "" + count);
            }
        }
    }
}



