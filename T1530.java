import java.util.ArrayList;
import java.util.List;

public class T1530 {
    List<Integer> list = new ArrayList<>();
    public int countPairs(TreeNode root, int distance) {
        DFS(root, 0);
        int count = 0;
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
            for(int j=i+1; j<list.size(); j++){
                if(Math.abs(list.get(i)+list.get(j))<=distance){
                    count++;
                }
            }
        }
        return count;
    }

    void DFS(TreeNode root, int height){
        if(root == null) return;
        if(root.left==null&&root.right==null) {
            list.add(height);
            return;
        }
        DFS(root.left, height+1);
        DFS(root.left, height+1);
    }
}

class TreeNode {
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
