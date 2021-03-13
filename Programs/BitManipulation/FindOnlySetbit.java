class FindOnlySetBit
{
    static int log2n(int n)
    {
        if(n <= 1) return 0;

        return  1 + log2n(n/2);
    }
    static int onlySetBitAt(int n)
    {
        return log2n(n) + 1;
    }
    public static void main(String[] args)
    {
        int a = 16;
        System.out.print(onlySetBitAt(a));    
    }
}