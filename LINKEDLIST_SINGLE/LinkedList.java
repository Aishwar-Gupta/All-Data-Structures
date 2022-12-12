package LINKEDLIST_SINGLE;
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

 import java.util.ArrayList;

class LinkedList<T>
{
    Node<T> head;

    public void add_start(T data)
    {
        Node<T> new_node = new Node<T>(data, head);
        head = new_node;
    }

    public void add_end(T data)
    {
        Node<T> start = head;
        if(start == null)
        {
            Node<T> new_node = new Node<T>(data, null);
            head = new_node;
        }
        else
        {
            while(start.next != null)
            {
                start = start.next;
            }
            Node<T> new_node = new Node<T>(data, null);
            start.next = new_node;
        }
    }

    public void add_index(T data, int index)
    {
        Node<T> start = head;
        if(index == 0)
        {
            Node<T> new_node = new Node<T>(data, start);
            head = new_node;
        }
        else
        {
            for(int i = 1; i < index; i++)
            {
                if(start == null)
                {
                    System.out.println("Index out of range!");
                    return ;
                }
                start = start.next;
            }
            Node<T> new_node = new Node<T>(data, start.next);
            start.next = new_node;
        }
    }

    public void delete_first()
    {
        if(head == null)
        {
            System.out.println("LinkedList is Empty!");
            return ;
        }
        else
        {
            head = head.next;
        }
    }

    public void delete_last()
    {
        Node<T> start = head;

        if(start == null)
        {
            System.out.println("Linkedlist is Empty!");
            return ;
        }
        else
        {
            while(start.next.next != null)
            {
                start = start.next;
            }
            start.next = null;
        }
    }

    public void delete_index(int index)
    {
        Node<T> start = head;
        
        if(start == null)
        {
            System.out.println("LinkedList is Empty!");
            return ;
        }
        if(index == 0)
        {
            delete_first();
        }
        else
        {
            for(int i = 0; i < index-1; i++)
            {
                if(start == null || start.next == null)
                {
                    System.out.println("Index out of Range!");
                    return ;
                }
                else
                {
                    start = start.next;
                }
            }
            if(start.next == null)
            {
                System.out.println("Index out of bound!");
                return ;
            }
            else
            {
                start.next = start.next.next;
            }
        }
    }

    public void search_first(T data)
    {
        Node<T> start = head;
        int index = 0;
        while(start != null)
        {
            if(start.data == data)
            {
                System.out.println("The data (" + data + ") found at index " + index);
                return ;
            }
            index++;
            start = start.next;
        }
        System.out.println("The data (" + data + ") was not found!");
        return ;
    }

    public void search_all(T data)
    {
        Node<T> start = head;
        ArrayList<Integer> positions = new ArrayList<Integer>();
        int index = 0;
        while(start != null)
        {
            if(start.data == data)
            {
                positions.add(index);
            }
            index++;
            start = start.next;
        }
        if(positions.size() > 0)
        {
            System.out.println("The data (" + data + ") found at positions: " + positions);
        }
        else
        {
            System.out.println("The data (" + data + ") was not found!");
        }
    }

    public void search_delete(T data)
    {
        Node<T> start = head;
        
        if(start == null)
        {
            System.out.println("LinkedList is Empty!");
            return ;
        }
        else if(start.data == data)
        {
            head = head.next;
        }
        else
        {
            while(start.next != null)
            {
                if(start.next.data == data)
                {
                    start.next = start.next.next;
                }
                else
                {
                    start = start.next;
                }
            }
        }
    }

    public void show()
    {
        Node<T> start = head;
        while(start != null)
        {
            System.out.print(start.data);
            System.out.print(" ---> ");
            start = start.next;
        }
        System.out.println(" ");
    }

    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add_start(5);
        list.add_start(10);
        list.add_end(20);
        list.add_end(30);
        list.add_end(30);
        list.add_index(30,1);
        // list.delete_first();
        // list.delete_last();
        list.show();
        list.delete_index(8);
        list.show();
        // list.search_first(20);
        // list.search_all(30);
        // list.search_delete(30);
        // list.show();
    }
}