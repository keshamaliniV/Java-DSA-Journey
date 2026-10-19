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
1. If the root is null, return it.
2. Recursively invert the left subtree.
3. Recursively invert the right subtree.
4. Swap the left and right children.
5. Return the root of the inverted tree.

Time Complexity: O(n)
Space Complexity: O(h)
where n = number of nodes and h = tree height.
*/
package Trees;
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

class InvertBinaryTree{
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return root;
        }
        TreeNode left=invertTree(root.left);
        TreeNode right=invertTree(root.right);
        root.left=right;
        root.right=left;
        return root;
    }
}