class heap                                   // MAX HEAP
{
    int arr[] = new int[10];
    int top = -1;

    public void insert(int val)
    {
        arr[++top] = val;
        
        int i = top;
        while(i >= 0)
        {
            int parent = (i/2);
            if(arr[parent] < arr[i])
            {
                swap(parent, i);
                i = parent;
            }
            else
            {
                return ;
            }
        }
    }

    public void delete()
    {
        int temp = arr[0];
        arr[0] = arr[top];
        arr[top--] = temp;

        int i = 0;
        while(i < top)
        {
            int left = (2*i)+1;
            int right = (2*i)+2;
            if(left <= top && right <= top && arr[left] >= arr[right])
            {
                if(arr[left] > arr[i])
                {
                    swap(left, i);
                    i = left;
                }
                else
                {
                    return ;
                }
            }
            else if(right <= top && arr[left] < arr[right])
            {
                if(arr[right] > arr[i])
                {
                    swap(right,i);
                    i = right;
                }
                else
                {
                    return ;
                }
            }
            else
            {
                return ;
            }
        }
    }

    public void swap(int idx1, int idx2)
    {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    public void print()
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println("    TOP = " + top);
    }

    public static void main(String[] args) {
        heap heap = new heap();
        heap.insert(1);
        // heap.print();
        heap.insert(2);
        // heap.print();
        heap.insert(3);
        // heap.print();
        heap.insert(4);
        // heap.print();
        heap.insert(5);
        // heap.print();
        heap.insert(6);
        // heap.print();
        heap.insert(7);
        // heap.print();
        // heap.delete();
        // heap.print();
        // heap.delete();
        // heap.print();
        heap.insert(8);
        heap.insert(9);
        heap.insert(10);
        heap.print();
        heap.delete();
        heap.print();
        heap.delete();
        heap.print();
        heap.delete();
        heap.print();
        heap.delete();
        heap.print();
        heap.delete();
        heap.print();
        heap.delete();
        heap.print();
        heap.delete();
        heap.print();
        heap.delete();
        heap.print();
        heap.delete();
        heap.print();
        heap.delete();
    }
}