class StockBuyAndSell {
    static int maxProfit(int[] arr){
        int profit = 0;
        int low = 0;
        if(arr.length <= 1) return 0;
        for(int i = 1; i< arr.length; i += 1) {
            if(arr[low] > arr[i]) {
                low = i;
            }
            else
            {
                profit = Math.max(profit,(arr[i] - arr[low]));
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.print(maxProfit(arr));
    }
}