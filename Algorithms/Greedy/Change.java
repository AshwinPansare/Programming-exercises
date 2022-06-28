import java.util.Scanner;

/**
 * It computes the minimum number of coins of denomination 1, 5 and 10
 * which can change given value into coins
 */
public class Change {
    private static int getChange(int m) {
        /*As minimum number of coins are asked we take the coin of largest denomination first
         * m/10 gives number of 10 rupees coins
         * (m%10)/5 gives number of 5 rupees coins
         * m%5 gives number of 1 rupees coins
         */
        return m/10 + (m%10)/5 + m%5;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));
        scanner.close();
    }
    /*
     * alternate solution with same approach
     * 
     * while money>0:
     *   if money>=10
     *     money-10
     *   if money>=5
     *     money-5
     *   else
     *     money-1
     *   res++
     */
}

