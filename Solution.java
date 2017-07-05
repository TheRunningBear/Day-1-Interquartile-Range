
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        /* Read and save input */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] x = new int[n];
        int[] f = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = in.nextInt();
        }

        int totalS = 0;
        for (int i = 0; i < n; i++) {
            f[i] = in.nextInt();
            totalS += f[i];
        }

        /* Create and sort our data set */
        int[] s = new int[totalS];

        int indexS = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < f[i]; j++) {
                s[indexS] = x[i];
                indexS++;

            }
        }


        Arrays.sort(s);
 /* Works with both even and odd length arrays */
        double q1 = findMedian(s, 0, s.length / 2 - 1);
        double q3 = findMedian(s, (s.length + 1) / 2, s.length - 1);

        System.out.println(q3 - q1);
    }

    /* Treats elements from "start" to "end" as an array and calculates its median */
    private static double findMedian(int[] arr, int start, int end) {
        if ((end - start) % 2 == 0) { // odd number of elements
            return (arr[(end + start) / 2]);
        } else { // even number of elements
            int v1 = arr[(end + start) / 2];
            int v2 = arr[(end + start) / 2 + 1];
            return (v1 + v2) / 2.0;
        }
    }
}


