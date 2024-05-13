import java.util.Scanner;
public class pro4LeapYear {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any year to check whether its leap Year");
        int year = sc.nextInt();

        if ((year%4 ==0 && year%100 !=0) || year%400 ==0)
        {
            System.out.println(year + "--> is a leap year");
        }
        else{
            System.out.println(year + "--> is a Non-leap year");
        }
    }
}
