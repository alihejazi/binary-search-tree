public class BinarySearchTree {

    public static Node addIteratively (Node root, int value) {

        Node nodeToBeAdded = new Node(value);

        if (root == null || root.value == null) {
            root = nodeToBeAdded;
            return root;
        }

        else {
            Node currentNode = root;

            while (true) {

                Node parent = currentNode;

                if (value <= currentNode.value) {
                    currentNode = currentNode.leftChild;

                    if (currentNode == null) {
                        parent.leftChild = nodeToBeAdded;
                        return root;
                    }

                }

                else if (value > currentNode.value) {
                    currentNode = currentNode.rightChild;

                    if (currentNode == null) {
                        parent.rightChild = nodeToBeAdded;
                        return root;
                    }
                }
            }

        }
    }



    public static Node addRecursively (Node root, int value) {
        if (root == null || root.value == null) {
            return new Node(value);
        }

        else {
            if (value <= root.value) {
                root.leftChild = addRecursively(root.leftChild, value);
            }

            else if (value > root.value) {
                root.rightChild = addRecursively(root.rightChild, value);
            }
        }
        return root;
    }


    public static void inOrderTraverse (Node root) {
        if (root != null) {
            inOrderTraverse(root.leftChild);
            System.out.println(root);
            inOrderTraverse(root.rightChild);
        }
    }


    public static void preOrderTraverse (Node root) {
        if (root != null) {
            System.out.println(root);
            preOrderTraverse(root.leftChild);
            preOrderTraverse(root.rightChild);
        }
    }


    public static void postOrderTraverse (Node root) {
        if (root != null) {
            postOrderTraverse(root.leftChild);
            postOrderTraverse(root.rightChild);
            System.out.println(root);
        }
    }

}
