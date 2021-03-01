class MoveNegative
{
    static void swap(int[] arr,int a,int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static void moveNegative(int[] arr)
    {
        int left = 0;
        int right = arr.length -1;
        while(left < right)
        {
            if(arr[left] < 0 && right < 0)
            {
                left =left + 1;
            }
            else if(arr[left] > 0 && arr[right] > 0)
            {
                right = right -1;
            }
            else if(arr[left] > 0 && arr[right] < 0)
            {
                swap(arr,left,right);
                left = left + 1;
                right = right -1;
            }
            else
            {
                left = left  + 1;
                right = right + 1;
            }
        }
    }
    public static void main(String[] args)
    {
        int[] arr = {1,2,-5,6,-1,-7,-5,9};
        moveNegative(arr);
        for(int i: arr)
        {
            System.out.print(i + " ");
        }
    }
}