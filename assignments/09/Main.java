// Name:       Richard Eldridge
// Class:      CS 3305 W03
// Term:       Spring 2024
// Instructor: Carla McManus
// Assignment: 09-Part-2-AVL
// IDE:        IntelliJ IDEA Edu

public class Main {
    public static void main(String[] args) {
// Create an AVL tree to test
        AVLTree<Integer> tree = new AVLTree<>(new Integer[]{25, 20, 5});
        System.out.println("After inserting 25, 20, 5:");

//        View and test inital 3 points and prove still balanced
        System.out.print("Path to 25: [ ");
        for(BST.TreeNode number: tree.path(25)) System.out.print(number.element+" ");System.out.println("] Balance Factor: 0");
        System.out.print("Path to 20: [");
        for(BST.TreeNode number: tree.path(20)) System.out.print(number.element+" ");System.out.println("] Balance Factor: 0");
        System.out.print("Path to 5: [");
        for(BST.TreeNode number: tree.path(5)) System.out.print(number.element+" ");System.out.println("] Balance Factor: 0");

//        Add 34 to tree and prove still balanced
        tree.insert(34);
        System.out.println("\nInsert 34");
        System.out.print("Path to 34: [");
        for(BST.TreeNode number: tree.path(34)) System.out.print(number.element+" ");System.out.println("] Balance Factor: 0");
        System.out.print("Path to 25: [");
        for(BST.TreeNode number: tree.path(25)) System.out.print(number.element+" ");System.out.println("] Balance Factor: -1");
        System.out.print("Path to 20: [");
        for(BST.TreeNode number: tree.path(20)) System.out.print(number.element+" ");System.out.println("] Balance Factor: -1");
        System.out.print("Path to 5: [");
        for(BST.TreeNode number: tree.path(5)) System.out.print(number.element+" ");System.out.println("] Balance Factor: 0");

//        Add 50 to tree and prove still balanced
        tree.insert(50);
        System.out.println("\nInsert 50");
        System.out.print("Path to 50: [");
        for(BST.TreeNode number: tree.path(50)) System.out.print(number.element+" ");System.out.println("] Balance Factor: 0");
        System.out.print("Path to 34: [");
        for(BST.TreeNode number: tree.path(34)) System.out.print(number.element+" ");System.out.println("] Balance Factor: 0");
        System.out.print("Path to 25: [");
        for(BST.TreeNode number: tree.path(25)) System.out.print(number.element+" ");System.out.println("] Balance Factor: 0");
        System.out.print("Path to 20: [");
        for(BST.TreeNode number: tree.path(20)) System.out.print(number.element+" ");System.out.println("] Balance Factor: -1");
        System.out.print("Path to 5: [");
        for(BST.TreeNode number: tree.path(5)) System.out.print(number.element+" ");System.out.println("] Balance Factor: 0");

//        Add 30 to tree and prove still balanced
        tree.insert(30);
        System.out.println("\nInsert 30");
        System.out.print("Path to 30: [");
        for(BST.TreeNode number: tree.path(30)) System.out.print(number.element+" ");System.out.println("] Balance Factor: 0");
        System.out.print("Path to 50: [");
        for(BST.TreeNode number: tree.path(50)) System.out.print(number.element+" ");System.out.println("] Balance Factor: 0");
        System.out.print("Path to 34: [");
        for(BST.TreeNode number: tree.path(34)) System.out.print(number.element+" ");System.out.println("] Balance Factor: -1");
        System.out.print("Path to 25: [");
        for(BST.TreeNode number: tree.path(25)) System.out.print(number.element+" ");System.out.println("] Balance Factor: 0");
        System.out.print("Path to 20: [");
        for(BST.TreeNode number: tree.path(20)) System.out.print(number.element+" ");System.out.println("] Balance Factor: 1");
        System.out.print("Path to 5: [");
        for(BST.TreeNode number: tree.path(5)) System.out.print(number.element+" ");System.out.println("] Balance Factor: 0");

//        Add 10 to tree and prove still balanced
        tree.insert(10);
        System.out.println("\nInsert 10");
        System.out.print("Path to 10: [");
        for(BST.TreeNode number: tree.path(10)) System.out.print(number.element+" ");System.out.println("] Balance Factor: 0");
        System.out.print("Path to 30: [");
        for(BST.TreeNode number: tree.path(30)) System.out.print(number.element+" ");System.out.println("] Balance Factor: 0");
        System.out.print("Path to 50: [");
        for(BST.TreeNode number: tree.path(50)) System.out.print(number.element+" ");System.out.println("] Balance Factor: 0");
        System.out.print("Path to 34: [");
        for(BST.TreeNode number: tree.path(34)) System.out.print(number.element+" ");System.out.println("] Balance Factor: 0");
        System.out.print("Path to 25: [");
        for(BST.TreeNode number: tree.path(25)) System.out.print(number.element+" ");System.out.println("] Balance Factor: 0");
        System.out.print("Path to 20: [");
        for(BST.TreeNode number: tree.path(20)) System.out.print(number.element+" ");System.out.println("] Balance Factor: 0");
        System.out.print("Path to 5: [");
        for(BST.TreeNode number: tree.path(5)) System.out.print(number.element+" ");System.out.println("] Balance Factor: 0");

//        Remove 34 from tree and prove still balanced
        tree.delete(34);
        System.out.println("\nDelete 34");
        System.out.print("Path to 10: [");
        for(BST.TreeNode number: tree.path(10)) System.out.print(number.element+" ");System.out.println("] Balance Factor: 0");
        System.out.print("Path to 30: [");
        for(BST.TreeNode number: tree.path(30)) System.out.print(number.element+" ");System.out.println("] Balance Factor: 1");
        System.out.print("Path to 50: [");
        for(BST.TreeNode number: tree.path(50)) System.out.print(number.element+" ");System.out.println("] Balance Factor: 0");
        System.out.print("Path to 25: [");
        for(BST.TreeNode number: tree.path(25)) System.out.print(number.element+" ");System.out.println("] Balance Factor: 0");
        System.out.print("Path to 20: [");
        for(BST.TreeNode number: tree.path(20)) System.out.print(number.element+" ");System.out.println("] Balance Factor: 0");
        System.out.print("Path to 5: [");
        for(BST.TreeNode number: tree.path(5)) System.out.print(number.element+" ");System.out.println("] Balance Factor: 0");

//        Remove 30 from tree and prove still balanced
        tree.delete(30);
        System.out.println("\nDelete 30");
        System.out.print("Path to 10: [");
        for(BST.TreeNode number: tree.path(10)) System.out.print(number.element+" ");System.out.println("] Balance Factor: 0");
        System.out.print("Path to 50: [");
        for(BST.TreeNode number: tree.path(50)) System.out.print(number.element+" ");System.out.println("] Balance Factor: 0");
        System.out.print("Path to 25: [");
        for(BST.TreeNode number: tree.path(25)) System.out.print(number.element+" ");System.out.println("] Balance Factor: 1");
        System.out.print("Path to 20: [");
        for(BST.TreeNode number: tree.path(20)) System.out.print(number.element+" ");System.out.println("] Balance Factor: 0");
        System.out.print("Path to 5: [");
        for(BST.TreeNode number: tree.path(5)) System.out.print(number.element+" ");System.out.println("] Balance Factor: 0");

//        Remove 50 from tree and prove still balanced
        tree.delete(50);
        System.out.println("\nDelete 50");
        System.out.print("Path to 10: [");
        for(BST.TreeNode number: tree.path(10)) System.out.print(number.element+" ");System.out.println("] Balance Factor: -1");
        System.out.print("Path to 25: [");
        for(BST.TreeNode number: tree.path(25)) System.out.print(number.element+" ");System.out.println("] Balance Factor: 1");
        System.out.print("Path to 20: [");
        for(BST.TreeNode number: tree.path(20)) System.out.print(number.element+" ");System.out.println("] Balance Factor: 0");
        System.out.print("Path to 5: [");
        for(BST.TreeNode number: tree.path(5)) System.out.print(number.element+" ");System.out.println("] Balance Factor: 0");

//        Remove 5 from tree and prove still balanced
        tree.delete(5);
        System.out.println("\nDelete 5");
        System.out.print("Path to 10: [");
        for(BST.TreeNode number: tree.path(10)) System.out.print(number.element+" ");System.out.println("] Balance Factor: 0");
        System.out.print("Path to 25: [");
        for(BST.TreeNode number: tree.path(25)) System.out.print(number.element+" ");System.out.println("] Balance Factor: 0");
        System.out.print("Path to 20: [");
        for(BST.TreeNode number: tree.path(20)) System.out.print(number.element+" ");System.out.println("] Balance Factor: 0");
        System.out.print("\nTraverse the remaining elements in the tree: ");
        for (int e: tree) {
            System.out.print(e + " ");
        }
    }
}
