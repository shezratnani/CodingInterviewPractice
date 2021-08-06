public class MoveZeroes {
    static void pushZerosToEnd(int arr[], int n)
    {
        int count = 0;  // Count of non-zero elements
        int count2 = n - 1;
        // Traverse the array. If element encountered is
        // non-zero, then replace the element at index 'count'
        // with this element
        for (int i = 0; i < n/2; i++)
            if (arr[i] != 0)
                arr[count++] = arr[i]; // here count is
        // incremented
        for (int i = n - 1; i >= n/2; i--)
            if(arr[i] != 0)
                arr[count2--] = arr[i];
        while (count < n/2)
            arr[count++] = 0;

        while(count2 >= n/2)
            arr[count2--] = 0;
    }

    /*Driver function to check for above functions*/
    public static void main (String[] args)
    {
        int arr[] = {1, 0, 8, 4, 9, 0, 2, 7, 0, 6, 0, 9};
        int n = arr.length;
        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
        pushZerosToEnd(arr, n);
        System.out.println("Array after pushing zeros to the back: ");
        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
    }
}
