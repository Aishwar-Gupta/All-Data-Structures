package LINKEDLIST_DOUBLE;
/*
 * Available Functions:
 * 
 * INSERT:
 * void add_start(T data)
 * void add_end(T data)
 * void add_index(T data, int index)
 * 
 * DELETE:
 * void delete_first()
 * void delete_last()
 * void delete_index(int index)
 * 
 * SEARCH:
 * void search_first(T data)
 * void search_all(T data)
 * void search_delete(T data)
 * 
 * TRAVERSE:
 * void show()
 *  
 */



class doublelinkedlist<T>
{
    Node head;
    Node tail;

    private class Node
    {
        T data;
        Node prev;
        Node next;

        Node(T data, Node prev, Node next)
        {
            this. data = data;
            this.prev = prev;
            this.next = next;
        }
    }

    public void add_start(T data)
    {
        Node start = head;
        if(start == null)
        {
            Node new_node = new Node(data, null, null);
            head = new_node;
            tail = new_node;
        }
        else
        {
            Node new_node = new Node(data, null, head);
            head.prev = new_node;
            head = new_node;
        }
    }

    public void add_end(T data)
    {
        Node new_node = new Node(data, tail, null);
        tail.next = new_node;
        tail = new_node;
    }

    public void add_index(T data, int index)
    {
        Node start = head;
        if(start == null)
        {
            System.out.println("Empty Linkedlist!");
            return ;
        }
        if(index == 0)
        {
            this.add_start(data);
            return ;
        }
        for(byte i = 1; i < index; i++)
        {
            if(start == null || start.next == null)
            {
                System.out.println("Index out of bound!");
                return ;
            }
            else
            {
                start = start.next;
            }
        }
        if(start.next == null)
        {
            Node new_node = new Node(data, start, start.next);
            start.next = new_node;
            tail = new_node;
        }
        else
        {
            Node new_node = new Node(data, start, start.next);
            start.next.prev = new_node;
            start.next = new_node;
        }
    }

    public void delete_first()
    {
        head = head.next;
        head.prev = null;
    }

    public void delete_last()
    {
        Node start = head;
        while(start.next.next != null)
        {
            start = start.next;
        }
        start.next.prev = null;
        start.next = null;
        tail = start;
    }

    public void delete_index(int index)
    {
        Node start = head;
        if(start == null)
        {
            System.out.println("Empty Linkdelist!");
            return ;
        }
        else
        {
            if(index == 0)
            {
                this.delete_first();
            }
            else
            {
                for(int i = 1; i < index; i++)
                {
                    if(start == null || start.next == null)
                    {
                        System.out.println("Index out of bound!");
                        return ;
                    }
                    else
                    {
                        start = start.next;
                    }
                }
                if(start.next == null)
                {
                    System.out.println("Out of Bound!");
                    return ;
                }
                if(start.next.next == null)
                {
                    start.next.prev = null;
                    start.next = null;
                    tail = start;
                }
                else
                {
                    start.next = start.next.next;
                    start.next.prev = start;
                }
            }
        }
    }


    public void show()
    {
        Node start = head;
        while (start != null) 
        {
            System.out.print(start.data + " <-->> ");
            start = start.next;
        }
        System.out.println();
    }

    public void show_reverse()
    {
        Node end = tail;
        while(end != null)
        {
            System.out.print(end.data + " <<--> ");
            end = end.prev;
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        doublelinkedlist<Integer> list = new doublelinkedlist<>();
        list.add_start(5);
        // list.show();
        list.add_start(4);
        // list.show();
        list.add_start(3);
        // list.show();
        list.add_end(6);
        list.show();
        // list.show_reverse();
        // list.add_index(0, 0);
        // list.delete_last();
        list.delete_index(2);
        list.show();
        list.show_reverse();
    }
}