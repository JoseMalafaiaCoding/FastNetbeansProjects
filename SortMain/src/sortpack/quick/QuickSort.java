package sortpack.quick;

public class QuickSort {
    public void sort(int[] sortArray){
		quick(sortArray, 0, sortArray.length - 1);
	}
	
	private void quick(int[] sortArray, int begin, int end){
		int i = begin, j = end, buffer;
		int x = sortArray[(begin + end) / 2];
		do{
                    while((sortArray[i] < x) && (i < end))i++;
                    while((sortArray[j] > x) && (j > begin))j--;
                    if(i <= j){
			buffer = sortArray[i];
			sortArray[i] = sortArray[j];
			sortArray[j] = buffer;
			i++; j--;
                    }
                }while(i <= j);
		if(j > begin) quick(sortArray, begin, j);
                if(i < end) quick(sortArray, i, end);
	}
}
