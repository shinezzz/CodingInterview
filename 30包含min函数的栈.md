# 剑指offer_nowcoder

## 30包含min函数的栈

### 题目描述

定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
注意：保证测试中不会当栈为空的时候，对栈调用pop()或者min()或者top()方法。

### 解答

构造函数没有**返回类型**

```java
import java.util.Stack;

public class Solution {
    private Stack<Integer> dataStack, helpStack;
    public Solution(){
        dataStack = new Stack<>();
        helpStack = new Stack<>();
    }
    public void push(int node) {
        dataStack.push(node);
        if(helpStack.isEmpty()){
            helpStack.push(node);
        }else{
            int temp = helpStack.peek();
            if( temp >= node){
                helpStack.push(node);
            }
        }
    }
    public void pop() {
        if(dataStack.pop().equals(helpStack.peek())){
            helpStack.pop();
        }
    }
    public int top() {
        return dataStack.peek();
    }
    public int min() {
        return helpStack.peek();
    }
}

```
