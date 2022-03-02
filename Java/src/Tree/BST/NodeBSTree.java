package Tree.BST;

public class NodeBSTree {
    int data;
    NodeBSTree left,right;

    public NodeBSTree(int data) {
        this.data = data;
    }

    public NodeBSTree(int data, NodeBSTree left, NodeBSTree right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public NodeBSTree() {
    }
}
