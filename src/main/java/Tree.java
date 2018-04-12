public class Tree
{
    private Tree left;
    private Tree right;

    private String data;

    public Tree(String value)
    {
        this.data = value;
    }

    public void insert(String data) {
        if (data.compareTo(this.data) <= 0) {
            if (this.left == null) {
                this.left = new Tree(data);
            } else {
                this.left.insert(data);
            }
        } else {
            if (this.right == null) {
                this.right = new Tree(data);
            } else {
                this.right.insert(data);
            }
        }
    }

    public boolean contains(String data) {
        if (data.equals(this.data)) {
            return true;
        } else {
            if (data.compareTo(this.data) <= 0) {
                if (this.left == null) {
                    return false;
                } else {
                    return this.left.contains(data);
                }
            } else {
                if (this.right == null) {
                    return false;
                } else {
                    return this.right.contains(data);
                }
            }
        }
    }

    public void printInOrder() {

        if (this.left != null) {
            this.left.printInOrder();
        }

        System.out.println(this.data);

        if (this.right != null) {
            this.right.printInOrder();
        }
    }

    public void printPreOrder() {

        System.out.println(this.data);

        if (this.left != null) {
            this.left.printInOrder();
        }

        if (this.right != null) {
            this.right.printInOrder();
        }
    }

    public void printPostOrder() {

        if (this.left != null) {
            this.left.printInOrder();
        }

        if (this.right != null) {
            this.right.printInOrder();
        }

        System.out.println(this.data);
    }
}
