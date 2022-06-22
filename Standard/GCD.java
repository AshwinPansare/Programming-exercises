import java.util.*;

public class GCD {
//   private static int gcd_naive(int a, int b) {
//     int current_gcd = 1;
//     for(int d = 2; d <= a && d <= b; ++d) {
//       if (a % d == 0 && b % d == 0) {
//         if (d > current_gcd) {
//           current_gcd = d;
//         }
//       }
//     }

//     return current_gcd;
//   }
  private static int gcd_euclidean(int a, int b)
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
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the first number: ");
    int a = s.nextInt();
    System.out.println("Enter the second number: ");
    int b = s.nextInt();

    //System.out.println(gcd_naive(a, b));
    System.out.println("GCD of "+a+" and "+b+" is "+gcd_euclidean(a,b));
    s.close();
  }
}
