// Name:       Richard Eldridge
// Class:      CS 3305 W03
// Term:       Spring 2024
// Instructor: Carla McManus
// Assignment: 08-BTs
// IDE:        IntelliJ IDEA Edu

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Create trees
        BinaryTree binaryTree1Pre = new BinaryTree();
        BinaryTree binaryTree1In = new BinaryTree();
        BinaryTree binaryTree2Pre = new BinaryTree();
        BinaryTree binaryTree2In = new BinaryTree();
        BinaryTree binaryTree3Pre = new BinaryTree();
        BinaryTree binaryTree3In = new BinaryTree();
        BinaryTree binaryTree4Pre = new BinaryTree();
        BinaryTree binaryTree4In = new BinaryTree();
        BinaryTree binaryTree5Pre = new BinaryTree();
        BinaryTree binaryTree5In = new BinaryTree();
        BinaryTree binaryTree6Pre = new BinaryTree();
        BinaryTree binaryTree6In = new BinaryTree();

//        populate trees
        for (int number: BinaryTreeSamples.sample1("pre")) binaryTree1Pre.push(number);
        for (int number: BinaryTreeSamples.sample1("pre")) binaryTree1In.push(number);
        for (int number: BinaryTreeSamples.sample2("pre")) binaryTree2Pre.push(number);
        for (int number: BinaryTreeSamples.sample2("pre")) binaryTree2In.push(number);
        for (double number: BinaryTreeSamples.sample3("pre")) binaryTree3Pre.push(number);
        for (double number: BinaryTreeSamples.sample3("pre")) binaryTree3In.push(number);
        for (double number: BinaryTreeSamples.sample4("pre")) binaryTree4Pre.push(number);
        for (double number: BinaryTreeSamples.sample4("pre")) binaryTree4In.push(number);
        for (double number: BinaryTreeSamples.sample5("pre")) binaryTree5Pre.push(number);
        for (double number: BinaryTreeSamples.sample5("pre")) binaryTree5In.push(number);
        for (double number: BinaryTreeSamples.sample6("pre")) binaryTree6Pre.push(number);
        for (double number: BinaryTreeSamples.sample6("pre")) binaryTree6In.push(number);

//        Print pre and in tree 1
        System.out.println("\nTree 1 Pre\n -------------");
//        System.out.print("Pre order: ");
//        binaryTree1Pre.preOrder(binaryTree1Pre.root);
        System.out.println("Depth: " + binaryTree1Pre.height(binaryTree1Pre.root));
        System.out.println("Max: " + binaryTree1Pre.max(binaryTree1Pre.root));
        System.out.println("Tree Sum: " + binaryTree1Pre.tree_sum(binaryTree1Pre.root, 0));
        System.out.println("Tree AVG: " + binaryTree1Pre.tree_average(binaryTree1Pre.root, 0));
        System.out.println("Tree is Balanced: " + (binaryTree1Pre.tree_is_balanced(binaryTree1Pre.root) ? "Yes" : "No"));
        System.out.println("\nTree 1 In\n -------------");
//        System.out.print("In order: ");
//        binaryTree1In.inOrder(binaryTree1In.root);
        System.out.println("Depth: " + binaryTree1In.height(binaryTree1In.root));
        System.out.println("Max: " + binaryTree1In.max(binaryTree1In.root));
        System.out.println("Tree Sum: " + binaryTree1In.tree_sum(binaryTree1In.root, 0));
        System.out.println("Tree AVG: " + binaryTree1In.tree_average(binaryTree1In.root, 0));
        System.out.println("Tree is Balanced: " + (binaryTree1In.tree_is_balanced(binaryTree1In.root) ? "Yes" : "No"));

//        Print pre and in tree 2
        System.out.println("\nTree 2 Pre\n -------------");
//        System.out.print("Pre order: ");
//        binaryTree2Pre.preOrder(binaryTree2Pre.root);
        System.out.println("Depth: " + binaryTree2Pre.height(binaryTree2Pre.root));
        System.out.println("Max: " + binaryTree2Pre.max(binaryTree2Pre.root));
        System.out.println("Tree Sum: " + binaryTree2Pre.tree_sum(binaryTree2Pre.root, 0));
        System.out.println("Tree AVG: " + binaryTree2Pre.tree_average(binaryTree2Pre.root, 0));
        System.out.println("Tree is Balanced: " + (binaryTree2Pre.tree_is_balanced(binaryTree2Pre.root) ? "Yes" : "No"));
        System.out.println("\nTree 2 In\n -------------");
//        System.out.print("In order: ");
//        binaryTree2In.inOrder(binaryTree2In.root);
        System.out.println("Depth: " + binaryTree2In.height(binaryTree2In.root));
        System.out.println("Max: " + binaryTree2In.max(binaryTree2In.root));
        System.out.println("Tree Sum: " + binaryTree2In.tree_sum(binaryTree2In.root, 0));
        System.out.println("Tree AVG: " + binaryTree2In.tree_average(binaryTree2In.root, 0));
        System.out.println("Tree is Balanced: " + (binaryTree2In.tree_is_balanced(binaryTree2In.root) ? "Yes" : "No"));

//        Print pre and in tree 3
        System.out.println("\nTree 3 Pre\n -------------");
