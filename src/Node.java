public class Node {

    int value;
    Node leftChild, rightChild;

    Node(int value) {
        this.value = value;
    }


    public String toString() {
        return "Node has value " + value + ".";
    }
}
