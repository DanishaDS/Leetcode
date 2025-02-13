
class Solution {
    public List<Integer> inorder(TreeNode root,List<Integer>L ) {
         if(root!=null){
         inorder(root.left,L);
         L.add(root.val);
         inorder(root.right,L);
         }
         return L;

    }
     public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> L=new LinkedList<>();
         inorder(root,L);
         return L;
        
    }
}