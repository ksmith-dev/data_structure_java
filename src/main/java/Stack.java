public class Stack
{
    private Node head;

    public void push(String data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node previous = this.head;
            head = new Node(data);
            head.previous = previous;
        }
    }

    public String pop() {

        String data = null;

        if (head == null) {

        } else {
            data = head.data;
            head = head.previous;
        }
        return data;
    }

    private class Node {

        private String data;
        private Node previous;

        public Node(String data)
        {
            this.data = data;
        }
    }
}
