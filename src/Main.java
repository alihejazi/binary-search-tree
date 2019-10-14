public class Main {
    public static void main (String[] args) {
        Node root = new Node();

//        root = BinarySearchTree.addRecursively(root, 5);
//        root = BinarySearchTree.addRecursively(root, 6);
//        root = BinarySearchTree.addRecursively(root, 4);


        root = BinarySearchTree.addIteratively(root, 5);
        root = BinarySearchTree.addIteratively(root, 6);
        root = BinarySearchTree.addIteratively(root, 4);

        BinarySearchTree.inOrderTraverse(root);
        BinarySearchTree.preOrderTraverse(root);
        BinarySearchTree.postOrderTraverse(root);
    }
}