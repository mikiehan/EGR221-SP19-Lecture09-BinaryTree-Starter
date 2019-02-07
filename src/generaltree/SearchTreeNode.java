package generaltree;
//TODO: Change this class to work with generic data type not int!
public class SearchTreeNode {
    public int data;		  // data stored at this generaltree.SearchTreeNode<E>
    public SearchTreeNode left;  // reference to left subtree
    public SearchTreeNode right; // reference to right subtree

    // post: constructs a leaf node with given data
    public SearchTreeNode(int data) {
        this(data, null, null);
    }

    // post: constructs a generaltree.SearchTreeNode<E> with the given data and links
    public SearchTreeNode(int data, SearchTreeNode left, SearchTreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
