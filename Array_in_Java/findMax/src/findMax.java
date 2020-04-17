import java.util.Scanner;

public class findMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size, i = 0;
        do {
           System.out.println("Enter the size of array: ");
           size = sc.nextInt();
           if (size > 20){
               System.out.println("Size should not exceed 20");
           }
       }while (size > 20);
        //
        int [] array;
        array = new int [size];
        while (i < array.length){
            System.out.println("Enter the value of position " + (i+1) + ": ");
            array[i] = sc.nextInt();
            i++;
        }
        //
        System.out.println("Property list: ");
        for ( int j = 0; j < array.length; j++){
            System.out.println( array[j] + "\t");
        }
        //
        int max = array[0], index = 0;
        for ( int j = 0; j < array.length; j++){
            if (max < array[j]){
                max = array[j];
                index = j;
            }
        }
        System.out.println("The maximum number in array is: " + max + " at position " + (index+1));
    }
}
