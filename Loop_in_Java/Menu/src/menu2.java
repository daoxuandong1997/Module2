import java.util.Scanner;

public class menu2 {
    public static void main(String[] args) {
        int choice2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. print the rectangle");
        System.out.println("2. print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("3. print isosceles triangle");
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");
        while (true) {
            choice2 = sc.nextInt();
            String draw = "";
            switch (choice2) {
                case 1:
                    System.out.println("print the rectangle");
                    for (int i = 0; i < 3;i++){
                        for (int j = 0; j < 7; j++){
                            draw +="* ";
                        }
                        draw += "\n";
                    }
                    System.out.println(draw);
                    break;
                case 2:
                    System.out.println("print the square triangle");
                    for (int i = 1; i < 7;i++){
                        for (int j = 1 ; j < i; j++){
                            draw +="* ";
                        }
                        draw += "\n";
                    }
                    //
                    for (int i = 1; i < 6;i++){
                        draw += "\n";
                        for (int j = 6; j > i; j--){
                            draw +="* ";
                        }
                        for (int k = 1; k < i; k ++){
                            draw += " ";
                        }
                    }
                    //

                    System.out.println(draw);
                    break;
                case 3:
                    System.out.println(" print isosceles triangle");
                    for (int i = 1; i < 6;i++){
                        for (int j = 6; j > i; j--){
                            draw +=" ";
                        }
                        for (int k = 1; k < i; k ++){
                            draw += "* ";
                        }
                        draw += "\n";
                    }
                    System.out.println(draw);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
