package QUEUE_PRIORITY;
class priority_queue
{
    int size = 5;
    int arr[] = new int[size];
    int front = -1, rear = -1;
    int index = 0;

    public void enqueue(int data)
    {
        if(front == -1 && rear == -1)
        {
            front = rear = 0;
            arr[rear] = data;
        }
        else if(rear == size)
        {
            System.out.println("QUEUE is FULL!");
        }
        else
        {
            rear++;
            arr[rear] = data;
            for(int i = 0; i <= rear; i++)
            {
                for(int j = i+1; j <= rear; j++)
                {
                    if(arr[i] > arr[j])
                    {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
                
            }
            // for(int i = 0; i <= rear; i++)
            // {
            //     if(arr[i] < data)
            //     {
            //         index = i;
            //         swap(arr, i);
            //         break;
            //     }
            // }
            // rear++;
            // arr[index] = data;
            // rear++;
        }
    }

    public void swap(int arr[], int index)
    {
        for(int i = arr.length-2; i <= index; i--)
        {
            arr[i+1] = arr[i];
        }
    }

    public void dequeue()
    {
        for(int i = 0; i < rear; i++)
        {
            arr[i] = arr[i+1];
        }
        // arr[front] = 0;
        // front++;
        arr[rear] = 0;
        rear--;
    }

    public void show()
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" SIZE = " + size + " FRONT = " + front + " REAR = " + rear);
    }


    public static void main(String[] args)
    {
        priority_queue que = new priority_queue();
        que.enqueue(8);
        que.show();
        que.enqueue(3);
        que.show();
        que.enqueue(7);
        que.show();
        que.enqueue(4);
        que.show();
        que.enqueue(5);
        que.show();
        que.dequeue();
        que.show();
        que.enqueue(10);
        que.show();
    }
}