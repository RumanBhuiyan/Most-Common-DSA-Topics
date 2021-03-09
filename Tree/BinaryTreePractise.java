public class BinaryTreePractise {

    static class Node {
        public int data;
        Node left;
        Node right;

        Node(int value) {
            data = value;
        }
    }

    public static void main(String[] args) {

        // creating nodes in heap memory
        Node root = new Node(1);
        Node first = new Node(2);
        Node second = new Node(3);
        Node third = new Node(4);
        Node fourth = new Node(5);
        Node fifth = new Node(6);
        Node sixth = new Node(7);

        // Connecting Nodes
        root.left = first;
        root.right = second;
        first.left = third;
        first.right = fourth;
        second.left = fifth;
        second.right = sixth;

        System.out.print("Preorder Traversal : ");
        preorderTraversal(root);

        System.out.print("\n Inorder Traversal : ");
        inorderTraversal(root);

        System.out.print("\n Postorder Traversal : ");
        postorderTraversal(root);
    }

    public static void preorderTraversal(Node keep) {
        if (keep != null) {
            System.out.print(keep.data + " ");
            preorderTraversal(keep.left);
            preorderTraversal(keep.right);
        }
    }

    public static void inorderTraversal(Node keep) {
        if (keep != null) {
            inorderTraversal(keep.left);
            System.out.print(keep.data + " ");
            inorderTraversal(keep.right);
        }
    }

    public static void postorderTraversal(Node keep) {
        if (keep != null) {
            postorderTraversal(keep.left);
            postorderTraversal(keep.right);
            System.out.print(keep.data + " ");
        }
    }
}
