package Tree;

public class LeafSimilar {

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        StringBuilder root1Leaves = new StringBuilder();
        StringBuilder root2Leaves=new StringBuilder();
        traverse(root1,root1Leaves);
        traverse(root2,root2Leaves);
        return root1Leaves.toString().equals(root2Leaves.toString());
    }
    void traverse(TreeNode root, StringBuilder recordLeaves){
        if(root==null) return;
        if(root.left==null && root.right==null) recordLeaves.append(root.val);
        traverse(root.left, recordLeaves);
        traverse(root.right, recordLeaves);
    }



}
