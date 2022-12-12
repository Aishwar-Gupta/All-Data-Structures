package STACKS;
class stack
{
    int size = 5;
    int arr[] = new int[size];
    int top = 0;

    public void push(int data)
    {
        if(top < size)
        {
            arr[top] = data;
            top++;
        }
        else
        {
            // System.out.print(" i ");
            size = size * 2;
            int new_arr[] = new int[size];
            for(int i = 0; i < arr.length;i++)
            {
                new_arr[i] = arr[i];
            }
            arr = new_arr;
            arr[top] = data;
            top++;
        }
    }

    public int pop()
    {
        int element = arr[top-1];
        if(top > size/2)
        {
            arr[top-1] = 0;
            top--;
        }
        else
        {
            // System.out.print(" r ");
            size = arr.length / 2;
            int new_arr[] = new int[size];
            for(int i = 0; i < top; i++)
            {
                new_arr[i] = arr[i];
            }
            arr = new_arr;
            arr[top-1] = 0;
            top--;
        }
        
        return element;
    }

    public void show()
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" SIZE = " + size + " TOP = " + top);
    }

    public static void main(String[] args)
    {
        stack stack = new stack();
        stack.push(1);
        stack.show();
        stack.push(2);
        stack.show();
        stack.push(3);
        stack.show();
        stack.push(4);
        stack.show();
        stack.push(5);
        stack.show();
        stack.push(6);
        stack.show();
        stack.push(7);
        stack.show();
        stack.push(8);
        stack.show();
        stack.push(9);
        stack.show();
        stack.push(1);
        stack.show();
        stack.push(2);
        stack.show();
        stack.push(3);
        stack.show();
        stack.push(4);
        stack.show();
        stack.push(5);
        stack.show();
        stack.push(6);
        stack.show();
        stack.push(7);
        stack.show();
        stack.push(8);
        stack.show();
        stack.push(9);
        stack.show();
        stack.push(1);
        stack.show();
        stack.push(2);
        stack.show();
        stack.push(3);
        stack.show();
        stack.push(4);
        stack.show();
        stack.push(5);
        stack.show();
        stack.push(6);
        stack.show();
        stack.pop();
        stack.show();
        stack.pop();
        stack.show();
        stack.pop();
        stack.show();
        stack.pop();
        stack.show();
        stack.pop();
        stack.show();
        stack.pop();
        stack.show();
        stack.pop();
        stack.show();
        stack.pop();
        stack.show();
        stack.pop();
        stack.show();
        stack.pop();
        stack.show();
        stack.pop();
        stack.show();
        stack.pop();
        stack.show();
        stack.pop();
        stack.show();
        stack.pop();
        stack.show();
        stack.pop();
        stack.show();
        stack.pop();
        stack.show();
    }
}