public class Main {
    public static void main (String[] args) {

        BinarySearchTree myBst = new BinarySearchTree();
        myBst.root = myBst.addRecursively(myBst.root, 5);
        myBst.root = myBst.addRecursively(myBst.root, 6);
        myBst.root = myBst.addRecursively(myBst.root, 4);

        myBst.inOrderTraverse(myBst.root);
        System.out.println(myBst.searchForValue(myBst.root, 5));
        System.out.println(myBst.searchForValue(myBst.root, 6));
        System.out.println(myBst.searchForValue(myBst.root, 4));
        System.out.println(myBst.searchForValue(myBst.root, 3));
        System.out.println(myBst.searchForValue(myBst.root, 8));
        System.out.println(myBst.findLowestValue(myBst.root));
        System.out.println(myBst.findHighestValue(myBst.root));

        System.out.println("Deleting 5");
        myBst.root = myBst.deleteRecursively(myBst.root, 5);
        myBst.inOrderTraverse(myBst.root);
    }
}