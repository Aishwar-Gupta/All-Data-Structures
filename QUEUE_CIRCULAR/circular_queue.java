package QUEUE_CIRCULAR;
class circular_queue
{
    int size = 5;
    int arr[] = new int[size];
    int front = -1, rear = -1;

    public boolean isempty()
    {
        return front == -1 && rear == -1;
    }

    public boolean isfull()
    {
        return (rear +1) % size == front;
    }

    public void peek()
    {
        System.out.println(arr[front]);
    }

    public void show()
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" Front = " + front + " Rear = " + rear);
    }

    public void print()
    {
        System.out.print("Here is the queue in order : ");
        int i = front;
        do
        {
            System.out.print(arr[i] + " ");
        }
        while( (front+1)% size != rear);
    }

    public void enqueue(int data)
    {
        if(isempty())
        {
            front = rear = 0;
            arr[rear] = data;
        }
        else if((rear+1) % size == front)
        {
            System.out.println("The Queue is FULL!");
        }
        else
        {
            rear = (rear + 1) % size;
            arr[rear] = data;
        }
    }

    public void dequeue()
    {
        if(rear == -1 && front == -1)
        {
            System.out.println("The queue is EMPTY!");
        }
        else if((rear) % size == front)
        {
            arr[front] = 0;
            front = rear = -1;
        }
        else
        {
            arr[front] = 0;
            front = (front + 1) % size;
        }
    }
    
    public static void main(String[] args)
    {
        circular_queue queue = new circular_queue();
        // queue.show();
        // System.out.println(queue.isempty());
        // System.out.println(queue.isfull());
        queue.enqueue(1);
        queue.show();
        queue.enqueue(2);
        queue.show();
        queue.enqueue(3);
        queue.show();
        queue.enqueue(4);
        queue.show();
        queue.enqueue(5);
        queue.show();
        queue.peek();
        queue.dequeue();
        queue.show();
        queue.dequeue();
        queue.show();
        queue.peek();
        queue.enqueue(6);
        queue.show();
        queue.enqueue(7);
        queue.show();
        queue.enqueue(8);
        queue.show();
        queue.dequeue();
        queue.show();
        queue.dequeue();
        queue.show();
        queue.dequeue();
        queue.show();
        queue.dequeue();
        queue.show();
        queue.peek();
        queue.dequeue();
        queue.show();
        // System.out.println(queue.isempty());
    }
}