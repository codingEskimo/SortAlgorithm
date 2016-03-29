/**
 * Created by runzhuowang on 3/27/16.
 */
public class InsertionSort {
    public int[] insertSort(int[] input){
        for(int i = 1; i < input.length; i++){
            int key = input[i];
            int j = i -1;
            for(; j>=0 && input[j]>key; j--){
                input[j+1] = input[j];
            }
            input[j+1] = key;
        }
        return input;
    }

    public int[] insertSortRevise(int[] input){
        for (int i = 1; i < input.length; i++){
            int key = input[i];
            int j = i - 1;
            for (; j >= 0 && input[j] < key; j-- ){
                input[j+1] = input[j];
            }
            input[j+1] = key;
        }
        return input;
    }
}
