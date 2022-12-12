class selection_sort
{
    public static void selection(int arr[])
    {
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = i; j < arr.length; j++) 
            {
                if(arr[j] < arr[i])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }            
        }
    }

    public static void main(String[] args) {
        int arr[] = {9,10,1,2,8,5,1,8,6,2,4,8,0,10};
        selection(arr);

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}