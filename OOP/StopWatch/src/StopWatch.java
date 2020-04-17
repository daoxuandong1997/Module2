import java.util.Random;
import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //
        Random randomNumber = new Random();
        int n;
        System.out.println("Enter the length of string need to sort: ");
        n = sc.nextInt();
        long[]arr = new long[n];
        for (int i = 0; i < n; i++){
            arr[i] = randomNumber.nextInt(n);
        }
        //
        Watch stopWatch = new Watch();
        stopWatch.start();
        for (int i = 0; i < n - 1; i++){
            for ( int j = i + 1; j < n; j++){
                long temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        stopWatch.stop();
        //
        System.out.println("Total time to sort the array is: " + stopWatch.getElapsedTime() + "ms");
    }
}
