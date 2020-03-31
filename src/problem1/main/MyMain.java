
import problem1.mybst.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree binarySearchTree = new MyBinarySearchTree();
        binarySearchTree.insert(15);
        binarySearchTree.insert(10);
        binarySearchTree.insert(50);
        binarySearchTree.insert(55);
        binarySearchTree.insert(60);

        System.out.println("Left children of the binary search tree: ");
        binarySearchTree.traverse();
        System.out.println("No.of Parents not having their left child are:");
        System.out.println(binarySearchTree.getCountRight());

    }
}

