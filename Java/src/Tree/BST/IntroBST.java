package Tree.BST;


import org.w3c.dom.Node;

import java.util.Scanner;

public class IntroBST {
    static final Scanner sc = new Scanner(System.in);

    public static NodeBSTree insert(NodeBSTree root, NodeBSTree node) {
        if (root == null)
            root = node;
        else {
            NodeBSTree temp = root;
            NodeBSTree bfTemp = null;
            while (temp != null) {
                bfTemp = temp;
                if (temp.data > node.data)
                    temp = temp.left;
                else temp = temp.right;
            }
            if (bfTemp.data > node.data)
                bfTemp.left = node;
            else bfTemp.right = node;
        }
        return root;

    }

    public static NodeBSTree insertRecur(NodeBSTree root, NodeBSTree node) {
        if (root == null)
            return node;
        if (node.data < root.data) {
            if (root.left != null)
                insertRecur(root.left, node);
            else root.left = node;
        } else {
            if (root.right != null)
                insertRecur(root.right, node);
            else root.right = node;
        }
        return root;
    }

    public static void display(NodeBSTree root) {
        if (root != null) {
            display(root.left);
            System.out.print(root.data + "   ");
            display(root.right);
        }
    }

    public static NodeBSTree search(NodeBSTree root, int key) {
        if (root == null)
            return null;
        if (key < root.data)
            return search(root.left, key);
        else if (key > root.data)
            return search(root.right, key);
        else return root;
    }

    public static NodeBSTree input(NodeBSTree root) {
        int n;
        do {
            System.out.println("Enter number node wanna add : ");
            n = sc.nextInt();
        } while (n <= 0);
        for (int i = 0; i < n; i++) {
            NodeBSTree node = new NodeBSTree(sc.nextInt());
            root = insertRecur(root, node);
        }
        return root;
    }
//
//    public static NodeBSTree deleteNodeHavOnChild(NodeBSTree bfNode,NodeBSTree node) {
//        if (node.data < bfNode.data){
//            if (node.right == null)
//                bfNode.left = node.left;
//            else bfNode.left = node.right;
//        }
//        else {
//            if (node.right == null)
//                bfNode.right = node.left;
//            else bfNode.right = node.right;
//        }
//        return bfNode;
//    }

    public static NodeBSTree findLeftmostRight(NodeBSTree root) {
        if (root == null)
            return null;
        while (root.left != null)
            root = root.left;
        return root;
    }
    public static NodeBSTree deleteNode(NodeBSTree root,int key) {
        if (root == null) // case base
            return null;
        //find node have key need delete
        else if (key < root.data)
            root.left = deleteNode(root.left,key); // after delete subtree right must assignment again root.left = newTree deleted node key
        else if (key > root.data)
            root.right = deleteNode(root.right,key);// similar
        else {
            if (root.right == null && root.left == null)
                return null;
            else if(root.right == null || root.left == null){
                if (root.right == null)
                    return root.left;
                else
                    return root.right;
            }
            else {
                NodeBSTree leftmostRight = findLeftmostRight(root.right);
                root.data = leftmostRight.data;
                root.right = deleteNode(root.right,leftmostRight.data);
            }
        }
        return root;
    }
    public static void main(String[] args) {
        NodeBSTree root = null;
        root = input(root);
        display(root);
        NodeBSTree nodeBSTree = null;
        nodeBSTree = search(root, sc.nextInt());
        if (nodeBSTree != null)
            System.out.println("Found");
        else System.out.println("Not found");

        //Vao : 1 cay va key can xoa
        //Ra : node co key duoc xoa tra ve lai cay moi(root)
        root = deleteNode(root,sc.nextInt());
        display(root);
    }
}
