package leetCode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by lenovo on 2016/1/8.
 */
public class Solution104MaximumDepthofBinaryTree {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        TreeNode left=new TreeNode(2);
        TreeNode right=new TreeNode(3);
        root.left=left;
        root.right=right;
        left=new TreeNode(2);
        right=new TreeNode(3);
        root.left.left=left;
        root.right.right=right;
        System.out.println( maxDepthDFS(root));
        System.out.println( maxDepthBFS(root));
    }

    private static int maxDepthDFS(TreeNode root){
        //深度优先遍历
        int leftMaxDepth=0,rightMaxDepth=0;
        if(null!=root){
            leftMaxDepth=maxDepthDFS(root.left);
            rightMaxDepth=maxDepthDFS(root.right);
            return (Math.max(leftMaxDepth,rightMaxDepth)+1);
        }
        else
            return 0;
    }

    private  static int maxDepthBFS(TreeNode root){
        //广度优先遍历,使用队列完成
        if(null==root){
            return 0;
        }
        Queue<TreeNode> queue =new LinkedList<TreeNode>();
        queue.add(root);
        int countNode=1,countDepth=0;
        while(!queue.isEmpty()){
            TreeNode bufTreeNode=queue.peek();
            queue.poll();
            countNode--;
            if(null!=bufTreeNode.left){
                queue.add(bufTreeNode.left);
            }
            if(null!=bufTreeNode.right){
                queue.add(bufTreeNode.right);
            }
            if(0==countNode){
                countDepth++;
                countNode=queue.size();
            }
        }
        return countDepth;
    }
}
