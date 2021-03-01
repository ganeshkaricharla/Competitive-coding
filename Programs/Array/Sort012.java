class Sort012
{   
    static void swap(int[] arr,int a,int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static void sort012(int[] arr)
    {
        int left = 0;
        int mid = 0;
        int right = arr.length -1;
        while(mid <= right)
        {
            if(arr[mid] == 0)
            {
                swap(arr,mid,left);
                mid = mid + 1;
                left = left + 1;
            }
            else if(arr[mid] == 1)
            {
                mid = mid + 1;
            }
            else if(arr[mid] == 2)
            {
                swap(arr,mid,right);
                right = right -1;
            }
        }
    }
    public static void main(String[] args)
    {
        int[] arr = {0,1,0,1,0,2,0,1,0,1,0,2,0,2,0,1,0,2,2,1,1,0,2,0,1,0,2,1};
        sort012(arr);
        for (int i : arr) System.out.print(i + " ");
    }
}