int[] arr = { 5, 2, 4, 6, 1, 3 };


public static void InsertionSort(int[] arr)
{
    int n = arr.Length;
    for (int i = 1; i < n; i++)
    {
        int key = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] > key)
        {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = key;
    }
}

InsertionSort(arr);
Console.WriteLine(string.Join(", ", arr)); // prints "1, 2, 3, 4, 5, 6"
