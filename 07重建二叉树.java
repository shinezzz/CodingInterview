/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 //有个问题，没有搞清楚Map和HashMap的差别
import java.util.HashMap;
//import java.util.Map;
public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre == null || pre.length == 0 || in == null || in.length == 0)
            return null;
        //如果用map就要包括一个map的包
        HashMap<Integer, Integer> inMap = new HashMap<Integer, Integer>();
        int length = pre.length;
        //把中序放到Map里
        for(int i = 0; i < length; i++){
            //get只能得到value，所以把key和value互换
            inMap.put(in[i], i);
            //inMap.put(i,in[i]);
        } 
        TreeNode root = rebuildTree(pre, 0, length - 1, in, 0, length - 1, inMap);
        return root;
    }
    public TreeNode rebuildTree(int[] pre, int preStart, int preEnd, int[] in, int inStart,int inEnd, 
                                HashMap<Integer, Integer> inMap){
        if(preStart > preEnd)
            return null;
        int rootValue = pre[preStart];
        TreeNode root = new TreeNode(rootValue);
        if(preStart == preEnd){
            return root;
        }else{
            int rootIndex = inMap.get(rootValue);
            //int rootIndex = inMap.getkey(rootValue);
            int leftSubtreeNum = rootIndex - inStart;
            int rightSubtreeNum = inEnd - rootIndex;
            TreeNode leftSubtree = rebuildTree(pre, preStart + 1, preStart + leftSubtreeNum,
                                              in, inStart, rootIndex - 1, inMap);
            TreeNode rightSubtree = rebuildTree(pre, preEnd - rightSubtreeNum + 1, preEnd,
                                              in, rootIndex + 1, inEnd, inMap);
            root.left = leftSubtree;
            root.right = rightSubtree;
            return root;
        }
    }
}
