public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> wrapList = new LinkedList<List<Integer>>();
        
        if(root == null) return wrapList;
        
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelNum = queue.size();
            List<Integer> subList = new LinkedList<Integer>();
            for(int i=0; i<levelNum; i++) {
                if(queue.peek().left != null) queue.offer(queue.peek().left);
                if(queue.peek().right != null) queue.offer(queue.peek().right);
                subList.add(queue.poll().val);
            }
            wrapList.add(subList);
        }
        return wrapList;
    }
}

Methods in Queue:

add()- This method is used to add elements at the tail of queue. More specifically, at the last of linkedlist if it is used, or according to the priority in case of priority queue implementation.
peek()- This method is used to view the head of queue without removing it. It returns Null if the queue is empty.
element()- This method is similar to peek(). It throws NoSuchElementException when the queue is empty.
remove()- This method removes and returns the head of the queue. It throws NoSuchElementException when the queue is impty.
poll()- This method removes and returns the head of the queue. It returns null if the queue is empty.