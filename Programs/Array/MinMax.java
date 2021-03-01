class MinMax
{
    static void minMax(int[] arr)
    {
        int min = arr[0];
        int max = arr[1];
        for(int i:arr)
        {
            if(max < i)
            {
                max = i;
            }
            if(min > i)
            {
                min = i;
            }
        }
        System.out.print("Min : " + min + "\nMax : " + max);
    }
    public static void main(String[] args)
    {
        int[] arr = {3,5,2,4,6,7,1};
        minMax(arr);
    }
}