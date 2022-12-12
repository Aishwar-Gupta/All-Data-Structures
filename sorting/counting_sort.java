class counting_sort
{
    public static void counting(int arr[])
    {
        int count[] = new int[max(arr)+1];
        // count[0] = 0;
        // for(int i = 0; i < count.length; i++)
        // {
        //     System.err.print(count[i] + " ");
        // }
        // System.out.println();

        for(int i = 0; i < arr.length; i++)
        {
            count[arr[i]]++;
        }

        // for(int i = 0; i < count.length; i++)
        // {
        //     System.err.print(count[i] + " ");
        // }
        // System.out.println();

        for(int i = 1; i < count.length; i++)
        {
            count[i] = count[i-1] + count[i];
        }

        // for(int i = 0; i < count.length; i++)
        // {
        //     System.err.print(count[i] + " ");
        // }
        // System.out.println();
        
        int array[] = new int[arr.length];

        for(int i = arr.length-1; i >= 0; i--)
        {
            array[--count[arr[i]]] = arr[i];
        }

        // for(int i = 0; i < array.length; i++)
        // {
        //     System.err.print(array[i] + " ");
        // }
        // System.out.println();
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = array[i];
        }
    }

    public static int max(int arr[])
    {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {2,1,0,2,0,1,0,2,0,1,2,1,0,2,0,1,1,2,1};
        counting(arr);

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}