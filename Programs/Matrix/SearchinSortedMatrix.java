//https://leetcode.com/problems/search-a-2d-matrix/

class SearchinSortedMatrix
{
    static boolean searchinSortedMatrix(int[][] arr,int searchelement)
    {
        int m = arr.length;
        int n = arr[0].length;
        int left = 0;
        int right = ( m * n ) - 1;
        while(left <= right)
        {
            int mid = (left + right)/2;
            if(arr[mid/n][mid%n] == searchelement)
            {
                return true;
            }
            else if(arr[mid/n][mid%n] < searchelement)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }      
        return false;
    }
    public static void main(String[] args)
    {
        int[][] arr ={  {1,2,3,4},
                        {8,9,10,11},
                        {15,16,17,18}   };
        int searchelement = 17;
        boolean found = searchinSortedMatrix(arr,searchelement);
        System.out.print(found);
    }
}