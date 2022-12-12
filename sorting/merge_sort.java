class merge_sort
{
    public static void divide(int arr[], int si, int ei)
    {
        if(si < ei)
        {
            int mid = (si + ei)/2;
            divide(arr, si, mid);
            divide(arr, mid+1, ei);
            merge(arr, si, mid, ei);
        }
    }

    public static void merge(int arr[], int si, int mid, int ei)
    {
        int array[] = new int[ei-si +1];
        int p1 = si;
        int p2 = mid+1;
        int k = 0;

        while(p1 <= mid && p2 <= ei)
        {
            if(arr[p1] <= arr[p2])
            {
                array[k++] = arr[p1++];
            }
            else
            {
                array[k++] = arr[p2++];
            }
        }

        while(p1 <= mid)
        {
            array[k++] = arr[p1++];
        }

        while(p2 <= ei)
        {
            array[k++] = arr[p2++];
        }

        for(int i = 0, j = si; i < array.length; i++, j++)
        {
            arr[j] = array[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = {9,8,7,6,11,5,4,3,2,1,0,9,8,10};
        divide(arr, 0, arr.length-1);

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}