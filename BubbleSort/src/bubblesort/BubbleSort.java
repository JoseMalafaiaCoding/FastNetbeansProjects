
package bubblesort;


public class BubbleSort {

    
    public static void main(String[] args) {
        int buffer;
        int arrayEx[] = {5, 7, 1, 20, 22, 40, 8};
        for (int i = 0; i < arrayEx.length; i++) {
            for (int j = 0; j < arrayEx.length - 1; j++) {
                if(arrayEx[j + 1] < arrayEx[j]){
                    buffer = arrayEx[j];
                    arrayEx[j] = arrayEx[j + 1];
                    arrayEx[j + 1] = buffer;
                }
            }
        }
        for (int i = 0; i < arrayEx.length; i++) {
            System.out.println(arrayEx[i]);
        }
    }
    
}