//        System.out.print("Pre order: ");
//        binaryTree3Pre.preOrder(binaryTree3Pre.root);
        System.out.println("Depth: " + binaryTree3Pre.height(binaryTree3Pre.root));
        System.out.println("Max: " + binaryTree3Pre.max(binaryTree3Pre.root));
        System.out.println("Tree Sum: " + binaryTree3Pre.tree_sum(binaryTree3Pre.root, 0));
        System.out.println("Tree AVG: " + binaryTree3Pre.tree_average(binaryTree3Pre.root, 0));
        System.out.println("Tree is Balanced: " + (binaryTree3Pre.tree_is_balanced(binaryTree3Pre.root) ? "Yes" : "No"));
        System.out.println("\nTree 3 In \n -------------");
//        System.out.print("In order: ");
//        binaryTree3In.inOrder(binaryTree3In.root);
        System.out.println("Depth: " + binaryTree3In.height(binaryTree3In.root));
        System.out.println("Max: " + binaryTree3In.max(binaryTree3In.root));
        System.out.println("Tree Sum: " + binaryTree3In.tree_sum(binaryTree3In.root, 0));
        System.out.println("Tree AVG: " + binaryTree3In.tree_average(binaryTree3In.root, 0));
        System.out.println("Tree is Balanced: " + (binaryTree3In.tree_is_balanced(binaryTree3In.root) ? "Yes" : "No"));

//        Print pre and in tree 4
        System.out.println("\nTree 4 Pre\n -------------");
//        System.out.print("Pre order: ");
//        binaryTree4Pre.preOrder(binaryTree4Pre.root);
        System.out.println("Depth: " + binaryTree4Pre.height(binaryTree4Pre.root));
        System.out.println("Max: " + binaryTree4Pre.max(binaryTree4Pre.root));
        System.out.println("Tree Sum: " + binaryTree4Pre.tree_sum(binaryTree4Pre.root, 0));
        System.out.println("Tree AVG: " + binaryTree4Pre.tree_average(binaryTree4Pre.root, 0));
        System.out.println("Tree is Balanced: " + (binaryTree4Pre.tree_is_balanced(binaryTree4Pre.root) ? "Yes" : "No"));
        System.out.println("\nTree 4 In\n -------------");
//        System.out.print("In order: ");
//        binaryTree4In.inOrder(binaryTree4In.root);
        System.out.println("Depth: " + binaryTree4In.height(binaryTree4In.root));
        System.out.println("Max: " + binaryTree4In.max(binaryTree4In.root));
        System.out.println("Tree Sum: " + binaryTree4In.tree_sum(binaryTree4In.root, 0));
        System.out.println("Tree AVG: " + binaryTree4In.tree_average(binaryTree4In.root, 0));
        System.out.println("Tree is Balanced: " + (binaryTree4In.tree_is_balanced(binaryTree4In.root) ? "Yes" : "No"));

//        Print pre and in tree 5
        System.out.println("\nTree 5 Pre\n -------------");
//        System.out.print("Pre order: ");
//        binaryTree5Pre.preOrder(binaryTree5Pre.root);
        System.out.println("Depth: " + binaryTree5Pre.height(binaryTree5Pre.root));
        System.out.println("Max: " + binaryTree5Pre.max(binaryTree5Pre.root));
        System.out.println("Tree Sum: " + binaryTree5Pre.tree_sum(binaryTree5Pre.root, 0));
        System.out.println("Tree AVG: " + binaryTree5Pre.tree_average(binaryTree5Pre.root, 0));
        System.out.println("Tree is Balanced: " + (binaryTree5Pre.tree_is_balanced(binaryTree5Pre.root) ? "Yes" : "No"));
        System.out.println("\nTree 5 In\n -------------");
//        System.out.print("In order: ");
//        binaryTree5In.inOrder(binaryTree5In.root);
        System.out.println("Depth: " + binaryTree5In.height(binaryTree5In.root));
        System.out.println("Max: " + binaryTree5In.max(binaryTree5In.root));
        System.out.println("Tree Sum: " + binaryTree5In.tree_sum(binaryTree5In.root, 0));
        System.out.println("Tree AVG: " + binaryTree5In.tree_average(binaryTree5In.root, 0));
        System.out.println("Tree is Balanced: " + (binaryTree5In.tree_is_balanced(binaryTree5In.root) ? "Yes" : "No"));

//        Print pre and in tree 6
        System.out.println("\nTree 6 Pre\n -------------");
//        System.out.print("Pre order: ");
//        binaryTree6Pre.preOrder(binaryTree6Pre.root);
        System.out.println("Depth: " + binaryTree6Pre.height(binaryTree6Pre.root));
        System.out.println("Max: " + binaryTree6Pre.max(binaryTree6Pre.root));
        System.out.println("Tree Sum: " + binaryTree6Pre.tree_sum(binaryTree6Pre.root, 0));
        System.out.println("Tree AVG: " + binaryTree6Pre.tree_average(binaryTree6Pre.root, 0));
        System.out.println("Tree is Balanced: " + (binaryTree6Pre.tree_is_balanced(binaryTree6Pre.root) ? "Yes" : "No"));
        System.out.println("\nTree 6 In\n -------------");
//        System.out.print("In order: ");
//        binaryTree6In.inOrder(binaryTree6In.root);
        System.out.println("Depth: " + binaryTree6In.height(binaryTree6In.root));
        System.out.println("Max: " + binaryTree6In.max(binaryTree6In.root));
        System.out.println("Tree Sum: " + binaryTree6In.tree_sum(binaryTree6In.root, 0));
        System.out.println("Tree AVG: " + binaryTree6In.tree_average(binaryTree6In.root, 0));
        System.out.println("Tree is Balanced: " + (binaryTree6In.tree_is_balanced(binaryTree6In.root) ? "Yes" : "No"));

    }
}