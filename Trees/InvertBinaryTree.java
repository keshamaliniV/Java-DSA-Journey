package Trees;
/*
Problem: Invert Binary Tree

Input:
        4
       / \
      2   7
     / \ / \
    1  3 6  9

Output:
        4
       / \
      7   2
     / \ / \
    9  6 3  1

Explanation:
1. Check whether the root is null.
2. Recursively invert the left subtree.
3. Recursively invert the right subtree.
4. Swap the left and right children.
5. Return the root.

Time Complexity: O(n)
Space Complexity: O(h)
*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
    }
}
public class InvertBinaryTree{
    public TreeNode invertTree(TreeNode root){
        if(root==null){
            return null;
        }
        TreeNode left=invertTree(root.left);
        TreeNode right=invertTree(root.right);
        root.left=right;
        root.right=left;
        return root;
    }
    public void printTree(TreeNode root){
        if(root==null){
            System.out.println("[]");
            return;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        List<Integer> result=new ArrayList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node=queue.poll();
            result.add(node.val);
            if(node.left!=null){
                queue.add(node.left);
            }
            if(node.right!=null){
                queue.add(node.right);
            }
        }
        System.out.println(result.toString().replace(" ",""));
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine().replaceAll("[\\[\\]\\s]","");
        String[] values=input.split(",");
        TreeNode[] nodes=new TreeNode[values.length];
        for(int i=0;i<values.length;i++){
            if(!values[i].equals("null")){
                nodes[i]=new TreeNode(Integer.parseInt(values[i]));
            }
        }
        int j=1;
        for(int i=0;i<nodes.length&&j<nodes.length;i++){
            if(nodes[i]!=null){
                if(j<nodes.length){
                    nodes[i].left=nodes[j++];
                }
                if(j<nodes.length){
                    nodes[i].right=nodes[j++];
                }
            }
        }
        InvertBinaryTree solution=new InvertBinaryTree();
        TreeNode root=solution.invertTree(nodes[0]);
        solution.printTree(root);
    }
}