import java.util.Arrays;
class ChocolateDistribution
{
    static int minDiff(int[] arr,int m)
    {
        if(arr.length<m) return -1;
        if(m== 0 || arr.length == 0) return 0;
        Arrays.sort(arr);
        int min = arr[m-1] - arr[0];
        for(int i = 1; i+m-1 < arr.length; i++)
        {
            min = Math.min(min,arr[i+m-1] - arr[i]);
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = {7, 3, 2, 4, 9, 12, 56};
        int m = 3;
        System.out.print(minDiff(arr,m));
    }
}