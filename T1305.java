import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class T1305 {
    List<Integer> list = new ArrayList<>();
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        findValue(root1);
        findValue(root2);
        Collections.sort(list);
        return list;
    }

    void findValue(TreeNode root){
        if (root!=null){
            list.add(root.val);
            findValue(root.left);
            findValue(root.right);
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
