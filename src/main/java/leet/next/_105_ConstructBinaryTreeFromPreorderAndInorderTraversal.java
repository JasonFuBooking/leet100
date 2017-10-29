package leet.next;

import util.TreeNode;

/**
 Given preorder and inorder traversal of a tree, construct the binary tree.

 Note:
 You may assume that duplicates do not exist in the tree.
 */

/*
首先，先在纸上用手过一遍怎样用先序和中序确定二叉树
然后，这个算法和纸上的一模一样。
先从根节点开始，递归构建左右子树，最后返回根节点即可

难点1：确定递归函数的参数。首先可以肯定的是，要从先序里找根节点，然后把中序从当前根节点分两半，分别是左右子树，传进递归函数即可
因此，我们至少需要一个先序的根节点index,还有中序当前根节点下左右子树的所有节点的范围inStart和inEnd
最后还需要传进来两个原数组

难点二：每一步递归都要确定一下当前根节点在中序里的位置line35 to 41

难点三：43行：右子树的根节点在先序数组里的位置：就是preIndex + index - inStart + 1,不信可以自己手动验证，这个只有背下来了
 */
public class _105_ConstructBinaryTreeFromPreorderAndInorderTraversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return create(0, 0, inorder.length - 1, preorder, inorder);
    }

    private TreeNode create(int preIndex, int inStart, int inEnd, int[] preorder, int[] inorder) {
        if (preIndex > preorder.length - 1 || inStart > inEnd) {
            return null;
        }
        TreeNode node = new TreeNode(preorder[preIndex]);
        int index = 0;
        for (int i = 0; i < inorder.length; ++i) {
            if (inorder[i] == preorder[preIndex]) {
                index = i;
                break;
            }
        }
        node.left = create(preIndex + 1, inStart, index - 1, preorder, inorder);
        node.right = create(preIndex + index - inStart + 1, index + 1, inEnd, preorder, inorder);
        return node;
    }
}
