
package sortpack;
import sortpack.quick.*;
import sortpack.bubble.*;


public class SortMain {

    public static void main(String[] args) {
        int[] array = {7, 1, 3, 10, 5 , 12, 9, 10 , 11};
        BubbleSort ob = new BubbleSort(array);
        ob.sort();
        for (int i : array) {
            System.out.println(i);
        }
    }
    
}
