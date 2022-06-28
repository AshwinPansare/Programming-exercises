import java.util.ArrayList;
import java.util.Scanner;
/**
 * Given the value and weight of items, we have to find the maximum
 * value of loot that can fit into a bagpack of given capacity
 * (Fractional Knapsack we can take fraction of an item)
 */
public class FractionalKnapsack {
    private static double getOptimalValue(int capacity, int[] values, int[] weights) {
        double value = 0;
        int n = values.length;
        ArrayList<Integer> price = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            price.add(values[i]/weights[i]);
        }
        while(capacity>0&&(!price.isEmpty()))
        {
            int max=0;
            for(int i=1;i<n;i++)
            {
                if(price.get(i)>price.get(max))max=i;//max contains index of most expensive item
            }
            int amount = Math.min(capacity, weights[max]);//amount of item to be taken
            value+=amount*price.get(max);
            price.remove(max);
        }
        return value;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of items available: ");
        int n = scanner.nextInt();
        System.out.println("Enter the capacity of knapsack: ");
        int capacity = scanner.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the value and weight of item "+(i+1));
            System.out.print("Value: ");
            values[i] = scanner.nextInt();
            System.out.print("Weight: ");
            weights[i] = scanner.nextInt();
        }
        System.out.println(getOptimalValue(capacity, values, weights));
        scanner.close();
    }
} 
