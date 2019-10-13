public class Node {

    Integer value;
    Node leftChild, rightChild;

    Node() {

    }

    Node(int value) {
        this.value = value;
    }


    public String toString() {
        return "Node has value " + value + ".";
    }
}
