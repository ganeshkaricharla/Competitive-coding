class TrappingRainWater{

    static int trappingRainWater(int[] arr) {
        int[] leftMax = new int[arr.length];
        int[] rightMax = new int[arr.length];
        leftMax[0] = arr[0];
        for(int i = 1; i < arr.length; i +=1) {
            leftMax[i] = Math.max(leftMax[i-1],arr[i]);
        }
        rightMax[arr.length -1] = arr[arr.length -1];
        for(int i = arr.length -2; i >=0 ; i -=1) {
            rightMax[i] = Math.max(rightMax[i+1],arr[i]);
        }
        int water = 0;
        for(int i = 0; i< arr.length; i +=1) {
            water += (Math.min(leftMax[i],rightMax[i]) - arr[i]);
        }
    return water;
    }

    public static void main(String[] args) {
        int[] arr = {7,4,0,9};
        System.out.print(trappingRainWater(arr));
    }
}