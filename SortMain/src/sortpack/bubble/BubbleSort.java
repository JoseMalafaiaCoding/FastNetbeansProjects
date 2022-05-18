package sortpack.bubble;

public class BubbleSort {
    protected int[] sortArray;
    public BubbleSort(int[] sortArray){
        this.sortArray = sortArray;
    }
	
    public int[] sort(){
	int buffer;
	for(int i = 0; i < sortArray.length; i++){
            for(int j = 0; j < sortArray.length - i - 1; j++){
                if(sortArray[j] > sortArray[j + 1]){
                    buffer = sortArray[j];
                    sortArray[j] = sortArray[j + 1];
                    sortArray[j + 1] = buffer;
		}
            }
        }
	return sortArray;
    }    
}
