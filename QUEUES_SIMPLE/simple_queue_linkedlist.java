package QUEUES_SIMPLE;
class simple_queue_linkedlist<T>
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
    int begin;
    int tail;
    int size;

    public void push(T data)
    {
        Node start = head;
        if(head == null)
        {
            Node new_node = new Node(data, null);
            head = new_node;
            size++;
        }
        else
        {
            while(start.next != null)
            {
                start = start.next;
            }
            Node new_node = new Node(data, null);
            start.next = new_node;
            size++;
            tail++;
        }
    }

    public T pop()
    {
        Node start = head;
        if(start.next == null)
        {
            head = null;
            size--;
            return start.data;
        }
        while(start.next.next != null)
        {
            start = start.next;
        }
        T element = start.next.data;
        start.next = null;
        size--;
        tail--;
        return element;
    }

    public void show()
    {
        Node start = head;
        while(start != null)
        {
            System.out.print(start.data + " ---> ");
            start = start.next;
        }
        System.out.println( " SIZE = " + size + " HEAD = " + begin + " TAIL = " + tail);
    }



    public static void main(String[] args)
    {
        simple_queue_linkedlist<Integer> queue = new simple_queue_linkedlist<Integer>();
        queue.show();
        queue.push(1);
        queue.show();
        queue.push(2);
        queue.show();
        queue.push(3);
        queue.show();
        queue.push(4);
        queue.show();
        queue.push(5);
        queue.show();
        System.out.println(queue.pop());
        queue.show();
        System.out.println(queue.pop());
        queue.show();
        System.out.println(queue.pop());
        queue.show();
        System.out.println(queue.pop());
        queue.show();
        System.out.println(queue.pop());
        queue.show();
        queue.push(5);
        queue.show();
        System.out.println(queue.pop());
        queue.show();
        
    }
}