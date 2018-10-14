# Leetcode

Bitwise operations:

The java.lang.Integer.bitCount() method returns the number of one-bits in the two's complement binary representation of the specified int value i. This is sometimes referred to as the population count.

Queue for breadth-first search

final Queue<TreeNode> queue = new LinkedList<>();

Linked List:

Linked List problems are relatively easy to master. Do not forget the Two-pointer technique, which not only applicable to Array problems but also Linked List problems as well.

Another technique to greatly simplify coding in linked list problems is the dummy node trick.

Trees:

To understand recursion on trees: watch "recursive program to count the number of nodes", "recursive program to count the number of leaves and non leaves", "recursive program to find the height of a tree"

-> base condtions generally include things like - when root is null, when tree is a leaf etc.

Idea is: first write the recursive equation. see what the halt condition should be. And then write the function (and try to trace the tree to understand better)

Level order traversal - Breadth first search

Preorder, Inorder, Postorder - Depth first search

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

