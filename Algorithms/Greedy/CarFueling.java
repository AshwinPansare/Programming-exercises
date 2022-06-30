import java.util.*;
import java.io.*;
/**
 * We have to find the minimum number of refills needed to travel
 * between two cities having distance dist between them, tank is 
 * the maximum fuel capacity of the car and stops contains 
 * distances of the fuel stations from the starting point
 */
public class CarFueling {
    static int computeMinRefills(int dist, int tank, int[] stops) {
        if(dist<=tank)return 0;
        int loc=0,i=0,refills=0;
        while(true)
        {
            int fuel=tank;
            if(dist-loc<=fuel)return refills;
            if(i<stops.length&&stops[i]-loc>fuel)return -1;//cannot reach the stop
            if(i==stops&&dist-loc>fuel)return -1;
            while(i<stops.length&&stops[i]-loc<=fuel)
            {
                loc=stops[i];
                fuel-=(stops[i]-loc);
                i++;
            }
            refills++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the distance between the two cities: ");
        int dist = scanner.nextInt();
        System.out.println("Enter the maximum capacity of the fuel tank: ");
        int tank = scanner.nextInt();
        System.out.println("Enter the number of stops: ");
        int n = scanner.nextInt();
        int stops[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the distance of stop "+i+" from the starting location");
            stops[i] = scanner.nextInt();
        }

        System.out.println(computeMinRefills(dist, tank, stops));
        scanner.close();
    }
}
