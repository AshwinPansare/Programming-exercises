import java.util.Scanner;

class Fibonacci{

    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the term number of the series to print: ");
        //0 is 0th term, 1 is 1st term
        int n = s.nextInt();
        //an array containing the numbers in the series
        //TC O(n)
        int f[] = new int[n];
        f[0]=0;
        f[1]=1;
        for(int i=2;i<=n;i++)
        {
            f[i]=f[i-1]+f[i-2];
        }
        System.out.println(f[n]);//Prints the nth term of fibonacci series
        // int r = fib(n);
        // System.out.println(r);
        s.close();
    }
    public static int fib(int n)//recursive function TC:O(2^n)
    {
        if(n==0||n==1)
            return n;
        else
            return fib(n-1)+fib(n-2);
    }
}