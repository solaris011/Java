import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
    
        int[] array = {3, 1, 5, 99, 3, 12};
        sort(array);
        
        String[] arr = {"perro" , "zorro", "gato", "cebra", "alce", "abeja"};
        sort(arr);
        
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(135, 87, 3, 35));
        sortIntegers(nums);

        ArrayList<String> cosas = new ArrayList<>(Arrays.asList("bebe", "avion", "zanahoria", "casa"));
        sortStrings(cosas);
    }
    
    public static void sort(int[] array) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
    
    public static void sort(String[] array) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
    
    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
        System.out.println(integers);
    }
    
    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
        System.out.println(strings);
    }
}