import java.util.Scanner;

public class findMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int col,row;
        int[][] matrix ;
        System.out.println("Enter the row: ");
        row = sc.nextInt();
        System.out.println("Enter the col: ");
        col = sc.nextInt();
        matrix = new int[row][col];
        for (int i = 0; i < row ; i++){
            for (int j = 0; j < col ; j++){
                System.out.printf("Enter a value at position [%d][%d]: ", i,j);
                matrix[i][j] = sc.nextInt();
            }
        }
        //
        String draw = "";
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col; j++) {
                draw += matrix[i][j] + " ";
            }
            draw += "\n";
        }
        System.out.println(draw);
        //
        int max = matrix[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (max < matrix[i][j]){
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("The max value in array  is: " + max);
    }
}
