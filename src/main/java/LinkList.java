public class LinkList
{
    private Node head;

    public LinkList(String data)
    {
        this.head = new Node(data);
    }

    public void push(String data) {
        if (head.next == null) {
            head.next = new Node(data);
        } else {

            Node current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = new Node(data);
        }
    }

    public String getHead() {
        return head.data;
    }

    public boolean contains(String data) {

        Node current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public boolean remove(String data) {
        Node current = head;
        while (current.next != null) {
            if (current.data.equals(data)) {
                current.data = current.next.data;
                current.next = current.next.next;
                return true;
            } else {
                current = current.next;
            }
        }
        return false;
    }

    private class Node {

        private String data;

        private Node next;

        public Node(String data)
        {
            this.data = data;
        }
    }
}
