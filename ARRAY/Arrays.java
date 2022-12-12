import java.util.*;

/*
 * ARRAYS - Operations:
 * print(int arr[])                                      // Traverse - print the array
 * insert_element(int arr[])                             // Insert - All the elements upto size
 * insert_element(int arr[], int index, int data)        // Insert - At an index
 * 
 */

class Arrays
{
    public static void print(int arr[])        // Traverse - print the array
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static int[] insert_element(int arr[])        //Insert - All the elements upto size
    {
        Scanner input = new Scanner(System.in);
        for(byte i = 0; i < arr.length; i++)
        {
            System.out.println("Enter the element for the "+ i + "th position: ");
            int element = input.nextInt();
            arr[i] = element;
        }
        input.close();
        return arr;
    }

    public static int[] insert_element(int arr[], int index, int data)        //Insert - At an index
    {
        if(index > arr.length)
        {
            System.out.println("Index out of Array size!");
        }

        if(index == arr.length)
        {
            arr[index-1] = data;
        }
        else
        {
            for(int i = arr.length-2; i >= index-1; i--)
            {
                if(i >= index-1)
                {
                    arr[i+1] = arr[i];
                }
            }
            arr[index-1] = data;
        }
        return arr;
    }

    // public static int[] delete_data(int arr[], int data)        // Delete - Delete a data
    // {
    //     if(arr[arr.length-1] == data)
    //     {
    //         arr[arr.length-1] = 0;
    //     }

    //     for(int i = 0; i < arr.length; i++)
    //     {
    //         if(arr[i] == data)
    //         {
    //             for(int j = i; j < arr.length-1; j++)
    //             {
    //                 if(arr[j+1] != data)
    //                 {
    //                     arr[j] = arr[j+1];
    //                 }
    //                 else
    //                 {
    //                     arr[j] = 0;
    //                 }
                    
    //             }
    //             // arr[i] = arr[i+1];
    //             arr[arr.length-1] = 0;
    //         }
    //     }
    //     return arr;
    // }

    

    public static void main(String args[])
    {
        // Scanner input = new Scanner(System.in);
        // System.out.println("Enter the size of the array: ");
        // int size = input.nextInt();
        // int arr[] = new int[10];
        int arr[] = {0,1,2,3,4,5,5,5,6,7,8,9};
        // insert_element(arr);
        print(arr);
        // insert_element(arr, 5, 5);
        // delete_data(arr, 5);
        print(arr);
        // input.close();
    }
}