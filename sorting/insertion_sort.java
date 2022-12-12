class insertion_sort
{
    public static void insertion(int arr[])
    {
        for (int i = 1; i < arr.length; i++) 
        {
            int key = arr[i];
            int j = i-1;
            
            while(j >= 0 && arr[j] >= key)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    public static void main(String[] args) {
        int arr[] = {9,1,2,8,5,1,8,6,2,4,8,0};
        insertion(arr);

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}