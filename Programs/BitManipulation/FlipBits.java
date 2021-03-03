//  https://www.geeksforgeeks.org/count-number-of-bits-to-be-flipped-to-convert-a-to-b/

class FlipBits
{
    static int flipBits(int a,int b)
    {
        int xor = a ^ b;
        int res = 0;
        while(xor > 0)
        {
            res = res + 1;
            xor = xor & (xor - 1);
        }
        return res;
    }
    public static void main(String[] args)
    {
        int a = 10;
        int b = 20;
        System.out.print(flipBits(a,b));      
    }
}