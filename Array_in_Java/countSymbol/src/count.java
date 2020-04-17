import java.util.Scanner;
import java.io.*;

public class count {
    public static void main(String[] args) {
        String chuoi;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        chuoi = sc.nextLine();
        System.out.println("Enter the character: ");
        kyTu1 = sc.nextLine();
        for (int i = 0; i < chuoi.length(); i++){
            if (chuoi.charAt(i) == kyTu){
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự " + kyTu + " trong chuỗi " + chuoi + " = " + count);
    }
}
