import java.util.Scanner;

public class spliceInArray {
    public static void main(String[] args) {
        int [] array = {10,4,6,7,8,6,0,0,0,0};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element you want to splice:" );
        int number = sc.nextInt();
        splice(array,number);
    }
    public static void splice(int[]arr,int number){
        int index = 0;
        boolean isExist = false;
        for (int i = 0;  i < arr.length; i++){
            if (number == arr[i]){
                index = i;
                isExist = true;
                break;
            }
        }
        for (int j = index; j < arr.length - 1; j++){
            arr[j] = arr [j+1];
        }if (isExist) {
            System.out.println("The array after splice the element:");
            for (int a : arr) {
                System.out.println(a);
            }
        }else System.out.println("Not Exist in array !");
    }
}
