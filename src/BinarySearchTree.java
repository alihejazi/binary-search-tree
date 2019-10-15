public class BinarySearchTree {

    Node root;

    public Node addIteratively (Node root, int value) {

        Node nodeToBeAdded = new Node(value);

        if (root == null) {
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


    public Node addRecursively (Node root, int value) {
        if (root == null) {
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

    public Node deleteRecursively (Node root, int value) {
        if (root == null) {
            return null;
        }

        else {
            if (value == root.value) {
                //case 1 leaf node
                if (root.leftChild == null && root.rightChild == null) {
                    root = null;
                }

                //case 2.1 only left child
                else if (root.leftChild != null && root.rightChild == null) {
                    root = root.leftChild;
                }

                //case 2.2 or only right child
                else if (root.leftChild == null && root.rightChild != null) {
                    root = root.rightChild;
                }

                //case 3 two children
                else {
                    //find right-most node in left subtree, i.e. highest node in left subtree
                    int swapValue = findHighestValue(root.leftChild);

                    //delete the swapValue node from it's original position
                    deleteRecursively(root, swapValue);

                    //change the root.value to the swapValue
                    root.value = swapValue;
                }
            }

            else if (value < root.value) {
                root.leftChild = deleteRecursively(root.leftChild, value);
            }

            else {
                root.rightChild = deleteRecursively(root.rightChild, value);
            }

            return root;
        }
    }


    public void inOrderTraverse (Node root) {
        if (root != null) {
            inOrderTraverse(root.leftChild);
            System.out.println(root);
            inOrderTraverse(root.rightChild);
        }
    }


    public void preOrderTraverse (Node root) {
        if (root != null) {
            System.out.println(root);
            preOrderTraverse(root.leftChild);
            preOrderTraverse(root.rightChild);
        }
    }


    public void postOrderTraverse (Node root) {
        if (root != null) {
            postOrderTraverse(root.leftChild);
            postOrderTraverse(root.rightChild);
            System.out.println(root);
        }
    }


    public boolean searchForValue (Node root, int value) {
        if (root == null) {
            return false;
        }

        else {
            if (root.value == value) {
                return true;
            }

            if (value <= root.value) {
                return searchForValue(root.leftChild, value);
            }

            else {
                return searchForValue(root.rightChild, value);
            }
        }
    }

    public Integer findLowestValue (Node root) {

        if (root == null) {
            return null;
        }

        else {
            if (root.leftChild == null) {
                return root.value;
            }

            else {
                return findLowestValue(root.leftChild);
            }
        }

    }


    public Integer findHighestValue (Node root) {
        if (root == null) {
            return null;
        }

        else {
            if (root.rightChild == null) {
                return root.value;
            }

            else {
                return (findHighestValue(root.rightChild));
            }
        }
    }

}
