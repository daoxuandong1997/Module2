import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class sumOfCol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[][] matrix;
        int row, col;
        System.out.println("Enter the row of matrix: ");
        row = sc.nextInt();
        System.out.println("Enter the col of matrix: ");
        col = sc.nextInt();
        //-----------------
        matrix = new float[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Enter the value at [%d][%d]: ", i, j);
                matrix[i][j] = sc.nextFloat();
            }
        }
        //----------------
        String draw = "";
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                draw += matrix[i][j] + " ";
            }
            draw += "\n";
        }
        System.out.println(draw);
        //------------------
        int colSum;
        do {
            System.out.println("Enter the number of col want to caculate sum: ");
            colSum = sc.nextInt();
        } while (colSum > (col + 1) || colSum < 1);

        float sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if ((colSum - 1) == j) {
                    sum += matrix[i][j];
                }
            }
        }
        System.out.printf("The sum of col %d is: %.2f", colSum, sum);

    //---------- tinh tong duong cheo chinh
        float sum1 = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == j) {
                    sum1 += matrix[i][j];
                }
            }
        }
        System.out.println();
        System.out.print("The sum of the cross: " + sum1);

    }
}

