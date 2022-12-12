class recursion
{
    //Print numbers from 1 to 5
    public static int print_numbers(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        System.out.print(n + " ");
        return print_numbers(n-1);
    }

    public static void print_forward(int n)
    {
        if(n == 0)
        {
            return ;
        }
        print_forward(n-1);
        System.out.print(n + " ");
    }

    public static int sum(int n)
    {
        if (n == 5)
        {
            return 5;
        }
        return n + sum(n+1);
    }

    public static int fact(int n)
    {
        if(n == 0)
        {
            return 1;
        }
        return n * fact(n-1);
    }

    public static int fibo(int n)
    {
        // 0 1 1 2 3 5 8....
        if(n == 0)
        {
            return 0;
        }
        else if(n == 1)
        {
            return 1;
        }
        int fibo = fibo(n-1) + fibo(n-2);
        // System.out.print( fibo );
        return fibo;
    }

    public static void fibonacci(int a, int b, int n)
    {
        if(n == 0)
        {
            return ;
        }
        int c = a+b;
        System.out.print(c + " ");
        fibonacci(b, c, n-1);
        
    }

    public static int power(int x, int n)
    {
        if (x == 0)
        {
            return 0;
        }
        //x3 = x2*x
        if(n == 0)
        {
            return 1;
        }
        return x * power(x, n-1);
    }

    public static int power_logn(int x, int n)
    {
        if(x == 0)
        {
            return 0;
        }
        if(n == 0)
        {
            return 1;
        }
        if(n % 2 == 0)
        {
            n = n/2;
            return power_logn(x, n) * power_logn(x, n);
        }
        else
        {
            return power_logn(x, n/2) * power_logn(x, (n/2)) * x ;
        }
        
        //2^10 = 2^5 * 2^5 = 2^2 * 2*3
    }

    public static void main(String[] args)
    {
        // print_numbers(5); // print backwards
        // print_forward(5); // print forwards
        // System.out.println(sum(1)); // sum of n
        // System.out.println(fact(5)); // print factorial
        // System.out.println(fibo(5));
        // int a = 0;
        // int b = 1;
        // int n = 6;
        // System.out.print((a + " " + b + " "));
        // fibonacci(a, b, n-2);
        // System.out.println(power(0,6));
        System.out.println(power_logn(2,6));

    }
}