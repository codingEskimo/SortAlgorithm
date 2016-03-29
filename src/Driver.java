/**
 * Created by runzhuowang on 3/27/16.
 */
public class Driver {
    public static void main(String[] args){
        int input[] = {49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,17,18,23,34,15,35,25,53,51};
        SelectionSort process = new SelectionSort();
        int[] result = process.sort(input);
        for (int i: result){
            System.out.print(i + " ");
        }
    }
}
