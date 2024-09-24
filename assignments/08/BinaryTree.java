// Name:       Richard Eldridge
// Class:      CS 3305 W03
// Term:       Spring 2024
// Instructor: Carla McManus
// Assignment: 08-BTs
// IDE:        IntelliJ IDEA Edu


import java.util.*;

public class BinaryTree {
    Node root;

//======================
//    Push + helper method
//======================

//    add a new node to tree in a recursive manner
    private Node pushMethod(Node current, double number) {
        if (current == null) return new Node(number);

        if (number < current.number) {
            current.left = pushMethod(current.left, number);
        } else if (number > current.number) {
            current.right = pushMethod(current.right, number);
        }
        return current;
    }

    public void push(double number) {
        root = pushMethod(root, number);
    }


//======================
//    Transverse (multiple recursive methods for travel)
//======================
    public void preOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.number);
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(" " + node.number);
            inOrder(node.right);
        }
    }

    public void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(" " + node.number);
        }
    }


//======================
//    depth
//======================
    int height(Node node) {
//        Error handling
        if (node == null) return -1;

//        Find height of each side
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

//        return results of height
        if (leftHeight > rightHeight)  return (leftHeight + 1);
        return (rightHeight + 1);
    }


//======================
//    max
//======================
    double max (Node node) {
//        base case
        if (node.right == null) return node.number;
//        Recursive call
       return max(node.right
       );
    }


//======================
//    tree_sum
//======================
    double tree_sum (Node node, double x) {
        double sum = 0;

        if (node != null) {
            sum += node.number;
            sum += tree_sum(node.left, sum);
            sum += tree_sum(node.right, sum);
        }
        return sum;
    }


//======================
//    tree_average + helper method
//======================
    int NodeCount (Node node) {
//        Error handling
        if (node == null) return 0;

//        Find height of each side
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

//        return results of height
        return (leftHeight + rightHeight + 1);
    }

    double tree_average (Node node, double x) {
        return tree_sum(root, 0) / NodeCount(root);
    }


//======================
//    tree_is_balanced + helper method
//======================
boolean tree_is_balanced (Node node) {
//    (base case)Balanced if root is null
    if (node == null) return true;

    int
        left,
        right;

//    Find node height
    left = nodeHeight(node.left);
    right = nodeHeight(node.right);

//    Balanced
    if (Math.abs(left - right) <= 1 && tree_is_balanced(node.left) && tree_is_balanced(node.right)) return true;
    return false;
}

//    Recursive method to find height
    int nodeHeight(Node node) {
//        Base case
        if (node == null) return 0;
//        Recursion
        return 1 + Math.max(nodeHeight(node.left), nodeHeight(node.right));
    }



}
