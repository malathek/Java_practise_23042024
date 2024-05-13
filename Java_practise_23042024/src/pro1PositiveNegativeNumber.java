import java.util.Scanner;
public class pro1PositiveNegativeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number, i will tell you whether its positive & Negative Number");
        int num_user = sc.nextInt();

        if(num_user == 0) {
            System.out.println("You entered Zero");
        }
        else if(num_user > 0) {
            System.out.println("You entered Positive Number");
        }
        else {
            System.out.println("You entered Negative Number");
        }

    }
}
