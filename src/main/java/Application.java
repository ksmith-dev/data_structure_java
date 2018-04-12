public class Application
{

    public static void main(String[] args)
    {
        //testTree();
        //testStack();
        testLinkList();

    }

    private static void testTree() {
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

    private static void testStack() {
        Stack stack = new Stack();

        stack.push("one");
        stack.push("two");
        stack.push("three");
        stack.push("four");
        stack.push("five");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

    private static void testLinkList() {
        LinkList linkList = new LinkList("one");

        linkList.push("two");
        linkList.push("three");
        linkList.push("four");

        System.out.println(linkList.getHead());

        System.out.println(linkList.remove("two"));
        System.out.println(linkList.contains("two"));

        System.out.println(linkList.contains("four"));
    }
}
