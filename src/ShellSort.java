/**
 * Created by runzhuowang on 3/28/16.
 */
public class ShellSort{
    public int[] sort(int[] input){
        double d1 = input.length;
        while(true){
            d1 = Math.ceil(d1/2);
            int d = (int)d1;
            for(int dth = 0; dth < d; dth++){
                for(int i = dth + d; i < input.length; i+=d){
                    int key = input[i];
                    int j = i - d;
                    for(; j >= 0 && input[j] > key; j-=d){
                        input[j+d] = input[j];
                    }
                    input[j+d] = key;
                }
            }
            if(d==1){
                break;
            }
        }
        return input;
    }
}
