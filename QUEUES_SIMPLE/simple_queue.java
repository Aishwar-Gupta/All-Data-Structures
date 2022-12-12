package QUEUES_SIMPLE;
class simple_queue
{
    int size = 2;
    int arr[] = new int[size];
    int head = 0, tail = 0;

    public void push(int data)
    {
        if(tail < size)
        {
            arr[tail] = data;
            tail++;
        }
        else
        {
            size *= 2;
            int new_arr[] = new int[size];
            for(int i = 0; i < arr.length; i++)
            {
                new_arr[i] = arr[i];
            }
            arr = new_arr;
            arr[tail] = data;
            tail++;
        }
    }

    public int pop()
    {
        int element = arr[head];
        if(tail - head > size/2)
        {
            arr[head] = 0;
            head++;
        }
        else
        {
            size /= 2;
            int new_arr[] = new int[size];
            for(int i = head; i < tail; i++)
            {
                new_arr[i-head] = arr[i];
            }
            arr = new_arr;
            tail -= head;
            head = 0; 
            arr[head] = 0;
            head++;
        }
        

        return element;
    }

    public void show()
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println("  SIZE = " + size + " HEAD = " + head + " TAIL = " + (tail-1));
    }




    public static void main(String args[])
    {
        simple_queue queue = new simple_queue();
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
        queue.push(6);
        queue.show();
        queue.push(7);
        queue.show();
        queue.push(8);
        queue.show();
        queue.pop();
        queue.show();
        queue.pop();
        queue.show();
        queue.pop();
        queue.show();
        queue.pop();
        queue.show();
        queue.pop();
        queue.show();
        queue.push(100);
        queue.show();
        queue.pop();
        queue.show();
        queue.push(200);
        queue.show();
        queue.pop();
        queue.show();
    }
}