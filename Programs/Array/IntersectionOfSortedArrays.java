class IntersectionOfSortedArrays {
    
    static void printIntersection(int[] arr1,int[] arr2)
    {
        int i = 0;
        int j = 0;
        while(i < arr1.length && j < arr2.length)
        {
            if(i > 0 && arr1[i] == arr1[i-1]) i += 1;
            else if(j > 0 && arr2[j] == arr2[j-1]) j += 1;
            
            else if(arr1[i] < arr2[j]) {
                i += 1;
            }
            else if(arr2[j] < arr1[i]) {
                j += 1;
            }
            else {
                System.out.print(arr1[i] + " ");
                i += 1;
                j += 1;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,3,6,7,9,9,10,12,12};
        int[] arr2 = {1,1,1,2,4,4,4,5,6,7,8,9,11,13,13,14,15};
        printIntersection(arr1,arr2);
    }
}