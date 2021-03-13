class DivisionWithoutOperator
{
    static long  divide(long a,long b)
    {
        long sign = (a<0)^(b<0)? -1  : 1 ;

        a = Math.abs(a);
        b = Math.abs(b);
        
        long q = 0;
        long temp = 0;
        for(int i = 31; i >= 0; i = i - 1)
        {
            if(temp + (b<<i) <= a)
            {
                temp = temp + (b<<i);

                q = q | 1L<<i;
            }
        }

        if(sign < 0)  q = -q;

        return q;
    }
    public static void main(String[] args)
    {   
        long a = 5;
        long b = 2;
        System.out.print(divide(a,b));       
    }
}