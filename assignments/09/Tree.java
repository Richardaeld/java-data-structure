// Name:       Richard Eldridge
// Class:      CS 3305 W03
// Term:       Spring 2024
// Instructor: Carla McManus
// Assignment: 09-Part-2-AVL
// IDE:        IntelliJ IDEA Edu

public interface Tree<E> extends Iterable<E> {
    /** Return true if the element is in the tree */
    public boolean search(E e);
    /** Insert element e into the binary search tree.
     * Return true if the element is inserted successfully. */
    public boolean insert(E e);
    /** Delete the specified element from the tree.
     * Return true if the element is deleted successfully. */
    public boolean delete(E e);
    /** Inorder traversal from the root*/
    public void inorder();
    /** Postorder traversal from the root */
    public void postorder();
    /** Preorder traversal from the root */
    public void preorder();
    /** Get the number of nodes in the tree */
    public int getSize();
    /** Return true if the tree is empty */
    public boolean isEmpty();
}