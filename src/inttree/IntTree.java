package inttree;

/**
 * Complete this class
 */
public class IntTree {

    // post: constructs an empty tree
    public IntTree() {

    }

    // pre : max > 0
    // post: constructs a sequential tree with given number of
    //       nodes
    public IntTree(int max) {
        if (???) {
            throw new IllegalArgumentException("max: " + max);
        }
        //Do something here
    }

    // post: returns a sequential tree with n as its root unless
    //       n is greater than max, in which case it returns an
    //       empty tree
    private IntTreeNode buildSequentialTree(int n, int max) {
        //Do something here
        return null;
    }

    // post: prints the tree contents using a preorder traversal
    public void printPreorder() {
        System.out.print("preorder:");
        //Do something here
        System.out.println();
    }

    // post: prints in preorder the tree with given root
    private void printPreorder(IntTreeNode root) {
        //Do something here
    }

    // post: prints the tree contents using an inorder traversal
    public void printInorder() {
        System.out.print("inorder:");
        //Do something here
        System.out.println();
    }

    // post: prints in inorder the tree with given root
    private void printInorder(IntTreeNode root) {
        //Do something here
    }

    // post: prints the tree contents using a postorder traversal
    public void printPostorder() {
        System.out.print("postorder:");
        //Do something here
        System.out.println();
    }

    // post: prints in postorder the tree with given root
    private void printPostorder(IntTreeNode root) {
        //Do something here
    }

    // post: prints the tree contents, one per line, following an
    //       inorder traversal and using indentation to indicate
    //       node depth; prints right to left so that it looks
    //       correct when the output is rotated.
    public void printSideways() {
        System.out.print("side-ways:");
        //Do something here
        System.out.println();
    }

    // post: prints in reversed preorder the tree with given
    //       root, indenting each line to the given level
    private void printSideways(IntTreeNode root, int level) {
        System.out.print("postorder:");
        //Do something here
        System.out.println();
    }

    //helper method for printSideways printing data with spaces given data and level
    private static void printData(int data, int level){
        for (int i = 0; i < level; i++) {
            System.out.print("    ");
        }
        System.out.println(data);
    }

    // pre : tree is a binary search tree
    // post: value is added to overall tree so as to preserve the binary search
    //       tree property
    // WARNING : Never enable buildSequentialTree and add together
    // We either have sequential tree or binary search tree (cannot do both!)
    // This class is just to provide you different examples of building tree
    // Comment out buildSequentialTree when we implement this add method
    public void add(int value) {
        //implement your code here
    }
}
