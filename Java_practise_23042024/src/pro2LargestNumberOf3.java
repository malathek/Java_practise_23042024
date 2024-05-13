import java.util.Scanner;
public class pro2LargestNumberOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 number, i will tell you which is Largest Number");
        int Num1 = sc.nextInt();
        int Num2 = sc.nextInt();
        int Num3 = sc.nextInt();

        int largeNum = 0;

        if (Num1 >= Num2){
            largeNum = Num1 > Num3 ? Num1: Num3;
        }
        else if(Num2 > Num1){
            largeNum = Num2 > Num3 ? Num2: Num3;
        }
        else{
            largeNum = Num3;
        }
        System.out.println("The largest Number is: "+largeNum);
    }
}
