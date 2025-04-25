import java.util.*;

public class CountSmaller {
    public List<Integer> countSmaller(int[] nums) {
        Integer[] result = new Integer[nums.length];
        TreeNode root = null;

        for (int i = nums.length - 1; i >= 0; i--) {
            root = insert(root, nums[i], result, i, 0);
        }

        return Arrays.asList(result);
    }

    private TreeNode insert(TreeNode node, int val, Integer[] result, int index, int count) {
        if (node == null) {
            node = new TreeNode(val);
            result[index] = count;
        } else if (val <= node.val) {
            node.leftCount++;
            node.left = insert(node.left, val, result, index, count);
        } else {
            // All left nodes + current node are smaller
            node.right = insert(node.right, val, result, index, count + node.leftCount + 1);
        }
        return node;
    }

    // BST Node with extra info
    private static class TreeNode {
        int val;
        int leftCount = 0; // How many nodes in the left subtree
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }
}
