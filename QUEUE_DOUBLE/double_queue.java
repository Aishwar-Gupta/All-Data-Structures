package QUEUE_DOUBLE;
class double_queue
{
    int size = 5;
    int arr[] = new int [size];
    int front = -1, rear = -1;

    // public void show()
    // {
    //     int i = front;
    //     do
    //     {
    //         System.out.print(arr[i] + " ");
    //         i = (i + 1) % size;
    //     }
    //     while(i != rear);
    //     System.out.println();
    // }

    public void show()
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" FRONT = " + front + " REAR = " + rear);
    }

    public void insert_front(int data)
    {
        if(front == -1 && rear == -1)
        {
            front = rear = 0;
            arr[front] = data;
        }
        else if((front - 1) % size == rear)
        {
            System.out.println("Queue is FULL!");
        }
        else
        {
            if(front == 0)
            {
                front = size-1;
                arr[front] = data;
            }
            else
            {
                front = (front - 1) % size;
                arr[front] = data;
            }
        }
    }

    public void insert_rear(int data)
    {
        if((rear + 1) % size == front)
        {
            System.out.println("Queue is FULL!");
        }
        else if(front == -1 && rear == -1)
        {
            front = rear = 0;
            arr[rear] = data;
        }
        else
        {
            rear = (rear + 1) % size;
            arr[rear] = data;
        }
    }

    public void delete_rear()
    {
        if( front == -1 && rear == -1)
        {
            System.out.println("Queue is EMPTY!");
        }
        else if( front == rear)
        {
            arr[rear] = 0;
            front = rear = -1;
        }
        else
        {
            if(rear == 0 && front != rear)
            {
                arr[rear] = 0;
                rear = size - 1;
            }
            else
            {
                arr[rear] = 0;
                rear = (rear - 1) % size;
            }
        }
    }

// 1 2 3 4 5 

    public void delete_front()
    {
        if(front == -1 && rear == -1)
        {
            System.out.println("Queue is EMPTY!");
        }
        else if(front == rear)
        {
            arr[front] = 0;
            front = rear = -1;
        }
        else
        {
            if(front == (size -1))
            {
                arr[front] = 0;
                front = 0;
                // arr[front] = 0;
            }
            else
            {
                arr[front] = 0;
                front = (front + 1) % size;
                // arr[front] = 0;
            }
        }
    }


    public static void main(String[] args)
    {
        double_queue que = new double_queue();
        que.insert_front(1);
        que.show();
        que.insert_rear(2);
        que.show();
        que.insert_rear(3);
        que.show();
        que.insert_rear(4);
        que.show();
        que.insert_front(5);
        que.show();
        System.out.println();
        // que.delete_rear();
        // que.show();
        // que.delete_rear();
        // que.show();
        // que.delete_rear();
        // que.show();
        // que.delete_rear();
        // que.show();
        // que.delete_rear();
        // que.show();
        que.delete_front();
        que.show();
        que.delete_front();
        que.show();
        que.delete_front();
        que.show();
        que.delete_front();
        que.show();
        que.delete_front();
        que.show();
    }
}