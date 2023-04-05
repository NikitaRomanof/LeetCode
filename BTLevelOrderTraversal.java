/*
Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BTLevelOrderTraversal {

    public static void main(String[] args) {
        TreeNode test = new TreeNode(1);
        System.out.println(levelOrder(test));
    }

     public static class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;

         TreeNode() {
         }

         TreeNode(int val) {
             this.val = val;
         }

         TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
             this.right = right;
         }
     }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        List <Integer> in = new ArrayList<>();
        List <Integer> levels = new ArrayList<>();
        in.add(root.val);
        levels.add(1);
        result.add(in);
        recursiveAdd(root, result, 2, levels);
        for (int i = 1; i < levels.size(); ++i) {
            for (int j = i + 1; j < levels.size(); ++j) {
                if (i < levels.size() && Objects.equals(levels.get(i), levels.get(j))) {
                    List <Integer> ii = result.get(i);
                    List <Integer> jj = result.get(j);
                    ii.addAll(jj);
                    result.set(i, ii);
                    result.remove(j);
                    levels.remove(j);
                    i = 2;
                }

            }
        }

        return result;
    }

    private static void recursiveAdd(TreeNode root, List<List<Integer>> result, int level, List <Integer> levels) {

        List <Integer> in = new ArrayList<>();
        if (root.left != null) {
            in.add(root.left.val);
        }
        if (root.right != null) {
            in.add(root.right.val);
        }
        if (!in.isEmpty()) {
            result.add(in);
            levels.add(level);
        }
        if (root.left != null) {
            recursiveAdd(root.left, result, level + 1, levels);
        }
        if (root.right != null) {
            recursiveAdd(root.right, result, level + 1, levels);
        }
    }
}
