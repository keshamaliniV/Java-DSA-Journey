
package Trees;
/*
Problem: Maximum Depth of Binary Tree

Input:
        3
       / \
      9   20
          / \
         15  7

Output: 3

Explanation:
The maximum depth is the number of nodes
along the longest path from the root to a leaf.

The longest path is:
3 -> 20 -> 15

So, the maximum depth is 3.

Approach:
1. If the root is null, return 0.
2. Find the depth of the left subtree.
3. Find the depth of the right subtree.
4. Find the maximum of both depths.
5. Add 1 for the current root node.
6. Return the result.

Time Complexity: O(n)
Space Complexity: O(h)

n = number of nodes
h = height of the tree
*/
class MaximumDepth{
    public int maxDepth(TreeNode root){
        if (root==null) {
            return 0;
        }
        int left=maxDepth(root.left);
        int right=maxDepth(root.right);
        return 1+Math.max(left,right);
    }
}