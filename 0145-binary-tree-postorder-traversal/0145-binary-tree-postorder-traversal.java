class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>L=new LinkedList<>();
        postorder(root,L);
        return L;
        
    }
    public List<Integer> postorder(TreeNode root,List<Integer>L) {
        if(root!=null)
        {
        postorder(root.left,L);
        postorder(root.right,L);
        L.add(root.val);
        }
        return L;
}
}