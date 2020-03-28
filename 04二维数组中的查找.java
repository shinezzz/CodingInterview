public class Solution {
    public boolean Find(int target, int [][] array) {
        if(array == null || array.length == 0 ||array[0].length == 0)
            return false;
        int rows = array.length, colums = array[0].length;
        // 右上角开始找
        int row = 0, colum = colums - 1;
        while (row <= rows-1 && colum >= 0){
            int num = array[row][colum];
            if(target == num) return true;
            else if(target > num) row++;
            else colum--;
        }
        return false;

    }
}
