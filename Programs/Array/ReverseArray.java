class ReverseArray
{
    static void reverseArray(int start, int end,int[] arr)
    {
        if (start >=end) return;
        arr[start] = arr[start] + arr[end];
        arr[end] = arr[start] - arr[end];
        arr[start] = arr[start] - arr[end];
        reverseArray(start+1,end-1,arr);
    }
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        reverseArray(0,arr.length-1,arr);
        for(int i : arr) System.out.print(i + " ");
    }
}