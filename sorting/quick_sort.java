class quick_sort
{
    public static void Quicksort(int arr[], int l, int h)
    {
        if(l < h)
        {
            int pivot = Partition(arr, l, h);
            Quicksort(arr, l, pivot-1);
            Quicksort(arr, pivot+1, h);
        }
    }

    public static int Partition(int arr[], int l, int h)
    {
        int pivot = arr[l];
        int i = l;
        int j = h;

        while(i < j)
        {
            while(i <= h && arr[i] <= pivot)
            {
                i++;
            }

            while(j >= l && arr[j] > pivot)
            {
                j--;
            }

            if(i < j)
            {
                swap(arr, i, j);
            }
        }
        swap(arr, j, l);
        return j;
    }

    public static void swap(int arr[], int idx1, int idx2)
    {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {9,8,7,6,11,5,4,3,2,1,0,9,8,10,11};
        Quicksort(arr, 0, arr.length-1);

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}