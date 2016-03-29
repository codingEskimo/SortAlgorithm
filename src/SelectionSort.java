/**
 * Created by runzhuowang on 3/28/16.
 */
public class SelectionSort {
    public int[] sort(int[] input){
        for(int i = 0; i < input.length; i++){
            int key = input[i];
            int position = i;
            for (int j = i + 1; j < input.length; j++){
                if(input[j] < key){
                    position = j;
                    key = input[j];
                }
            }
            input[position] = input[i];
            input[i] = key;
        }
        return input;
    }
}
