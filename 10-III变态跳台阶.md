# 剑指offer_nowcoder

## 10-III变态跳台阶

### 题目描述

一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。

### 解答

```java
public class Solution {
    public int JumpFloorII(int target) {
        return target <= 0 ? 0 : 1 << (target-1);
    }
}
```
