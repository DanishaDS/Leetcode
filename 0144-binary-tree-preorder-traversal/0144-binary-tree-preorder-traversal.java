
class Solution {
    public List<Integer> preorder(TreeNode root,List<Integer> L) {
        
        if(root!=null)
        {
        L.add(root.val);
        preorder(root.left,L);
        preorder(root.right,L);
        
        }
        return L;
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>L=new LinkedList<>();
        preorder(root,L);
        return L;
    }
}