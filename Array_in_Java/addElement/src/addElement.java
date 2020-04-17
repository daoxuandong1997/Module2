import java.util.Scanner;

public class addElement {
    public static void main(String[] args) {
        int[] array = {10,4,6,8,7,6,9,0,0,0};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an index: ");
        int index = sc.nextInt();
        if (index <= 1 || index >= (array.length - 1)){
            System.out.println("Can not add element into the array");
        }else {
            System.out.println("Enter a value you want to add");
            int value = sc.nextInt();
            add(array,index,value);
            System.out.println("The array after add: ");
            for (int a: array){
                System.out.println(a);
            }
        }
    }
    public static void add(int[]arr, int index, int number){
        for (int i = 0; i < arr.length ; i ++){
            if (index == (i + 1)){
                for (int j = (arr.length - 1); j > i ;j--){
                    arr[j] = arr[j - 1];
                }
                arr[i] = number;
            }
        }
    }
}
