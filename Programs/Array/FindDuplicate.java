class FindDuplicate
{
    static int findDuplicate(int[] arr) {
        int slow = arr[0];
        int fast = arr[0];
        slow = arr[slow];
        fast = arr[arr[fast]];

        while(slow != fast){
            slow = arr[slow];
            fast = arr[arr[fast]];
        }
        slow = arr[0];
        while(slow != fast) {
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,3,2,5,4};
        System.out.print(findDuplicate(arr));
    }
}