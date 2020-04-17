import javax.naming.PartialResultException;
import java.util.Scanner;

public class listStudent {
    public static void main(String[] args) {
        String [] student = {"Dang","Doan","Dong","Dan","Hieu","Tuan","Vinh","Kieu Anh","Thuy","Huan"};

        // nhap ten can tim
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name's student: ");
        String input_name = sc.nextLine();

        // duyet mang, tim ten
        boolean isExist = false;
        for (int i = 0; i < student.length; i++){
            if (student[i].equals(input_name)){
                System.out.println("Position of the student in the list " + input_name +" is: " + (i + 1));
                isExist = true;
                break;
            }
        }
        if (!isExist){
            System.out.println("Not found " + input_name + " in the list.");
        }
    }
}
