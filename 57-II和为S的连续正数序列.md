# 剑指offer_nowcoder

## 57-II和为S的连续正数序列

### 题目描述

小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck!

#### 输出描述

输出所有和为S的连续正数序列。序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序

### 解答

滑动窗口法

```java
import java.util.ArrayList;
public class Solution {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        int i = 1; // 滑动窗口的左边界
        int j = 1; // 滑动窗口的右边界
        int temp = 0; // 滑动窗口中数字的和
        ArrayList<ArrayList<Integer> > res = new ArrayList<ArrayList<Integer> >();
        while (i <= sum / 2) {
            if (temp < sum) {
                // 右边界向右移动
                temp += j;
                j++;
            } else if (temp > sum) {
                // 左边界向右移动
                temp -= i;
                i++;
            } else {
                // 记录结果
                ArrayList<Integer> arr = new ArrayList<Integer>();
                for (int k = i; k < j; k++) {
                    arr.add(k);
                }
                res.add(arr);
                // 左边界向右移动
                temp -= i;
                i++;
            }
        }

        return res;
    }
}
```
