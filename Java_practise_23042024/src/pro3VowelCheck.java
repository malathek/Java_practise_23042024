import java.util.Scanner;
public class pro3VowelCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any letter to check whether its vowel/Consonants");
        char letter = sc.next().charAt(0);
        
        if (letter == 'a' || letter == 'A' || letter == 'e'|| letter == 'E'|| letter == 'I' || letter == 'i' || letter
                == 'O' || letter == 'o' || letter == 'U' || letter == 'u')
        {
            System.out.println(letter + "-->  its vowel");
        }
        else{
            System.out.println(letter + "-->  its Consonant");
        }
    }
}
