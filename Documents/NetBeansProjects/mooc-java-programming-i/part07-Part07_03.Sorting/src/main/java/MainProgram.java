
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
        
    }
    
    public static int smallest(int[] array) {
        int smallNum = array[0];
        for (int i : array) {
            if (smallNum > i) {
                smallNum = i;
            }
        }
        return smallNum;
    }
    
     public static int indexOfSmallest( int [] array){
        int index=0;
        
        for (int i=0; i < array.length; i++){
            if(array[i] == MainProgram.smallest(array)){
                index= i;
            }
        }
        return index;
    }
    
    public static int indexOfSmallestFrom (int[] array, int num) {
        int smallIndex = array[num];
        int index = num;
        for (int k = num; k < array.length; k++) {
            if (smallIndex > array[k]) {
                smallIndex = array[k];
                index = k;
            }
        }
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int temp;
        temp = array[index2];
        array[index2] = array[index1];
        array[index1] = temp;
    }
    
    public static void sort (int[] array) {
        // indexOfSmallestFrom and swap
        for (int i = 0; i < array.length; i++) {
            int k = indexOfSmallestFrom(array, i);
            swap(array, i, k);
            System.out.println(Arrays.toString(array));            
        }
        
    }
    
}
