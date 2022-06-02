class Solution {
    	public boolean isCousins(TreeNode root, int x, int y) {
        if(root == null) return false;
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode xParent = null, yParent = null;
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            while(size-- > 0){
                TreeNode head = queue.poll();
                if(head.left != null){
                    queue.offer(head.left);
                    if(head.left.val == x){
                        xParent = head;
                    }
                    if(head.left.val == y){
                        yParent = head;
                    }
                }
                if(head.right != null){
                    queue.offer(head.right);
                     if(head.right.val == x){
                        xParent = head;
                    }
                    if(head.right.val == y){
                        yParent = head;
                    }
                }
                if(xParent!=null &&yParent!=null){
                    return xParent != yParent; // equality means not cousins
                    // non equality means cousins
                }
            }

            if((xParent==null && yParent!=null) || (xParent!=null &&yParent==null)){
                return false;
            }


        }
        return false;
    }
}