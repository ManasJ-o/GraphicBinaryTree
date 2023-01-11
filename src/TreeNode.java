public class TreeNode {
    private Comparable value;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(Comparable x, TreeNode l, TreeNode r){
        value =x;
        left = l;
        right = r;

    }
    public TreeNode getLeft(){
        return left;
    }

    public TreeNode getRight(){
        return right;
    }
    public Comparable getValue(){
        return value;
    }

    public void setLeft(TreeNode l){
        left = l;
    }

    public void setRight(TreeNode r){
        right =r;
    }

    public void setValue(Comparable x){
        value = x;
    }
}
