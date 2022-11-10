package offer;


/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.10
 */


public class A26树的子结构 {

    public boolean isSubStructure(TreeNode a, TreeNode b) {
        if (a == null || b == null) {
            return false;
        }
        return dfs(a, b) || isSubStructure(a.left, b) || isSubStructure(a.right, b);
    }

    public boolean dfs(TreeNode a, TreeNode b) {
        if(b == null) return true;
        if(a == null) return false;
        if (a.val == b.val) {
            return dfs(a.left, b.left) && dfs(a.right, b.right);
        }
        return false;
    }
}
