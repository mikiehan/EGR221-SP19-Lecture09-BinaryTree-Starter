package generaltree;
//TODO: Change this class to work with generic data type not int!
public class SearchTree {
    private SearchTreeNode overallRoot;

    // post: constructs an empty tree
    public SearchTree() {
        overallRoot = null;
    }

    // pre : the tree satisfies the binary search tree property
    // post: value is added so as to preserve the binary search tree property
    public void add(int value) {
        //implement your code here
    }

    // post: prints the data of the tree, one per line
    public void print() {
        printInorder(overallRoot);
    }

    // post: prints in inorder the data fields of the tree with given root
    private void printInorder(SearchTreeNode root) {
        if (root != null) {
            printInorder(root.left);
            System.out.println(root.data);
            printInorder(root.right);
        }
    }
}

