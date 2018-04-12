public class Application
{

    public static void main(String[] args)
    {
        Tree tree = new Tree("apple");

        tree.insert("banana");
        tree.insert("pear");
        tree.insert("peach");
        tree.insert("strawberry");
        tree.insert("kiwi");
        tree.insert("apricot");
        tree.insert("grape");
        tree.insert("cranberry");
        tree.insert("avocado");
        tree.insert("pineapple");
        tree.insert("carrot");
        tree.insert("lime");
        tree.insert("raisin");

        String contanText = "strawberry";

        System.out.println("This tree contains " + contanText + "? " + tree.contains("strawberry"));

        System.out.println("---------------IN-----------------");

        tree.printInOrder();

        System.out.println("---------------POST---------------");

        tree.printPostOrder();

        System.out.println("---------------PRE----------------");

        tree.printPreOrder();
    }
}
