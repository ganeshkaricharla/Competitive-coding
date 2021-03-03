class CountSetBits
{
    static int countSetBits(int n)
    {
        int res = 0;
        while(n > 0)
        {
            res = res + 1;
            n = n & (n-1);
        }
        return n;
    }
    public static void main(String[] args)
    {
        int n = 5;
        System.out.print(countSetBits(n));
    }
}