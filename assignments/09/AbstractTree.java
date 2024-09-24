// Name:       Richard Eldridge
// Class:      CS 3305 W03
// Term:       Spring 2024
// Instructor: Carla McManus
// Assignment: 09-Part-2-AVL
// IDE:        IntelliJ IDEA Edu

import java.util.*;

public abstract class AbstractTree<E>
        implements Tree<E> {
    @Override /** Inorder traversal from the root*/
    public void inorder() {
    }
    @Override /** Postorder traversal from the root */
    public void postorder() {
    }
    @Override /** Preorder traversal from the root */
    public void preorder() {
    }
    @Override /** Return true if the tree is empty */
    public boolean isEmpty() {
        return getSize() == 0;
    }
}