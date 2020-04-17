import java.util.Scanner;

public class findMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] array;
        int size;
        System.out.println("Enter the size of array: ");
        size = sc.nextInt();
        array = new int [size];
        //
        for (int i = 0; i < array.length; i++){
            System.out.printf("Enter a value at position %s: ",i);
            array[i] = sc.nextInt();
        }
        //
        int min = array[0], index = 0;
        for (int i = 1; i < array.length; i++){
            if (min > array[i]){
                min = array[i];
                index = i;
                break;
            }
        }
        System.out.printf("The min value in array is: %s at position %d",min, index);

    }
}
