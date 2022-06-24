import java.util.*;

public class LCM {
//   private static long lcm_naive(int a, int b) {
//     for (long l = 1; l <= (long) a * b; ++l)
//       if (l % a == 0 && l % b == 0)
//         return l;

//     return (long) a * b;
//   }

// Property: a*b = LCM(a,b)*GCD(a,b)
  private static int gcd(int a, int b)
  {
    if(a<b)//swapping so that a is greater
    {
        int t=b;
        b=a;
        a=t;
    }
    while(b!=0)
    {
        int r=a%b;
        a=b;
        b=r;
    }
    return a;
  }
  private static long lcm_usingGCD(int a, int b)
  {
    return (long)a*b/gcd(a, b);
  }
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the first number: ");
    int a = s.nextInt();
    System.out.println("Enter the second number: ");
    int b = s.nextInt();

    System.out.println(lcm_usingGCD(a, b));
    //System.out.println(lcm_naive(a, b));
    s.close();
  }
}
