/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    ArrayList<Integer> arr = new ArrayList<>();

    public int minDiffInBST(TreeNode root) {
        retrieve(root);
        int min = Integer.MAX_VALUE;
        for(int i = 0;i < arr.size()-1; i++){
            min = Math.min(Math.abs(arr.get(i)-arr.get(i+1)),min);
        }

        return min;
    }

    public void retrieve(TreeNode root){
        if(root == null){
            return;
        }

        retrieve(root.left);
        arr.add(root.val);
        retrieve(root.right);
    }
}
