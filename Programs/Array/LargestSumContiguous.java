class LargestSumContiguous
{
    static int largestSum(int[] arr)
    {
        int max = arr[0];
        int curr = arr[0];
        for(int i = 1; i < arr.length; i +=1)
        {
            if(arr[i] < (curr + arr[i]))
            {
                curr = curr + arr[i];
                max = Math.max(curr,max);
            }
        }

        return max;
    }
    public static void main(String[] args) {
        int[] arr = {-1,-2,-3,-5};
        System.out.print(largestSum(arr));
    }
}