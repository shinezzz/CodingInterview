// 最大的数字是多少？取余
// 和斐波那契数列一样，就是首项变了
// 斐波那契数
public class Solution {
    public int JumpFloor(int target) {
        int p = 1, q = 2, sum = 0;
        if(target == 1){
            return 1;
        }
        if(target == 2){
            return 2;
        }
        for(int i = 3; i <= target; i++){
            sum = p + q;
            p = q;
            q = sum;
        }
        return sum;

    }
}
//公式
public class Solution {
    public int JumpFloor(int target) {
        int n = target;
        double temp = Math.sqrt(5);
        double fn = Math.round((Math.pow((1+temp)/2,n+1) - Math.pow((1-temp)/2,n+1))/temp);
        return (int)fn;

    }
}
