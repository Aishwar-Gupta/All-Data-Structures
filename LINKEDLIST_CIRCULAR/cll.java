package LINKEDLIST_CIRCULAR;
class cll<T>
{
    class Node
    {
        T data;
        Node next;

        Node(T data, Node next)
        {
            this.data = data;
            this.next = next;
        }
    }

    Node head;

    public void add(T data)
    {
        Node start = head;
        if(head == null)
        {
            Node new_node = new Node(data, null);
            head = new_node;
            new_node.next = head;
        }
        else
        {
            while(start.next != head)
            {
                start = start.next;
            }
            Node new_node = new Node(data, head);
            start.next = new_node;
        }
    }

    public void show()
    {
        Node start = head;
        while(start.next != head)
        {
            System.out.print(start.data + " ---> ");
            start = start.next;
        }
        System.out.println(start.data);
        System.out.println("Next should be head:" + start.next.data);
    }

    public static void main(String[] args)
    {
        cll<Integer> list = new cll<>();
        list.add(1);
        list.show();
        list.add(2);
        list.show();
        list.add(3);
        list.show();
    }
}