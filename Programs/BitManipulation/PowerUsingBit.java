// https://www.geeksforgeeks.org/calculate-square-of-a-number-without-using-and-pow/

class PowerUsingBit
{
    static int powerUsingBit(int n)
    {
        int times = n;
        int res = 0;

        while(times > 0)
        {
            int pos = 0;
            int curr = 1;
            while((curr<<1) <= times)
            {
                curr = curr << 1;
                pos = pos + 1;
            }

            res = res + (n << pos);
            times = times - curr;
        }
        return res;
    }
    public static void main(String[] args)
    {
        int n = 5;
        System.out.print(powerUsingBit(n));
    }   
}