import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

public class SimpleTesting {
    public static void main(String[] args) {
        int[] Array1 = new int[]{00,10,20,30,40,50};
        int[] Array2 = new int[]{60,70,80,90,100};
        int[] Concate = ArrayUtils.addAll(Array1, Array2);
        System.out.println("Array1: " + Arrays.toString(Array1));
        System.out.println("Array2: " + Arrays.toString(Array2));
        System.out.println("Concatenated Array: " + Arrays.toString(Concate)); 
    }
}
