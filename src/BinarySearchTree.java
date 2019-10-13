public class BinarySearchTree {

    public static Node addRecursively(Node currentNode, int value) {
        if (currentNode == null || currentNode.value == null) {
            return new Node(value);
        } else {
            if (value < currentNode.value) {
                currentNode.leftChild = addRecursively(currentNode.leftChild, value);
            } else if (value > currentNode.value) {
                currentNode.rightChild = addRecursively(currentNode.rightChild, value);
            }
        }

        return currentNode;
    }


    public static void inOrderTraverse(Node root) {
        if (root != null) {
            inOrderTraverse(root.leftChild);
            System.out.println(root.value);
            inOrderTraverse(root.rightChild);
        }
    }
}
