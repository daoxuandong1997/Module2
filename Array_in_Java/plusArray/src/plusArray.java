import java.util.Scanner;

public class plusArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr1, arr2, arr3;
        int size1 = 5, size2 = 5, size3 = size1 + size2;
        arr1 = new int[size1];
        arr2 = new int[size2];
        arr3 = new int[size3];

        declareArray(arr1,1);
        declareArray(arr2,2);

//        displayArray(arr1,1);
//        displayArray(arr2,2);

        addArray(arr1,arr2,arr3);
        displayArray(arr3,3);
    }
    public static void declareArray(int[]array, int no){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the value of each element in array %d \n",no);
        for (int i = 0; i < array.length; i++){
            System.out.printf("Enter a value at position %d: ", (i+1));
            array[i] = sc.nextInt();
        }
    }
    public static void displayArray(int[]array,int no){
        System.out.printf("Display array %d\n ",no);
        for (int a : array){
            System.out.println("\t" + a);
        }
    }
    public static void addArray(int[]array1, int[]array2, int[]array3){
            int arr1Index = array1.length ;
//            int arr2Index = array2.length - 1 ;
//            int arr3Index = array3.length - 1 ;

            for (int i = 0; i < array1.length; i++) {
                array3[i] = array1[i];
            }
//
//            for (int i = arr3Index; i >= array2.length; i --){
//                array3[i] = array2[arr2Index--];
//            }
            for (int i = 0; i < array2.length; i++){
                array3[arr1Index++] = array2[i];
            }
    }
}

