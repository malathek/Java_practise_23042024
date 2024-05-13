import java.util.Scanner;
public class pro5PrimeNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number to check whether its Prime Number");
        int num = sc.nextInt();
        for (int i =2; i <= num; i++){

            if(num%i == 0 && num != i){
                System.out.println(num +" its NOT a prime number");
                break;
            }
            else {
                System.out.println(num +" its a prime number");
                break;

            }
        }
    }
}
