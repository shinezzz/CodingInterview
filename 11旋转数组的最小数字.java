// 有重复数字
import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        int length = array.length;
        int low = 0, high = length-1, temp =0;
        while(low < high){
            temp =low + (high - low)/2;//防止溢出
            if(array[temp] > array[high]){
                low = temp + 1;
            }
            else if(array[temp] < array[high]){
                high = temp;
            }
            else{
                high = high - 1;
            }
            
        }
        return array[high];
        
        
    }
}
